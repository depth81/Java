
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class CompruebaEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arroba = 0;
        
        boolean punto = false;
        
        String email = JOptionPane.showInputDialog("Introduce el email");
        
        for(int i=0;i<email.length();i++){
        
            if(email.charAt(i)=='@'){
            
                arroba++;
            
            }
            
            if(email.charAt(i)=='.'){
            
                punto = true;
                
            }
        
        }//end for
        
        if(arroba==1 && punto==true){
        
            System.out.println("El formato del email ingresado es correcto");
            
        }
        else{
        
            System.out.println("El formato del email ingresado NO es correcto");
        
        }
        
    }
    
}
