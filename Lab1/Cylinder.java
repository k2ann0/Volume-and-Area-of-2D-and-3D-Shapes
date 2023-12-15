package Lab1;

public class Cylinder extends Shape3D {

    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    public double getVolume() {
        return PI * radius * radius * depth;
    }

  
    public double getArea() {
        return 2 * PI * radius * (radius + depth);
    }
    
}
