package org.theavengers.mx.main;

import org.theavengers.mx.agenda.Agenda;
import org.theavengers.mx.contacto.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 👇 UNA sola agenda que persiste durante todo el programa
        Agenda agenda = new Agenda(10);
        int opcion = -1;

        do {
            System.out.println("\n===== BIENVENIDO A LA AGENDA =====");
            System.out.println("1.-Añadir nuevo contacto");
            System.out.println("2.-Ver Agenda");
            System.out.println("3.-Actualizar un contacto");
            System.out.println("4.-Eliminar un contacto");
            System.out.println("5.-Ver espacios libres en agenda");
            System.out.println("6.-Salir de la agenda");
            System.out.print("Ingresa la opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa el apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingresa el teléfono: ");
                    String telefono = scanner.nextLine();

                    Contacto nuevo = new Contacto(nombre, apellido, telefono);
                    agenda.addContacto(nuevo);
                    break;

                    case 2:
                    agenda.verAgenda();
                    break;


                case 3:
                    System.out.print("Nombre del contacto a actualizar: ");
                    String nombreBuscar = scanner.nextLine();
                    System.out.print("Apellido del contacto a actualizar: ");
                    String apellidoBuscar = scanner.nextLine();

                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    System.out.print("Nuevo teléfono: ");
                    String nuevoTelefono = scanner.nextLine();

                    Contacto actualizado = new Contacto(nuevoNombre, nuevoApellido, nuevoTelefono);
                    agenda.actualizarContacto(nombreBuscar, apellidoBuscar, actualizado);
                    break;


                case 4:
                    System.out.print("Nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    System.out.print("Apellido del contacto a eliminar: ");
                    String apellidoEliminar = scanner.nextLine();

                    agenda.eliminarContacto(nombreEliminar, apellidoEliminar);
                    break;

                case 5:
                    System.out.println("Espacios libres: " + agenda.getEspaciosLibres()
                            + " de " + agenda.getCapacidad());
                    break;


                case 6:
                    System.out.println("Saliendo de la agenda... ¡hasta pronto!");
                    break;
                    default:
                    System.out.println("Opción invalida, por favor selecciona una de las opciónes mostradas");
            }

        } while (opcion != 6);
        scanner.close();
    }
}