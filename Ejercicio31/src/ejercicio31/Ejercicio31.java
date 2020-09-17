/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

31.Elabore un algoritmo que lea para un grupo de 15 personas el nombre y la edad, e imprima por cada una el nombre y un mensaje que imprima si es mayor o menor de edad.
 
*/
package ejercicio31;

import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        int edad, i;
        
        for(i=0; i<=14; i++)
        {
        
            Scanner objLector = new Scanner(System.in);
            
            System.out.print("ingrese el nombre de la persona: ");
            nom = objLector.nextLine();
            
            System.out.print("ingrese la edad de la persona: ");
            edad = objLector.nextInt();
            
            if(edad<18)
            {
                System.out.println(nom + " tiene " + edad + " años y es menor de edad.");
            }
            else
            {
                System.out.println(nom + " tiene " + edad + " años y es mayor de edad.");
            }
            
        }
        
    }
    
}
