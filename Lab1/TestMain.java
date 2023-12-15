package Lab1;



// 8.12.23 Lab Soruları

public class TestMain {
    public static void main(String[] args) {
        
        // Shape2D 
        Circle circle = new Circle(5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 5);
        
        // Shape3D 
        Cylinder cylinder = new Cylinder(5, 5);
        Sphere sphere = new Sphere(5,5);
        Pyramid pyramid = new Pyramid(5, 5, 5);
        Cone cone = new Cone(5, 5);

        // toString 
        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
        System.out.println(cylinder.toString());
        System.out.println(sphere.toString());
        System.out.println(pyramid.toString());
        System.out.println(cone.toString());

        //getArea
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(cylinder.getArea());
        System.out.println(sphere.getArea());
        System.out.println(pyramid.getArea());

        // getVolume 
        System.out.println(cylinder.getVolume());
        System.out.println(sphere.getVolume());
        System.out.println(pyramid.getVolume());
        System.out.println(cone.getVolume());

        
        
        
    }
    
}
