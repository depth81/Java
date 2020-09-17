/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

29.	Elaborar un algoritmo que imprima los primeros 15 términos de la siguiente serie de números:
        4 - 8 - 12 - 16 - 20 - 24 - 28 - 32 - 36 - 40 - 44 - 48 - 52 - 56 - 60

 */
package ejercicio29;

/**
 *
 * @author p84029437
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
           
        for(i=4; i<=62; i=i+4)
        {
            System.out.println(i);
        }
        
    }
    
}
