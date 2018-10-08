package ShapeCalc;


import ShapeCreator.Shape2D.Circle;
import ShapeCreator.Shape2D.Line2D;
import ShapeCreator.Shape2D.Rectangle;
import ShapeCreator.Shape3D.Ball;
import ShapeCreator.Shape3D.Cube;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    @Override
    public double lineLenght(Line2D line) {
        double lenght = Math.sqrt(Math.pow(line.getX2()-line.getX1(),2)+Math.pow(line.getY2()-line.getY1(),2));
        return lenght;
    }

    @Override
    public double circleArea(Circle circle) {
        double field = Math.PI*(Math.pow(circle.getRadius(),2));
        return field;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        double field = rectangle.getLenght()*rectangle.getWidth();
        return field;
    }

    @Override
    public double cubeVolume(Cube cube) {
        double volume = cube.getHeighth()*cube.getLenght()*cube.getWidth();
        return volume;
    }

    @Override
    public double ballVolume(Ball ball) {
        double volume = 1.34*Math.PI*(Math.pow(ball.getRadius(),3));
        return volume;
    }
}
