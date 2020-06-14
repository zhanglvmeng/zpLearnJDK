package test.HashcodeAndEqual;

public class Car {
    private int batch;

    public Car(int batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o instanceof Car) {
            Car c = (Car) o;
            return batch == c.batch;
        }
        return false;
    }

    public static void main(String[] args) {
        Car c1 = new Car(1);
        Car c2 = new Car(1);
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
    }


}
