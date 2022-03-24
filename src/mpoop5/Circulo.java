/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 *Clase que realiza el cálculo de perímetro y área de un círculo
 * @author alumno
 */
public class Circulo {
    
    public final float PI= 3.1416f;
    private float radio;
    /**
     * constructor vacío
     */
    public Circulo() {
        
    }
    /**
     * Método que asigna el valor del radio de un círculo
     * @param radio Valor del radio
     */
    public Circulo(float radio){
        this.radio=radio;
        
    }
    /**
     * Método que calcula el perímetro de un círculo
     */
    
    public void perimetro(){
        float perimetro = 2* PI* radio;
        System.out.println("Perímetro= "+perimetro);
    }
    
    /**
     * Método que calcula el área de un círculo
     */
    public void area(){
        System.out.println("Área= " +(PI*radio*radio) );
    }
    
    public float getRadio(){
        return radio;
    }
    public void setRadio(float  radio){
        
        this.radio=Math.abs(radio);
        
    }
    /**
     * Método que imprime el valor del radio del círculo
     * @return El valor del radio
     */
    public String toString(){
        return "Círculo {radio= "+ radio +"}";
    }
    
    
}
