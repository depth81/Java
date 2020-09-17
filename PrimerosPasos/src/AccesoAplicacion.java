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
public class AccesoAplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String clave = "Paulo";
        
        String pass = "";
        
        while(clave.equals(pass)==false){
            
            pass = JOptionPane.showInputDialog("Introduce la contraseña por favor");
            
            if(clave.equals(pass)==false){
            
                System.out.println("Contraseña incorrecta");
            
            }
        
        }//end while
        
        System.out.println("Contraseña correcta. Acceso permitido");
        
    }
    
}
