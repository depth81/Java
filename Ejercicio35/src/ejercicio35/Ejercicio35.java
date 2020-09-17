/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

35. Elabore un algoritmo que lea el nombre, la edad y la estatura de un grupo de 20 personas, e imprima el nombre solo de las personas que sean mayores de edad y que su estatura sea mayor de 1.80 mts.

 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom;
        int edad, est, i;

        for(i=0;i<20;i++)
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre de la persona: ");
            nom = sc.nextLine();
            
            System.out.println("Ingrese la edad de la persona: ");
            edad = sc.nextInt();
            
            System.out.println("Ingrese la estatura (cm) de la persona: ");
            est = sc.nextInt();
            
            if(edad>=18)
            {
                if(est>180)
                {
                    System.out.println(nom);
                }
            }
            
        }
        
    }
    
}
