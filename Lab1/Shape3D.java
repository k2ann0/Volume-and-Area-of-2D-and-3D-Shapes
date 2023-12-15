package Lab1;

public abstract class Shape3D extends Shape2D{
    
    double depth;

    public Shape3D(double height, double width, double depth) {
        super(height, width);
        this.depth = depth;
    }

    public Shape3D(double radius, double height) {
        super(radius);
        depth = height;
    }

   public abstract double getVolume();

    public String toString(){
        return "Shape3D";
    }
    
}
