package javaTirana46.exercises.Task3;

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.isFilled = filled;
    }

    @Override
    public String toString() {
        String value = "Shape with color of "
                + color + " and ";
        if (isFilled){
            value += "filled";
        }
        else {
            value += "not filled";
        }
//        value = "Shape with color of "
//                + color + " and "
//                + (isFilled ? "filled" : "not filled");
        return value;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}
