package dev.ayelen.indice_masa_corporal;

public class BodyMassIndex {

    public double calculateBMI(double wheight, double height) {
         return wheight / Math.pow(height, 2);
    }

    /* public double roundResult (double result) {
        if (result == Math.floor(result)) {
            return (double)Math.round(result * 10d) / 10d;
        } else {
        return result;
        }    } */

}
