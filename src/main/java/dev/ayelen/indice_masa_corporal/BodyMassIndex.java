package dev.ayelen.indice_masa_corporal;

public class BodyMassIndex {

    public double calculateBMI(double wheight, double height) {
        double result = wheight / Math.pow(height, 2);
        return (double)Math.round(result * 10d) / 10d;
    }

}
