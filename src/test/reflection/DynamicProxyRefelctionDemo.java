package test.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyRefelctionDemo {

    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                    sayHi((String)args[0]);
                }
                return null;
            }
        };

        Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), new Class[] {Hello.class}, handler);
        hello.morning("zhangpeng");
    }

    interface Hello {
        void morning(String name);
    }

    public static void sayHi(String name) {
        System.out.println("hi " + name);
    }
}
