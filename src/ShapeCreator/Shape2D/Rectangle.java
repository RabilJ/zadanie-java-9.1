package ShapeCreator.Shape2D;

public class Rectangle extends GeometricShape {
    private double width;
    private double lenght;

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(String name, double width, double lenght) {
        super(name);
        this.width = width;
        this.lenght = lenght;
    }
}
