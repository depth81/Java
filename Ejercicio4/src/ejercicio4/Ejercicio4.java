/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author 501
 */
public class Ejercicio4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Scanner objLector = new Scanner(System.in);
        
        String hermano1, hermano2, hermano3, nombresHermanos;
        int edad1, edad2, edad3;
        float promedioEdades;
        
        System.out.print("Escriba el nombre del primer hermano: ");
        hermano1 = objLector.nextLine();
        
        System.out.print("Escriba el nombre del primer hermano: ");
        hermano2 = objLector.nextLine();
        
        System.out.print("Escriba el nombre del primer hermano: ");
        hermano3 = objLector.nextLine();
        
        System.out.print("Escriba la edad del primer hermano: ");
        edad1 = objLector.nextInt();
        
        System.out.print("Escriba la edad del segundo hermano: ");
        edad2 = objLector.nextInt();
        
        System.out.print("Escriba la edad del tercer hermano: ");
        edad3 = objLector.nextInt();
        
        promedioEdades = (edad1 + edad2 + edad3)/3;
        
       // nombresHermanos = hermano1 + hermano2 + hermano3;
        
        System.out.println("Los nombres de los hermanos son: " + hermano1 + "," + hermano2 + " y " + hermano3 );
        System.out.println("El promedio de las edades es: " + promedioEdades);
        
    }
    
}
