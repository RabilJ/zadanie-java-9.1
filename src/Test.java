import ShapeCalc.ShapeCalculator;
import ShapeCreator.Shape;
import ShapeCreator.Shape2D.Circle;
import ShapeCreator.Shape2D.Line2D;
import ShapeCreator.Shape2D.Rectangle;
import ShapeCreator.Shape3D.Ball;

public class Test {
    public static void main(String[] args) {
        Shape line1 = new Line2D("Linia",-2,-4,-5,-6);
        Shape rect1 = new Rectangle("Prostokąt",2,10);
        Shape circle1 = new Circle("Koło",6);
        Shape ball1 = new Ball("Kula",7);

        ShapeCalculator sc = new ShapeCalculator();
        sc.lineLenght((Line2D) line1);
        sc.ballVolume((Ball) ball1);





    }
}
