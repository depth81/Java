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
            
          Jefatura jefeRRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
          
          jefeRRHH.estableceIncentivo(2570);

          Empleado[] misEmpleados = new Empleado[6];
              
          misEmpleados[0] = new Empleado("Paco Gómez", 85000, 2018, 12, 17);
          
          misEmpleados[1] = new Empleado("Ana López", 95000, 2015, 6, 2);
          
          misEmpleados[2] = new Empleado("Lucía Méndez", 105000, 2019, 3, 15);
          
          misEmpleados[3] = new Empleado("Carolina Martínez");  //Llamo al segundo constructor.
          
          //POLIMORFISMO o principio de sustitución.
          misEmpleados[4] = jefeRRHH;
          
          misEmpleados[5] = new Jefatura("María", 100000, 1999, 5, 26);
          /* Se puede usar un objeto de la subclase (Jefe) cuando el programa 
          / espere un objeto de la superclase (Empleado). */
          
          /*****************************************************************************************/
          
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
            
        /*******************************************************************************************/
          
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
        
        //getTime() es un método heredado por GregorianCalendar desde la clase java.util.Calendar
        altaContrato = miCalendario.getTime();  
        
        ++IdSiguiente;
        
        Id = IdSiguiente;
        
    }
    
    //Segundo método consttructor que da otro estado inicial diferente que al anterior a los objetos. 
    //Sobrecarga de constructores: Varios constructores en una misma clase. Difieren en número y/o tipo
    //de parámetros. El compilador de Java debe saber cuándo usar uno u otro constructor, esto depende 
    //cómo lo llame.
    public Empleado(String nom){
        
        /* Inicializar objetos con los mismos valores iniciales se logra con el 'this'. 
        El this llama al otro constructor de la clase y le pasa los parámetros correspondientes, o sea
        que nom pasa a almacenarse en el nom del primer constructor y así con los otros parámetros.*/
        this(nom, 30000, 1900, 01, 01);
        
    }
    
    
    public String dameNombre(){  //getter()
        
        return nombre + " Id: " + Id;
        
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
    
    private static int IdSiguiente;
    
    private int Id;
    
}


class Jefatura extends Empleado{

    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        
        //LLamada al constructor de la clase Padre (Empleado)
        super(nom, sue, agno, mes, dia); 
                    
    }
    
    //setter()
    public void estableceIncentivo(double b){
        
        incentivo = b;
        
    }
    
    //getter(). Sobreescribir (override) el método dameSueldo() de la clase Empleado.
    //Este método dameSueldo() sobreescribe a aquel de la clase Padre (Empleado)
    public double dameSueldo(){
        
        double sueldoJefe = super.dameSueldo(); //Llamar al método dameSueldo()de la clase Empleado
        
        return sueldoJefe + incentivo;
        
    }
    
     //Particularidades de la clase Jefe
    private double incentivo;
    
    

}