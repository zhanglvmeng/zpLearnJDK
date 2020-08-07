package test.clone;

public class Head implements Cloneable {
    public Face face;

    Head(Face face) {
        this.face = face;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Head head = (Head) super.clone();
        head.face = (Face) this.face.clone();
        return head;
    }
}
