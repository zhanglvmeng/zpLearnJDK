package test.function;

import java.util.function.Function;

/**
 * todo Function 返回 实体类的问题。
 */
public class FunctionDemo {


    public static void main(String[] args) {
        Function<Integer, Double> h = a -> a / 2.0;
        h = h.andThen(a -> a * 3);

        System.out.println(get(10, h));
    }

    private static Double get(int arg0, Function<Integer, Double> function) {
        return function.apply(arg0);
    }
}
