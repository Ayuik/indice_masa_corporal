package dev.ayelen.indice_masa_corporal;

public class ResultMessage {

        public String returnDelgadezSevera(double imc) {
            if (imc < 16) {
                return "Delgadez severa";
            } else {
                return null;
            }
        }   

        public String returnDelgadezModerada(double imc) {
            if (imc >= 16 && imc < 17) {
                return "Delgadez moderada";
            } else {
                return null;
            }
        }

        public String returnDelgadezLeve(double imc) {
            if (imc >= 17 && imc < 18.5) {
                return "Delgadez leve";
            } else {
                return null;
            }
        }
}
