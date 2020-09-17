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
public class EntradaEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Introduce tu nombre por favor:");
        
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce la edad por favor: ");
        
        int edad = entrada.nextInt();
        
        System.out.println("Hola " + nombre + ", el año que viene tendrás " + (edad+1) + " años");
        
    }
    
}
