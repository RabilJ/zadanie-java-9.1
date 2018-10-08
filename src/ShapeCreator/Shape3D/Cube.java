package ShapeCreator.Shape3D;

public class Cube extends Shape3D {
    private double lenght;
    private double width;
    private double heighth;

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

    public double getHeighth() {
        return heighth;
    }

    public void setHeighth(double heighth) {
        this.heighth = heighth;
    }

    public Cube(String name, double lenght, double width, double heighth) {
        super(name);
        this.lenght = lenght;
        this.width = width;
        this.heighth = heighth;
    }
}
