package ShapeCalc;

import ShapeCreator.Shape2D.Circle;
import ShapeCreator.Shape2D.Rectangle;

public interface Calc2D {
    public abstract double circleArea(Circle circle);
    public abstract double rectangleArea(Rectangle rectangle);
}
