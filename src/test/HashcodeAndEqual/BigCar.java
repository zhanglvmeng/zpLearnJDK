package test.HashcodeAndEqual;

import java.math.BigDecimal;

public class BigCar extends Car {


    private int count;

    public BigCar(int batch, int count) {
        super(batch);
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        BigCar bc = (BigCar) o;
        if (super.equals(o) && this.count == bc.count) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BigCar bc1 = new BigCar(1, 1);
        BigCar bc2 = new BigCar(1, 2);
        System.out.println(bc1 == bc2); // 增加自己的equals 之前，跟之后 都是false.
        System.out.println(bc1.equals(bc2)); // 增加自己的equals 之前，结果是true, 复用了父类的equals 方法。 增加自己equals之后 是false.
    }
}
