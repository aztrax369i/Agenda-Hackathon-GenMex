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

}