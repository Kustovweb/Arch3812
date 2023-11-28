package ModelElements;
import Stuff.Angle3D;
import Stuff.Point3D;
import Stuff.Color;

public class Flash {
    Point3D location;
    Angle3D angle;
    Color color;
    float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }
    public void Rotate(Angle3D angle) {}
    public void Move(Point3D location) {}

    
}
