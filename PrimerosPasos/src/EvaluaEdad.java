/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author p84029437
 */
public class EvaluaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu edad por favor: ");
        
        int edad = entrada.nextInt();
        
        if(edad<18){
        
            System.out.println("Eres adolescente");
        
        }
        else if(edad>=18 && edad<40){
        
            System.out.println("Eres joven");
        
        }
        else if(edad>=40 && edad<65){
        
            System.out.println("Eres maduro");
        
        }
        else{
        
            System.out.println("Eres adulto mayor");
            
        }
            
            
    }
    
}
