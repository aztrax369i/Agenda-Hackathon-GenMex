package org.theavengers.mx.contacto;

public class Contacto {
    //Atributos de la clase contacto
    private String nombre;
    private String apellido;
    private String telefono;

    //Constructor
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    //Getter y setters
    public String getNombre(){
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre)     {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Apellido: " + apellido +
                " | Teléfono: " + telefono;
    }
}