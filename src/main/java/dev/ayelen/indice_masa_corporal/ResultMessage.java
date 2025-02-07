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

        public String returnPesoNormal(double imc) {
            if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            } else {
                return null;
            }
        }

        public String returnSobrepeso(double imc) {
            if (imc >= 25 && imc < 30) {
                return "Sobrepeso";
            } else {
                return null;
            }
        }

        public String returnObesidadLeve(double imc) {
            if (imc >= 30 && imc < 35) {
                return "Obesidad leve";
            } else {
                return null;
            }
        }
}
