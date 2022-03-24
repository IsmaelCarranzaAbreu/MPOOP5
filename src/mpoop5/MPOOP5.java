/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 *
 * @author alumno
 */
public class MPOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo cir1 = new Circulo();
       //cir1.radio=5;
        cir1.setRadio(5);
       
       
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.perimetro();
    
        System.out.println(cir1.toString());
        System.out.println(cir1);
        
        System.out.println("---------------------");
        Circulo cir2 = new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        System.out.println("----------Coche---------");
        Coche coche =new Coche();
        System.out.println(coche);
        
        
        System.out.println("-------------Personas-----------");
        Persona per1 = new Persona();
        per1.setNombre("Panchito");
        per1.setApellido("Lopez");
        //per1.setfNacimiento(fNacimiento);
        System.out.println(per1);
       
        Fecha fecha = new Fecha(6,7,2001);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
       
        System.out.println("-----------");
        Persona per2 = new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Aguilar");
        per2.setfNacimiento(new Fecha(15,6,2002));
        System.out.println(per2);
     
        System.out.println("-----------");
        Persona per3 = new Persona("Alan","Martinez",new Fecha(16,2,2002));
        System.out.println(per3);
        
        Persona per4 = new Persona("Sofia","Hernandez",21,9,1999);
        System.out.println(per4);
        
        
       System.out.println("\n\n--------------Composición Carro-------------");
        Persona chofer = new Persona("Ismael","Carranza",new Fecha(15,12,2002));
        Persona copiloto = new Persona("Yuritzi","Baza", new Fecha(28,2,2001));
        Persona pasajero1 = new Persona("Alfonso Santiago","Valdes",new Fecha(21,6,2002));
        Persona pasajero2 = new Persona("Manuel","Chimal",new Fecha(28,7,1983));
        
        
        
        Coche coche1 = new Coche();
        coche1.setColor("blanco");
        coche1.setMarca("Chevrolet");
        coche1.setModeloAño(2010);
        coche1.setNumPuertas(4);
        coche1.setPlaca(9102019);
        coche1.setChofer(chofer);
        coche1.setCopiloto(copiloto);
        coche1.setPasajero1(pasajero1);
        coche1.setPasajero2(pasajero2);
        
        System.out.println(coche1);
        
        coche1.acelerar(50);
        coche1.apagar();
        coche1.encender();
        coche1.frenar();
        coche1.tocarClaxon();
    }  
}
