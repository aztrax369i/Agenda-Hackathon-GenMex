package org.theavengers.mx.contacto;

import java.util.ArrayList;

public class Contacto {
    //1.Atributos
    private String nombre;
    private String apellido;
    private String telefono;

    //2.Contructor
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //3.Getters - Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //4.Métodos de funcionalidad:
    //metodo-añadirContacto
    public String añadirContacto(Contacto c) {
        return "";
    }

    //metodo-existeContacto
    public boolean existeContacto(Contacto c) {
        return true;
    }

    //metodo-listaContaco (limite 10)
    public ArrayList<Contacto> listarContactos() {
        return ArrayList<Contacto>;
    }

    //metodo-buscarContacto
    public String buscarContacto(String nombre, String apellido, String telefono) {
        return "";
    }

    //metodo-eliminarContacto
    public String eliminarContacto(Contacto c) {
        listarContactos().remove(c);
        return "Contacto eliminado correctamente.";
    }

    //metodo-modificarContacto
    public String modificarContacto(String nombre, String apellido, String nuevoTelefono) {
        return "";
    }

    //metodo-agendaLlena
    public boolean agendaLlena(){
        boolean llena = listarContactos().size() >= 10;
        if(llena) {
            System.out.println("Agenda llena");
        }
        return llena;
    }

    //metodo-espacioLibres
    public String espacioLibres(){
        return "";
    }

    //5.toString
}
