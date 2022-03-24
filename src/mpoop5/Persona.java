/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase que construye una Persona
 * @author alumno
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
    
    /**
     * Constructor vacio
     */
    public Persona() {
    }
    /**
     * Constructor que recibe nombre, apellido y fNacimiento
     * @param nombre El nombre de la persona
     * @param apellido El apellido de la persona
     * @param fNacimiento La fecha de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param nombre El nombre de la persona
     * @param apellido El apellido de la persona
     * @param dia El día de la fecha de nacimiento de la persona
     * @param mes El mes de la fecha de nacimiento de la persona
     * @param año El año de la fecha de nacimiento de la persona
     */
    public Persona(String nombre, String apellido, int dia, int mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia,mes,año);
    }

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

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * Método que imprime el nombre, apellido y fecha de nacimiento de una persona
     * @return el nombre, el apellido y la fecha de nacimiento de una persona
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + '}';
    }
  
}
