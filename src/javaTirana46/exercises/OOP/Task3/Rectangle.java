package javaTirana46.exercises.OOP.Task3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        String output = "";
        if(width == length){
            output += "Square with width = " + width ;
        }
        else {
            output = "Rectangle with width = " + width +
                    " and length = " + length;
        }
        output += " which is a subclass of " + super.toString();
        return output;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
