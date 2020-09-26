/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevectores19sept2020;
import java.util.Scanner;

/**
 /*
  read and print
 */
public class ClaseVectores19sept2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oRead = new Scanner(System.in);
        
        //Instanciar los objetos de todas las clases.
        ClaseVector oVector = new ClaseVector();
        
        ClaseOperaciones oOperaciones = new ClaseOperaciones();
        
        int n, suma,mayor;
        
        double prom;
             
        System.out.print("Digite la cantidad de elementos del vector");
        
        n=oRead.nextInt();

        int[] sal = new int[n];
        
        //Leer y almacenar el vector
        sal =  oVector.LeerVector(n);
            
        //Imprimir el vector
        oVector.ImprimirVector(n, sal);
        
        //Operaciones
        prom = oVector.Promedio(n, sal);
        mayor = oVector.Mayor(n, sal);
        suma = oVector.Suma(n, sal);
        
        //Imprimir los resultados
        System.out.println("\n El promedio de los elementos  del vector es: " + prom);
        
        System.out.println("La suma de los elementos de las posiciones pares es: " + suma);
        
        System.out.println("El mayor elemento del vector es: " + mayor);
        
        
        }
        
  
     
    }
    

    
