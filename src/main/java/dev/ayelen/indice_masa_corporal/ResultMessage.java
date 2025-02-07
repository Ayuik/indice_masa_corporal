package dev.ayelen.indice_masa_corporal;

public class ResultMessage {

    public String giveMessage(double imc) {

        boolean delgadezSevera = imc < 16;
        boolean delgadezModerada = imc >= 16 && imc < 17;
        boolean delgadezLeve = imc >= 17 && imc < 18.5;
        boolean pesoNormal = imc >= 18.5 && imc < 25;
        boolean sobrepeso = imc >= 25 && imc < 30;
        boolean obesidadLeve = imc >= 30 && imc < 35;
        boolean obesidadModerada = imc >= 35 && imc < 40;
        boolean obesidadMorbida = imc >= 40;

        if (delgadezSevera)
            return "Delgadez severa";
        if (delgadezLeve)
            return "Delgadez leve";
        if (delgadezModerada)
            return "Delgadez moderada";
        if (pesoNormal)
            return "Peso normal";
        if (sobrepeso)
            return "Sobrepeso";
        if (obesidadLeve)
            return "Obesidad leve";
        if (obesidadModerada)
            return "Obesidad moderada";
        if (obesidadMorbida)
            return "Obesidad morbida";

        return "Valor invalido";
    }

}
