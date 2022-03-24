/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase que construye un Coche  
 * @author alumno
 */
public class Coche {
    
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private  int modeloAño;
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;

    /**
     * Constructor vacio
     */
    public Coche() {
    }
    /**
     * Constructor que recibe marca, color, placa, numPuertas, modeloAño, chofer, copiloto, pasajero1 y pasajero2
     * @param marca La marca del auto
     * @param color El color del auto
     * @param placa El número de placa del auto
     * @param numPuertas El número de puertas del auto
     * @param modeloAño El año de fabricacion del auto
     * @param chofer Nombre, Apellido y fecha de nacimiento del chofer
     * @param copiloto Nombre, Apellido y fechs de nacimiento del copiloto
     * @param pasagero1 Nombre, Apellido y fecha de nacimiento del primer pasajero
     * @param pasagero2 Nombre, Apellido y fecha de nacimiento del segundo pasajero
     */
    public Coche(String marca, String color, int placa, int numPuertas, int modeloAño, 
            Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAño = modeloAño;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getModeloAño() {
        return modeloAño;
    }

    public void setModeloAño(int modeloAño) {
        this.modeloAño = modeloAño;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasagero1) {
        this.pasajero1 = pasagero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasagero2) {
        this.pasajero2 = pasagero2;
    }
    
    /**
     * Método que indica que está encendido el auto
     */
    public void encender(){
        System.out.println("Estoy encendido");
    }
    /**
     * Método que indica que está apagado el auto
     */
    public void apagar(){
        System.out.println("Ma voy a apagar");
    }
    /**
     * Método que indica que está frenando el auto
     */
    public void frenar(){
        System.out.println("Frenando");
    }
    /**
     * Método que indica que se está accionando el claxon del auto
     */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
    /**
     * Método que indica la velocidad que lleva el auto
     * @param velocidad El kilometraje que lleva el auto
     */
    public void acelerar(int velocidad){
        System.out.println("Voy a una velocidad de: "+velocidad+" km/h");
    }
    /**
     * Método que imprime la marca, color, placa, numPuertas, modeloAño, chofer, copiloto, pasajero1 y pasajero2 de un auto
     * @return el valor de la marca, color, placa, numPuertas, modeloAño, chofer, copiloto, pasajero1 y pasajero2 del auto
     */
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + 
                ", placa=" + placa + ", numPuertas="
                + numPuertas + ", modeloA\u00f1o=" + modeloAño + 
                ", \n\nChofer=" + chofer + ", \nCopiloto=" +
                copiloto + ", \nPasajero1=" + pasajero1 + 
                ", \nPasajero2=" + pasajero2 + '}'+"\n\nMétodos:";
    }
}
