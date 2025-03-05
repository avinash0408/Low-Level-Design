package Builder;

class Desktop{
    private String ram;
    private String motherBoard;
    private String memory;
    private String processor;

    public void display() {
        System.out.println("Desktop Specs:");
        System.out.println("Motherboard: " + motherBoard);
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Ram: " + ram);
    }

    public String getRam(){
        return ram;
    }

    public String getMotherBoard() {
        return motherBoard;
    }

    public String getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}

abstract class DesktopBuilder{
    protected Desktop desktop = new Desktop();

    public abstract void buildRam();
    public abstract void buildMotherBoard();
    public abstract void buildMemory();
    public abstract void buildProcessor();
    
    public Desktop getDesktop(){
        return desktop;
    }
}
class macDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildMemory() {
        desktop.setMemory("MAC Memory");
    }

    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("MAC MotherBoard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("MAC Processor");   
    }

    @Override
    public void buildRam() {
        desktop.setRam("MAC Ram");
    }
    
}

class dellDesktopBuilder extends DesktopBuilder{

    @Override
    public void buildMemory() {
        desktop.setMemory("DELL Memory");
    }

    @Override
    public void buildMotherBoard() {
        desktop.setMotherBoard("DELL MotherBoard");
    }

    @Override
    public void buildProcessor() {
        desktop.setProcessor("DELL Processor");   
    }

    @Override
    public void buildRam() {
        desktop.setRam("DELL Ram");
    }
    
}

class Director{
    public Desktop buildDesktopBuilder(DesktopBuilder builder){
        builder.buildMemory();
        builder.buildMotherBoard();
        builder.buildProcessor();
        builder.buildRam();
        return builder.getDesktop();
    }
}

public class Client {
    public static void main(String[] args) {
        Director dir = new Director();
        DesktopBuilder macDesktopBuilder = new macDesktopBuilder();
        Desktop macDesktop = dir.buildDesktopBuilder(macDesktopBuilder);
        DesktopBuilder dellDesktopBuilder = new dellDesktopBuilder();
        Desktop dellDesktop = dir.buildDesktopBuilder(dellDesktopBuilder);

        macDesktop.display();
        dellDesktop.display();
    }
}
