package uia.com.agenda;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Hola, iniciando la agenda, buena suerte");

        Agenda agenda = new Agenda();
        agenda = Menu.agregarEvento(agenda);
    }
}
