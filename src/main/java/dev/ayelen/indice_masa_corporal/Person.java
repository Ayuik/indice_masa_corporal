package dev.ayelen.indice_masa_corporal;

public class Person {
    private double wheight;
    private double height;
    
    public Person(double wheight, double height) {
        this.wheight = wheight;
        this.height = height;
    }
    
    public double getHeight() {
        return height;
    }

    public double getWheight() {
        return wheight;
    }

    public void setWheight(double wheight) {
        this.wheight = wheight;
    }
    
}
