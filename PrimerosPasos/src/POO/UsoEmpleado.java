/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.*;

/**
 *
 * @author p84029437
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciar utres (3) objetos de tipo Empleado.
//        Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1900, 12, 17);
//        
//        Empleado empleado2 = new Empleado("Ana López", 95000, 1899, 6, 2);
//        
//        Empleado empleado3 = new Empleado("Lucía Méndez", 105000, 1905, 3, 15);
//        
//        empleado1.subeSueldo(5);
//        
//        empleado2.subeSueldo(5);
//        
//        empleado3.subeSueldo(5);
//        
//        System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()
//        + " Fecha de Alta: " + empleado1.dameFechaContrato());
//        
//        System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()
//        + " Fecha de Alta: " + empleado2.dameFechaContrato());
//        
//        System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()
//        + " Fecha de Alta: " + empleado3.dameFechaContrato());


          Empleado[] misEmpleados = new Empleado[3];
              
          misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1900, 12, 17);
          
          misEmpleados[1] = new Empleado("Ana López", 95000, 1899, 6, 2);
          
          misEmpleados[2] = new Empleado("Lucía Méndez", 105000, 1905, 3, 15);
          
          //Bucle for() tradicional para subir el sueldo.
//          for(int i=0; i<3; i++){
//              
//              misEmpleados[i].subeSueldo(5);
//              
//          }
//          
          //Imprimir la información en consola
//          for(int i=0; i<3; i++){
//              
//              System.out.println("Nombre: " + misEmpleados[i].dameNombre() 
//              + " Sueldo: " + misEmpleados[i].dameSueldo() + " Fecha de Alta: " + 
//              misEmpleados[i].dameFechaContrato());
//              
//          }
          
          //Bucle for() mejorado para subir el sueldo.
          for(Empleado e: misEmpleados){
              
             e.subeSueldo(5);
              
          }
          
          //Bucle for() mejorado para imprimir en consola
          for(Empleado e: misEmpleados){
              
              System.out.println("Nombre: " + e.dameNombre() 
               + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + 
                 e.dameFechaContrato());
              
          }
    
        
    }
    
}


class Empleado{
    
    //Método constructor
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
        nombre = nom;
        
        sueldo = sue;
        
        GregorianCalendar  miCalendario = new GregorianCalendar(agno, mes-1, dia);
        
        //getTime() es un método heredado por GregorianCalendar de la clase java.util.Calendar
        altaContrato = miCalendario.getTime();  
        
    }
    
    public String dameNombre(){  //getter()
        
        return nombre;
        
    }
    
    public double dameSueldo(){  //getter()
        
        return sueldo;
        
    }
    
    public Date dameFechaContrato(){  //getter()
        
        return altaContrato;
        
    }
    
    public void subeSueldo(double porcentaje){  //setter()
            
        double aumento = sueldo*porcentaje/100;
        
        sueldo+=aumento;
        
    }
    
    
    //Variables o campos de clase al final. Están encapsulados.
    private String nombre;
    
    private double sueldo;
    
    private Date altaContrato;
    
}