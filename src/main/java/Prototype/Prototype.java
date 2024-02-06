package Prototype;

public class Prototype implements Cloneable {
    private String prototypeName;

    public Prototype(String prototypeName) {
        this.prototypeName = prototypeName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Prototype(this.prototypeName);
    }

    public String getPrototypeName() {
        return prototypeName;
    }
}