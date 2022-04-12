public class Sphere extends I3DShape {

    public double radius;

    @Override
    public double volume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public Sphere(double length, double height, double width) {
        super("Sphere", length, height, width);
        this.radius = width/2;
    }
}
