/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

27. Elaborar un programa que le permita a un usuario ingresar el nombre de un trabajador, y el número de horas trabajadas, se pide que el programa le imprima el salario bruto, las bonificaciones, 
las deducciones y el salario neto; teniendo en cuenta que las bonificaciones serán de $20.000.oo si trabajó como máximo 48 horas, de $50.000.oo si trabajo entre 49 y 58 horas y de $100.000 si trabajó 
mas de 58 horas. Las deducciones son de $10.000 si el salario básico hora es menor de $5.000.oo, de $20.000.oo si  el salario básico hora es mayor de $5.000.oo y menor de $8.000.oo y de $ 50.000.oo 
si su salario básico hora es de $8.000.oo o mas.

SE ASUME QUE EL SALARIO BÁSICO X HORA TAMBIÉN ES INGRESADO POR EL USUARIO. ESTO NO ESTÁ EN EL TEXTO. REVISAR CON EL PROFESOR!!!

 */
package ejercicio27;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom;
        double VH,HT,DED,BON=0,SBRUTO, SNETO;
        
        Scanner objLector = new Scanner(System.in);
        
        System.out.print("ingrese el nombre: ");
        nom = objLector.nextLine();
        
        System.out.print("ingrese las horas trabajadas: ");
        HT = objLector.nextDouble();
        
        System.out.print("ingrese el valor por hora trabajada: ");
        VH = objLector.nextDouble();
        
        
        if(HT<=48)
        {
          BON = 20000;
        }
        else if (HT>=49 && HT <=58){
          BON = 50000;
        }
        else if (HT>=58){
           BON = 100000;
        }
        
        if(VH<5000)
        {
            DED=10000;
        }
        else if(VH>=5000 && VH<=8000)
        {
            DED = 20000;
        }
        else
        {
            DED = 50000;
        }
        
     
        SBRUTO = HT*VH + BON;
        SNETO = SBRUTO - DED;
       
        System.out.println("El salario bruto es: " + SBRUTO);
        System.out.println("Las bonificaciones son: " + BON);
        System.out.println("El deducciones son: " + DED);
        System.out.println("El salario neto es: " + SNETO);
        
        
    }
    
}
