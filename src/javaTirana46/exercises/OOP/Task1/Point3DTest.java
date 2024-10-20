package javaTirana46.exercises.OOP.Task1;

public class Point3DTest {
    private float x;
    private float y;
    private float z;
    public Point3DTest(){ }
    public Point3DTest(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] XYZ={this.x,this.y,this.z};
        return XYZ;
    }
    public void setXYZ(float x,float y,float z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public String toString(){
        return "("+x+","+y+","+z+")";
    }
}