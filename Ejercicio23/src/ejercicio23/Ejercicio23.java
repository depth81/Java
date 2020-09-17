/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

23.	Elaborar Un algoritmo que le permita al usuario leer 3 número y el computador le imprima el menor de ellos.

 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        
         Scanner objLector = new Scanner(System.in);
         
          System.out.print("ingrese el primer número: ");
          num1 = objLector.nextInt();
          
          System.out.print("ingrese el segundo número: ");
          num2 = objLector.nextInt();
          
          System.out.print("ingrese el tercer número: ");
          num3 = objLector.nextInt();
          
          if ((num1<num2) && (num1<num3))
          {
              System.out.print("El número menor es: " + num1);
          }
          else
          {
              
              if ((num2 < num1)&&(num2<num3))
              {
                  System.out.print("El número menor es: " + num2);
              }
              
              else
              {
              
                  System.out.print("El número menor es: " + num3);
                  
              }  
        
    }
    
}
}
