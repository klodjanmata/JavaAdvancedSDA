package old.exercises;

import old.exercises.Interfaces.Printable;

public class Computer implements Printable {

    // mandatory fields
    private String motherboard;     // motherboard
    private Processor processor;
    private int ram;                // amount of RAM

    // additional fields
    private int hd;                 // disk size in GB
    private String monitor;         // producer name
    private String printer;         // printer name

    public Computer(){

    }

    public Computer(String motherboard, Processor processor){
        this.motherboard = motherboard;
        this.processor = processor;
    }

    public Computer(String motherboard, Processor processor, int ram) {
        this(motherboard, processor);
        this.ram = ram;

    }

    public Computer(String motherboard, Processor processor, int ram, int hd, String monitor, String printer) {
        this(motherboard, processor, ram);
        this.hd = hd;
        this.monitor = monitor;
        this.printer = printer;
    }

    public void printParameters(){
        System.out.print(toString());
    }

    public String getMotherboard(){
        return motherboard;
    }

    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }

    public Processor getProcessor(){
        return processor;
    }

    public void setProcessor(Processor processor){
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        if(monitor.length() < 3){
            System.out.println("\n\nTe dhena te gabuara per monitorin!");
            return;
        }
        this.monitor = monitor;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        if(printer.length() < 3){
            System.out.println("\n\nTe dhena te gabuara per printerin!");
            return;
        }
        this.printer = printer;
    }

    @Override
    public String toString() {
        return "old.exercises.Computer{\n" +
                "motherboard='" + motherboard + '\'' + '\n' +
                ", processor=" + processor.toString() + '\n' +
                ", ram=" + ram + '\n' +
                ", hd=" + hd + '\n' +
                ", monitor='" + monitor + '\'' + '\n' +
                ", printer='" + printer + '\'' + '\n' +
                '}';
    }

    @Override
    public void print() {
        System.out.print("old.exercises.Computer parameters: \n" + toString());

    }
}