/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevectores19sept2020;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class ClaseVector {
    
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
    
}//end Class
      
        
    

