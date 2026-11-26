package org.theavengers.mx.agenda;

import org.theavengers.mx.contacto.Contacto;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    //Atributos agenda
    private List<Contacto> listContacto; //Creamos una lista tipo contacto
    private int capacidad; //Creamos una variable para ir guardando la capacidad de los contactos

    //constructor
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.listContacto = new ArrayList<>();
    }

    // Metodo Añadir  contacto----------
    public Contacto addContacto(Contacto c) {
        //Validamos si esta llena la agenda
        if (estaLlena()) {
            System.out.println("La agenda está llena (capacidad de la agenda: " + capacidad + ")");
            return null;
        }
        if (existeContacto(c)) {
            System.out.println("Error al agregar el usuario: ya existe un contacto con ese nombre y apellido");
            return null;
        }
        listContacto.add(c);
        System.out.println("Contacto añadido: " + c.getNombre() + " " + c.getApellido());
        return c;
    }
    //Metodo existeContacto
    public boolean existeContacto(Contacto c) {
        for (Contacto actual : listContacto) {
            if (actual.getNombre().equalsIgnoreCase(c.getNombre())
                    && actual.getApellido().equalsIgnoreCase(c.getApellido())) {
                return true;
            }
        }
        return false;
    }

    //Metodo Ver agenda ----------
    public void verAgenda() {
        if (listContacto.isEmpty()) {
            System.out.println("La agenda está vacía");
            return;
        }
        System.out.println("Contactos en la agenda:");
        for (int i = 0; i < listContacto.size(); i++) {
            System.out.println((i + 1) + ". " + listContacto.get(i));
        }
    }


    // Metodo Actualizar contacto ----------
    public boolean actualizarContacto(String nombre, String apellido, Contacto nuevo) {
        for (int i = 0; i < listContacto.size(); i++) {
            Contacto actual = listContacto.get(i);
            if (actual.getNombre().equalsIgnoreCase(nombre)
                    && actual.getApellido().equalsIgnoreCase(apellido)) {
                listContacto.set(i, nuevo);
                System.out.println("Contacto actualizado correctamente");
                return true;
            }
        }
        System.out.println("No se encontró un contacto con ese nombre y apellido");
        return false;
    }



    // Metodo Eliminar contacto----------
    public boolean eliminarContacto(String nombre, String apellido) {
        for (int i = 0; i < listContacto.size(); i++) {
            Contacto actual = listContacto.get(i);
            if (actual.getNombre().equalsIgnoreCase(nombre)
                    && actual.getApellido().equalsIgnoreCase(apellido)) {
                listContacto.remove(i);
                System.out.println("Contacto eliminado correctamente");
                return true;
            }
        }
        System.out.println("No se encontró un contacto con ese nombre y apellido");
        return false;
    }

    //  Metodo  Espacios libres ----------
    public int getEspaciosLibres() {
        return capacidad - listContacto.size();
    }

    public boolean estaLlena() {
        return listContacto.size() >= capacidad;
    }


    public int getCapacidad() {
        return capacidad;
    }

}