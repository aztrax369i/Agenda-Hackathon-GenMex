package org.theavengers.mx.main;


import java.util.Scanner;
import org.theavengers.mx.contacto.Contacto;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== AGENDA TELEFÓNICA =====");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Comprobar si existe un contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Modificar teléfono");
            System.out.println("7. Comprobar si la agenda está llena");
            System.out.println("8. Consultar espacios libres");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Añadir contacto");
                    break;
                case 2:
                    System.out.println("Comprobar contacto");
                    break;
                case 3:
                    System.out.println("Listar contactos");
                    break;
                case 4:
                    System.out.println("Buscar contacto");
                    break;
                case 5:
                    System.out.println("Eliminar contacto");
                    break;
                case 6:
                    System.out.println("Modificar teléfono");
                    break;
                case 7:
                    System.out.println("Comprobar agenda llena");
                    break;
                case 8:
                    Contacto agenda = new Contacto("", "", 0);
                    System.out.println(agenda.espacioLibres());
                    break;
                case 9:
                    System.out.println("Saliendo de la agenda...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 9);

        entrada.close();
    }
}
