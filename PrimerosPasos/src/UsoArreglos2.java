/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class UsoArreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] matrizAleatorios = new int[150];
        
        for(int i=0;i<matrizAleatorios.length;i++){
        
            matrizAleatorios[i] = (int)(Math.round(Math.random()*100));
        
        }
        
        for(int numeros:matrizAleatorios){
        
            System.out.print(numeros + " ");
            
        }
        
    }
    
}
