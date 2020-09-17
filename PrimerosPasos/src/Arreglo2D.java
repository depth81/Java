/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author p84029437
 */
public class Arreglo2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double acumulado;
        double interes = 0.10;
        
        double [][] saldo = new double[6][5];
        
        for(int i=0;i<6;i++){
        
            saldo[i][0]=10000; //todas las primeras posiciones iniciadas en 10000.
            acumulado=10000;
            
            for(int j=1;j<5;j++){
            
                acumulado=acumulado+(acumulado*interes);
                
                saldo[i][j]=acumulado;
            
            } //end second for
        
        interes=interes+0.01;
          
        }//end first for 
        
        // Reading the array
        
        for(int z=0;z<6;z++){
        
            System.out.println();
        
            for(int h=0;h<5;h++){
            
                System.out.printf("%1.2f", saldo[z][h]);
                
                System.out.print(" ");
            
            } // End second for
        
        } // End first for
        
    }
    
}
