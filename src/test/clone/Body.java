package test.clone;

public class Body implements Cloneable {
    public Head head;
    public Body () {}
    public Body (Head head) {
        this.head = head;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body newBody = (Body) super.clone();
        newBody.head = (Head) head.clone();
        return newBody;
    }
}
