package test.annotation;

class Test {

    @CacheInMap(key = "qwer")
    public String method1(String str) {
        return "This is Method1, param is " + str;
    }

    @CacheInMap
    public int method2() {
        return 1024;
    }

    public double method3() {
        return 3.141592653;
    }
}