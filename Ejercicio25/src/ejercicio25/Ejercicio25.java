/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

25.Crear un algoritmo que le permita al usuario ingresar 3 números y el computador se los muestre en orden ascendente

*/
package ejercicio25;
import java.util.Scanner;
/**
 *
 * @author p84029437
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        double n1, n2, n3;
        
        Scanner objLector = new Scanner(System.in);
        
        System.out.print("ingrese el primer número: ");
        n1 = objLector.nextDouble();
        
        System.out.print("ingrese el segundo número: ");
        n2 = objLector.nextDouble();
        
        System.out.print("ingrese el tercer número: ");
        n3 = objLector.nextDouble();
        
        if((n1<n2)&&(n2<n3))
        {
            System.out.print("el orden ascendente es; " + n1 + " " + n2 + " " + n3);
        }
            
        else if ((n1<n3)&&(n3<n2))                   
        {   
            System.out.print("el orden ascendente es; " + n1 + " " + n3 + " " + n2);    
        }
        
        else if ((n2<n1)&&(n1<n3))
        {
            System.out.print("el orden ascendente es; " + n2 + " " + n1 + " " + n3);  
        }
    
        else if ((n2<n3)&&(n3<n1))
        {
            System.out.print("el orden ascendente es; " + n2 + " " + n3 + " " + n1);  
        }
        
        else if ((n3<n2)&&(n2<n1))
        {
            System.out.print("el orden ascendente es; " + n3 + " " + n2 + " " + n1);  
        }
        
        else 
        {
            System.out.print("el orden ascendente es; " + n3 + " " + n1 + " " + n2);
        }
    }
}
