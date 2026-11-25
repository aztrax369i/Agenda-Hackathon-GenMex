package org.theavengers.mx.contacto;

import java.util.ArrayList;

public class Contacto {
    //1.Atributos
    private String nombre;
    private String apellido;
    private int telefono;

    //2.Contructor
    public Contacto(String nombre, String apellido, int telefono) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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
        return ArrayList;
    }

    //metodo-buscarContacto
    public String buscarContacto(String nombre, String apellido, int telefono) {
        return "";
    }

    //metodo-eliminarContacto
    public String eliminarContacto(Contacto c) {
        return "";
    }

    //metodo-modificarContacto
    public String modificarContacto(String nombre, String apellido, String nuevoTelefono) {
        return "";
    }

    //metodo-agendaLlena
    public String agendaLlena(){
        return "";
    }

    //metodo-espacioLibres
    public String espacioLibres(){
        return "";
    }

    //5.toString
}
