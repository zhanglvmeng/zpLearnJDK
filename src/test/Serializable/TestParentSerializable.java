package test.Serializable;

import java.io.*;

public class TestParentSerializable {

    public String n = "aaaa";

//    TestParentSerializable (String n) {
//        this.n = n;
//    }

    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("result.obj2"));
            out.writeObject(new Child());
            out.close();

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream(
                    "result.obj2"));
            Child t = (Child) oin.readObject();
            oin.close();

            System.out.println(t.n);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Child extends TestParentSerializable implements Serializable {
    private String name;
}
