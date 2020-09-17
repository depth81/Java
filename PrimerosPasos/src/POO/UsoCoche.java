/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.*;

/**
 *
 * @author p84029437
 */

public class UsoCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un objeto tipo 'Coche'.
        Coche miCoche = new Coche();
        
        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
        
        System.out.println(miCoche.dimeColor());
        
        System.out.println(miCoche.dimeDatosGenerales());
        
        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        
        System.out.println(miCoche.dimeAsientos());
        
        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        
        System.out.println(miCoche.dimeClimatizador());
        
        System.out.println(miCoche.dimePesoCoche()); //getter + setter
        
        System.out.println("El precio final del coche es: " + miCoche.precioCoche());
        
    }
    
    
    
}
