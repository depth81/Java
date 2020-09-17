/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

24.Crear un algoritmo que le permita al usuario ingresar el nombre de un estudiante y las 4 notas que obtuvo en una materia y el computador le imprima el nombre, 
la nota definitiva y un mensaje que le indique si “GANA“, “HABILITA” O “PIERDE” .
 */
package ejercicio24;
import java.util.Scanner;
/**
 *
 * @author p84029437
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float n1, n2, n3, n4, prom;
        String nom;
        
        Scanner objLector = new Scanner(System.in);
        
        System.out.print("ingrese el nombre del estudiante: ");
        nom = objLector.nextLine();
        
        System.out.print("ingrese la primera nota: ");
        n1 = objLector.nextFloat();
        
        System.out.print("ingrese la segunda nota: ");
        n2 = objLector.nextFloat();
        
        System.out.print("ingrese la tercera nota: ");
        n3 = objLector.nextFloat();
        
        System.out.print("ingrese la cuarta nota: ");
        n4 = objLector.nextFloat();
        
        prom=(n1+n2+n3+n4)/4;
        
        if(prom >= 3)
        {
           System.out.println("El estudiante " + nom + " GANA con una nota de: " + prom);
        }
        
        else if ((prom >=2)&&(prom<3)) 
        {
            System.out.println("El estudiante " + nom + " HABILITA con una nota de: " + prom);
        }
        
        else
        {
            System.out.println("El estudiante " + nom + " PIERDE con una nota de: " + prom);
        }
    }
}
