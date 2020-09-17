/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

37. Elaborar un algoritmo que lea para un grupo de N personas el nombre, la edad y el deporte (1= fútbol, 2=baloncesto, 3= otro deporte) e imprima cuántos de fútbol son mayores de edad, 
cuántos de baloncesto son menores de edad y cuántas personas prefieren otro deporte.

 */
package ejercicio37;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom;
        int edad, deporte, N, i, contF=0, contB=0, contOt=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de personas: ");
        N = sc.nextInt();
        
        for(i=0; i<N; i++)
        {
        
           Scanner objLector = new Scanner(System.in);
            
           System.out.print("Ingrese el nombre de la persona: ");
           nom = objLector.nextLine();
           
           System.out.print("Ingrese la edad de la persona: ");
           edad = objLector.nextInt();
           
           System.out.print("Ingrese el deporte (1 = Fútbol, 2 = Baloncesto, 3 = Otro deporte): ");
           deporte = objLector.nextInt();
           
           if(deporte==1 && edad>=18)
           {
               contF+=1;
           }
           else if(deporte==2 && edad<18)
           {
               contB+=1;
           }
           else if(deporte==3)
           {
               contOt+=1;
           }
        
        }
      
        System.out.println("Hay " + contF + " personas mayores de edad que se matricularon en fútbol");
        
        System.out.println("Hay " + contB + " personas menores de edad que se matricularon en baloncesto");
        
        System.out.println("Hay " + contOt + " personas que se matricularon en otro deporte");
        
    }
    
}
