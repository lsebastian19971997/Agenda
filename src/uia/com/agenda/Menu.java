package uia.com.agenda;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    static Agenda agregarEvento(Agenda agenda){
        String contacto;
        String tipo;
        String fecha;
        String fechaRecordatorio;
        String nombre;
        String cadena;
        System.out.println("Ingresa el contacto");
        contacto = sc.nextLine();
        System.out.println("Ingresa el tipo de evento");
        tipo = sc.nextLine();
        System.out.println("Ingresa la fecha");
        fecha = sc.nextLine();
        System.out.println("Ingresa la fecha de recordatorio");
        fechaRecordatorio = sc.nextLine();
        System.out.println("Ingresa el nombre");
        nombre = sc.nextLine();

        cadena= contacto + "," + tipo + "," + fecha +"," + fechaRecordatorio + "," + nombre;
        agenda.agregaEvento(cadena);
        return agenda;
    }
}
