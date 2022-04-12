public abstract class I3DShape {
    public abstract double volume();
    public abstract double surfaceArea();

    protected double length;
    protected double height;
    protected double width;
    protected String name;

    // Constructor for creating a new instance of the object
    public I3DShape(String name, double length, double height, double width) {
        this.name = name;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
