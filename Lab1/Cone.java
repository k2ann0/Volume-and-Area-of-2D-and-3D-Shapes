package Lab1;

public class Cone  extends Shape3D{

    public Cone(double radius, double height) {
        super(radius, height);
    }

    public double getVolume(){
        return PI * radius * radius * depth / 3;
    }

    public double getArea(){
        return PI * radius * (radius + Math.sqrt(Math.pow(depth, 2) + Math.pow(radius, 2)));
    }
    
}
