/*
Leer e imprimir un vector de enteros de tamañno 'n'. Luego debe imprimir el promedio de sus 
elementos, su mayor elemento y la suma de los elementos en las posiciones pares.
 */
package clasevectores19sept2020;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class ClaseVector extends ClaseOperaciones{
    
   Scanner sc = new Scanner(System.in);
   
   int k;
    
    public int[] LeerVector(int n){
            
        int[] salarios = new int[n];

        for(k=0;k<n;k++){
        
            System.out.println("Escriba el elemento " + k + " del vector");
            
            salarios[k]=sc.nextInt();
            
        }//end for

        return salarios;
        
    }//end LeerVector
    
    
    public void ImprimirVector(int n, int[] salarios){
        
        System.out.println("\n Datos del vector");
        
        for(k=0; k<n; k++){
            
            System.out.print(salarios[k] + " ");
            
        }
        
    }
    
}//end Class
      
        
    

