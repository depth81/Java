/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

   32. En un almacén, cada que se realiza una venta se elabora un registro con el nombre del articulo, el precio por unidad y la cantidad de artículos vendidos. 
   Suponiendo que se hicieron 20 ventas, elabore un algoritmo que imprima por cada venta el nombre del articulo y el valor total de la venta.
   Suponga que si el valor de la venta es mayor de 50.000.oo se concede un descuento del 10 % sobre el valor de la venta.

 */
package ejercicio33;

import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom;
        double pu,vt, dcto;
        int i, cav;
        
        for(i=1; i<=20; i++)
        {
            Scanner objLector = new Scanner(System.in);
            
            System.out.print("ingrese el nombre del arttículo: ");
            nom = objLector.nextLine();
            
            System.out.print("Ingrese el precio del artículo por unidad: ");
            pu = objLector.nextDouble();
            
            System.out.print("Ingrese la cantidad de artículos vendidos: ");
            cav = objLector.nextInt();
            
            vt = pu*cav;
            
            if(vt>50000)
            {
                dcto=vt*0.1;
                vt= vt-dcto;
            }         
            
            System.out.println("La venta " + i + " del artículo " + nom + " es en total: " + vt);
        }
        
    }
    
}
