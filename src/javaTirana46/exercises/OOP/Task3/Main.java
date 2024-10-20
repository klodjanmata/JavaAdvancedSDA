package javaTirana46.exercises.OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("white",true,4);
        System.out.println(circle.toString());
        System.out.println("Perimeter of circle is "+circle.getPerimeter());
        System.out.println("Area of circle is "+circle.getArea());

        Rectangle rectangle = new Rectangle("Cyan",false,3,5);
        System.out.println(rectangle.toString());
        System.out.println("Perimeter of rectangle is "+rectangle.getPerimeter());
        System.out.println("Area of rectangle is "+rectangle.getArea());

        Square square = new Square("Blue",true,7);
        System.out.println(square.toString());
        System.out.println("Perimeter of square is "+square.getPerimeter());
        System.out.println("Area of square is "+square.getArea());
    }
}
