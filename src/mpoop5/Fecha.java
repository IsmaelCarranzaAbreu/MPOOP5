/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase que asigna una Fecha 
 * @author alumno
 */
public class Fecha {
    
    private int dia, mes, año;
    
    /**
     * Constructor vacio
     */
    public Fecha() {
    }
    /**
     * Constructor que recibe día, mes y año
     * @param dia El día de una fecha de nacimiento 
     * @param mes El mes de una fecha de nacimiento 
     * @param año El año de una fecha de nacimiento 
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    /**
     * Método que imprime el día, mes y año de una fecha
     * @return el valor del día, mes y año de una fecha
     */
    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }
    
}
