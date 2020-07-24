package test.bit;

/**
 * 计算sortField
 * | 4bit sourceType | 1bit order | 59bit 具体值 |
 * |<- 4bit->|<-1bit->|<-                      59bit                                            ->|
 *  0000        1        000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
 */
public class BitDemo {
    // 时间戳占用的位数
    private static int timeBits = 59;

    /**
     * 获取 order 时，需要参与 "与运算"的值
     * 0000 1000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
     */
    private static long orderMask = 0x0800000000000000l;

    /**
     * 获取时间戳时, 需要参与 "与运算"的值
     * 0000 0111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111
     */
    private static long timestampMask = 0x07ffffffffffffffl ;

    /**
     * 获取type时, 需要参与 "与运算"的值
     * 1111 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000
     */
    private static long sourceTypeMask = 0xf000000000000000l ;

    // order 正序、倒序，栈占1位。  1 正序， 0 倒序。
    private static int orderBits = 1;
    // 类型占位，暂留4位，
    private static int typeBits = 4;

    public static void main(String[] args) {
        testBasic();
    }

    public static void testBasic () {
        long s = 1595575474847l;
        long sort = getSort(1, 1, s);
        System.out.println("sort field is " + sort);
        System.out.println("type is " + getSourceType(sort));
        System.out.println("order is " + getOrder(sort));
        System.out.println("timestamp is " + getTimestamp(sort));
    }

    /**
     * 根据内容类型，排序规则， 时间戳  获取排序字段
     * @param sourceType
     * @param order
     * @param timestamp
     * @return
     */
    public static long getSort(long sourceType, long order, long timestamp) {
        long result = 0;
        sourceType = sourceType << timeBits + orderBits;
        result |= sourceType;
        order = order << timeBits;
        result |= order;
        result |= timestamp;
        return result;
    }

    /**
     * 根据sortField 反算 type
     * @param sortField
     * @return
     */
    public static long getSourceType (long sortField) {
        return (sortField & sourceTypeMask) >> (timeBits + orderBits);
    }

    /**
     * 根据sortField 反算 order type
     * @param sortField
     * @return
     */
    public static long getOrder (long sortField) {
        return  (sortField & orderMask) >> timeBits ;
    }

    /**
     * 根据sortField 反算 时间戳
     * @param sortField
     * @return
     */
    public static long getTimestamp (long sortField) {
        return sortField & timestampMask;
    }
}
