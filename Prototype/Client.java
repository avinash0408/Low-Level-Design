package Prototype;

class Desktop{
    private String name;
    private String ram;
    private String memory;
    public String getName() {
        return name;
    }
    public String getRam() {
        return ram;
    }
    public String getMemory() {
        return memory;
    }
    public Desktop(String name, String ram, String memory) {
        this.name = name;
        this.ram = ram;
        this.memory = memory;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public Desktop getClone(){
        return new Desktop(name, ram, memory);
    }
    void printSpecs(){
        System.out.println(name);
        System.out.println(memory);
        System.out.println(ram);
    }
}

public class Client {
    public static void main(String[] args) {
        Desktop hp = new Desktop("HP", "4GB", "128GB");
        hp.printSpecs();
        Desktop hpClone = hp.getClone();
        hpClone.printSpecs();
    }    
}
