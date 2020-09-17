import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int resultado = 1;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número")); 
        
        for(int i=numero;i>0;i--){
        
            resultado = resultado*i;
        
        }
        
        System.out.println("El factorial de " + numero + " es " + resultado);
    }
    
}
