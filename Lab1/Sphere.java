package Lab1;

public class Sphere  extends Shape3D{

    public Sphere(int depth , double radius){
        super(radius, depth);
    }

    public double getVolume(){
        return (4/3) * PI * radius * radius * radius;
    }

    public double getArea(){
        return 4 * PI * radius * radius;
    }
    
}
