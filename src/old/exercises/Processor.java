package old.exercises;

import old.exercises.Interfaces.Printable;

public class Processor implements Printable {

    private String name;        // procesor name
    private int cores;          // number of cores

    public Processor(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", cores=" + cores +
                '}';
    }

    @Override
    public void print() {
        System.out.print(toString());
    }
}
