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
public class PesoIdeal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String genero = "";
        
        do{
        
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
        
        int pesoIdeal = 0;
        
        if(genero.equalsIgnoreCase("H")){
        
            pesoIdeal = altura - 110;
        
        }
        else if(genero.equalsIgnoreCase("M")){
        
            pesoIdeal = altura -120;
        
        }
        
        System.out.println("Tu peso ideal es " + pesoIdeal);
        
    }
    
}
