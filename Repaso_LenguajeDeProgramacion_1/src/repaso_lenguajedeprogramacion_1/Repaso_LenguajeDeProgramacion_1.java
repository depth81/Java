/*
 Actividad 1. El almacén WC distribuye los siguientes artículos
ARTICULO	PRECIO DE VENTA
Zapatos         $350.000
Tenis           $280.000
Camisetas	$175.000
Jeans           $200.000

●	Muestra en la consola los artículos y precios actuales
●	También mostrar el costo total de los cuatro artículos
●	Además el promedio de venta
●	Subir el precio de los Jeans en un 6.2%
●	Disminuir el precio de los Zapatos en un 0.8%
●	Por último mostrar el nuevo valor de los Zapatos y de los Jeans

 */
package repaso_lenguajedeprogramacion_1;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Repaso_LenguajeDeProgramacion_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Definición de variables
        int CostoTotal;
        double promVenta, precioJeansAumento, precioZapatosDism;
        final int pZapatos = 350000;
        final int pTenis = 280000;
        final int pCamisetas = 175000;
        final int pJeans = 200000;
        
        //Inicialización de Variables
        CostoTotal=0;
        promVenta=0;
        precioJeansAumento=0;
        precioZapatosDism=0;
        
        //Muestra en la consola los artículos y precios actuales   
        System.out.println("El precio de los zapatos es: " + pZapatos);
        System.out.println("El precio de los Tenis es: " + pTenis);
        System.out.println("El precio de las camisetas es: " + pCamisetas);
        System.out.println("El precio de los Jeans es: " + pJeans);
        CostoTotal = pZapatos+pTenis+pCamisetas+pJeans;
        
        //También mostrar el costo total de los cuatro artículos
        System.out.println("El costo total de los cuatro (4) artículos es: " + CostoTotal);
        
        //Además el promedio de venta
        promVenta = CostoTotal/4;
        System.out.println("El promedio de venta de los cuatro (4) artículos es: " + promVenta);
        
        //Subir el precio de los Jeans en un 6.2%
        precioJeansAumento = pJeans + pJeans*0.062;
        System.out.println("El nuevo precio de los jeans aumentado un 6.2% es: " + precioJeansAumento);
        
        //Disminuir el precio de los Zapatos en un 0.8%
        precioZapatosDism = pZapatos - pZapatos*0.008;
        System.out.println("El nuevo precio de los zapatos disminuido en un 0.8% es: " + precioZapatosDism);
        
    }
    
}
