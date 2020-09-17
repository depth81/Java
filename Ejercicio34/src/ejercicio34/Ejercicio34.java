/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

34. Se tienen 10 parejas de números, elabore un algoritmo que imprima cada pareja de números en orden ascendente.

 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1, num2;
        int i;
        
        for(i=0; i<10; i++)
        {
            
           Scanner sc = new Scanner(System.in);
           
           System.out.print("Ingrese el primer núnero: ");
           num1 = sc.nextDouble();
           
           System.out.print("Ingrese el segundo núnero: ");
           num2 = sc.nextDouble();
           
           if(num1>num2)
           {
               System.out.println("La pareja de números " + num1 + " y " + num2 + " en orden ascendente es: " + num2 + " y " + num1);
           }
           else if (num2>num1)
           {
               System.out.println("La pareja de números " + num1 + " y " + num2 + " en orden ascendente es: " + num1 + " y " + num2);
           }
           else
           {
               System.out.println("Los números son iguales");
           }
            
        }
        
        
    }
    
}
