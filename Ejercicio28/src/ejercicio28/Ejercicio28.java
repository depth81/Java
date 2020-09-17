/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

28.Para la materia de Destrezas se determinó con los estudiantes que, si la nota del primer quiz era menor que la del segundo, se sustituía la primer nota por la segunda. Elabore un algoritmo que le permita 
al profesor ingresar las 4 notas que obtuvo un alumno y el computador le muestre la nota definitiva y la calificación cualitativa que es: 
“E” si es mayor o igual a 4.5, “S” si es mayor o igual a 4.0  y menor de 4.5, “B” si es mayor o igual a 3.5  y menor de 4.0, “A” si es mayor o igual a 3.0  y menor de 3.5, 
“D” si es mayor o igual a 2.0  y menor de 3.0 e “I” si es menor de 2.0      


 */
package ejercicio28;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        double n1,n2,n3,n4,n,nfinal;
        
        Scanner objLector = new Scanner(System.in);
                
        System.out.print("ingrese el nombre: ");
        nom = objLector.nextLine();
        
        System.out.print("ingrese la nota del primer examen: ");
        n1 = objLector.nextDouble();
        
        System.out.print("ingrese la nota del segundo examen: ");
        n2 = objLector.nextDouble();
        
        System.out.print("ingrese la nota del tercer examen: ");
        n3 = objLector.nextDouble();
        
        System.out.print("ingrese la nota del cuarto examen: ");
        n4 = objLector.nextDouble();
        
        if(n1<n2)
        {
            //n1 = n2; 
            
            nfinal=((2*n2)+n3+n4)/4;
        }
        else
        {
            nfinal = (n1+n2+n3+n4)/4;
        }
        
        if (nfinal>=4.5){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'E' ");
        }
        else if ((nfinal >= 4) && (nfinal<4.5)){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'S' ");
        }
        else if ((nfinal >= 3.5) && (nfinal<4)){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'B' ");
        }
        else if ((nfinal >= 3) && (nfinal<3.5)){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'A' ");
        }
        else if ((nfinal >= 2) && (nfinal<3)){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'D' ");
        }
        else if (nfinal<2){
            System.out.println("La nota definitiva es: " + nfinal + " y la calificación cualitativa es: 'I' ");
        } 
        
}
}
