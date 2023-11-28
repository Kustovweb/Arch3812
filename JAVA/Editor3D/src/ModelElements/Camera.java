package ModelElements;
import Stuff.Point3D;
import Stuff.Angle3D;


public class Camera {
    Point3D location;
    Angle3D angle;

   
    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void Rotate(Angle3D angle){}

    public void Move(Point3D location){}
    
}
