package Lab1;

public class Pyramid extends Shape3D {

    public Pyramid(int depth, int height, int width) {
        super(height, width, depth);
    }

    public double getVolume() {
        return (height * width * depth) / 3;
    }

    public double getArea() {
        return (width * depth) + (width * Math.sqrt(Math.pow(depth / 2, 2) + Math.pow(height, 2))) + (depth * Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2)));
    }
    
}
