package dev.ayelen.indice_masa_corporal;

public class BodyMassIndex {

    public double calculateBMI(double wheight, double height) {
         return wheight / Math.pow(height, 2);
    }
}
