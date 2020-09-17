
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
import javax.swing.*;

public class EntradaEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor: ");
        
        String edad = JOptionPane.showInputDialog("Introduce la edad, por favor: ");
        
        int edadUsuario = Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre + ", el año que viene tendrás " + (edadUsuario+1) + " años");
        
    }   
    
}
