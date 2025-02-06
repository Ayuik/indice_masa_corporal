package dev.ayelen.indice_masa_corporal;

public class ResultMessage {

        public String returnDelgadezSevera(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else {
            return null;
        }
    }
}
