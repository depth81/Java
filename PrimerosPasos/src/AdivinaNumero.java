import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class AdivinaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aleatorio = (int)(Math.random()*100);
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        int intentos = 0;
        
        while(numero!=aleatorio){
        
            intentos++;
            
            System.out.println("Introduce un número por favor");
        
            numero = entrada.nextInt();
            
            if(aleatorio<numero){
            
                System.out.println("Más bajo");
            
            }
            
            else if(aleatorio>numero){
            
                System.out.println("Más alto");
                
            }
            
        }//end while
        
        System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
    }
    
}
