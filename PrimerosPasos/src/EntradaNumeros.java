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

public class EntradaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String num1 = JOptionPane.showInputDialog("Introduce un numero: ");
        
        double num2 = Double.parseDouble(num1);
        
        System.out.print("La raíz de " + num2 + " es ");
        
        System.out.printf("%1.4f", Math.sqrt(num2));
        
        
    }
    
}
