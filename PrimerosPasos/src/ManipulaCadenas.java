/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class ManipulaCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "Paulo Enrique";
        
        System.out.println("Mi nombre es: " + nombre);
        
        System.out.println("Mi nombre tiene " + nombre.length()+ " letras.");
        
        System.out.println("La primera letra de mi nombre es: " + nombre.charAt(0));
          
        System.out.println("La última letra de mi nombre es: " + nombre.charAt(nombre.length()-1));
        
    }
    
}
