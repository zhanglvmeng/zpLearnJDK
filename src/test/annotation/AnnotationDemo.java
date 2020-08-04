package test.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationDemo {

    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {

        Map<String, Object> map = new HashMap<>();

        Class<Test> clazz = Test.class;
        Method[] mtds = clazz.getMethods();
        for (Method method : mtds) {
            // 判断方法上有没有注解
            boolean hasAnno = method.isAnnotationPresent(CacheInMap.class);
            Object result = null;

            // 忽略不含注解的方法
            if (!hasAnno) {
                continue;
            }

            // 获取方法参数个数
            int paramCount = method.getParameterCount();
            if (paramCount == 0) {
                result = method.invoke(clazz.newInstance());
            } else if (paramCount == 1) {
                result = method.invoke(clazz.newInstance(), "aaa");
            }

            // 获取注解
            CacheInMap anno = method.getAnnotation(CacheInMap.class);
            if ("".equals(anno.key())) {
                String methodName = method.getName();
                map.put(methodName, result);
            } else {
                map.put(anno.key(), result);
            }
        }

        printMap(map);
    }

    public static void printMap(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(String.format("key:%s, value:%s", entry.getKey(), entry.getValue()));
        }
    }
}
