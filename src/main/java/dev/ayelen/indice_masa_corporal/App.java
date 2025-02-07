package dev.ayelen.indice_masa_corporal;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Person person = new Person(53, 1.67);
        BodyMassIndex bodyMassIndex = new BodyMassIndex();
        double imc = bodyMassIndex.calculateBMI(person.getWheight(), person.getHeight());
        ResultMessage resultMessage = new ResultMessage();
        String message = resultMessage.giveMessage(imc);
        System.out.println(message);
    }
}
