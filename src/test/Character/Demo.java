package test.Character;

public class Demo {


    public static void main(String[] args) {
        testCharStruct();
    }

    /**
     * 例子来自： https://zhuanlan.zhihu.com/p/35172335
     * 测试 char 类型在Java中的存储，以及其与Unicode编码的关系。
     * java 使用2个字节的UTF-16表示一个字符，因为最初的时候Unicode编码集不多，用2个字符就能表示全部。
     * 后来随着中文、韩文等语言加入Unicode，原来2个字符就不能表示了。就扩展到4个字节了。原来的2字节部分称为BMP( Basic Multilingual Plane ), 超过2个字节的叫做增量字符。
     */
    public static void testCharStruct() {
        // 已经不是Unicode BMP范围的字符了，属于增量扩展字符。java 中使用UTF-16 表示一个char. 所以这个字符需要一对char 组合才能表示。
        char[] chs = Character.toChars(0x10437);
        System.out.printf("高代理字符： %04x%n", (int) chs[0]);
        System.out.printf("低代理字符： %04x%n", (int) chs[1]);

        String str = new String(chs);
        // 在Java 中 使用UTF-16 编码方案，一个代码单元的长度是2个字节，
        // 所以这个case中的代码单元个数是2. 而在Unicode编码集中的码点数量肯定是1.
        // java 中 string 的长度，是个很有意思的点，后续再深入一下。
        System.out.println("代码单元长度： " + str.length());
        System.out.println("代码点数量：" + str.codePointCount(0, str.length()));
    }
}
