public class Main {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double rectangleArea = rectangle.getArea();
        System.out.println("The area of the rectangle is: " + rectangleArea);

        Triangle triangle = new Triangle(5, 5);
        double triangleArea = triangle.getArea();
        System.out.println("The area of the triangle is: "+ triangleArea);

        Triangle secondTriangle = new Triangle(5, 5, 5);
        double secondTriangleArea = secondTriangle.getArea();
        System.out.println("The area of the second triangle is: "+ secondTriangle.getArea());
    }
}

