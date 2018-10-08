package ShapeCalc;

import ShapeCreator.Shape3D.Ball;
import ShapeCreator.Shape3D.Cube;

public interface Calc3D {
    public abstract double ballVolume(Ball ball);
    public abstract double cubeVolume(Cube cube);
}
