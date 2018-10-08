package ShapeCreator.Shape3D;

public class Ball extends Shape3D {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Ball(String name, double radius) {
        super(name);
        this.radius = radius;
    }
}
