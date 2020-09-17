/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author p84029437
 */
public class Calculos_Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //double raiz = Math.sqrt(9);
        
        double base = 5;
        double exponente = 3;
        
        int resultado = (int)Math.pow(base,exponente);
        
        System.out.println("El resultado de " + base + " elevado a "  + exponente + " es " +resultado);
        
    }
    
}
