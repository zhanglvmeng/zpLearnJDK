package test.StreamAndLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        TestStream testStream = new TestStream();
        List<InnerClass> innerClassList = testStream.getClassList();
        System.out.println("===========sum test===========");
        // 加和
        int sum = innerClassList.stream().filter(t -> t.getValue() > 2).mapToInt(t -> t.getValue()).sum();
        System.out.println("大于2 的数据的和: " + sum);

        System.out.println("===========list to set===========");
        // list to set
        Set<InnerClass> settt = innerClassList.stream().collect(Collectors.toSet());
        settt.forEach(s -> System.out.println(s.name));

        System.out.println("===========list to map===========");
        // list to map
        Map<String, Integer> mappp = innerClassList.stream().collect(Collectors.toMap(InnerClass::getName, InnerClass::getValue));
        mappp.forEach( (k,v) -> System.out.println("name: " + k + ", value: " + v));




    }

    public List<InnerClass> getClassList () {
        List<InnerClass> testClassList = new ArrayList<>();
        InnerClass innerClass = new InnerClass("zp", 1);
        InnerClass innerClass2 = new InnerClass("zp2", 2);
        InnerClass innerClass3 = new InnerClass("zp3", 3);
        InnerClass innerClass4 = new InnerClass("zp4", 4);
        InnerClass innerClass5 = new InnerClass("zp5", 5);
        InnerClass innerClass6 = new InnerClass("zp6", 6);
        testClassList.add(innerClass);
        testClassList.add(innerClass2);
        testClassList.add(innerClass3);
        testClassList.add(innerClass4);
        testClassList.add(innerClass5);
        testClassList.add(innerClass6);
        return testClassList;
    }

    class InnerClass {
        private String name;
        private int value;

        InnerClass(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

        public String getName() {
            return this.name;
        }
    }
}
