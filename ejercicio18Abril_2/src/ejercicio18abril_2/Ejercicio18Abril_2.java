/*
Una distribuidora de huevos ofrece tres tipos de tamaños de huevos (E=Económico, M=Medio, J=Jumbo). Cada que se realiza una venta se registra el nombre del cliente, el tipo de huevo que compra y la cantidad vendida.
Suponiendo que se tienen N ventas, elabore un programa que muestre:

-Nombre del cliente y valor a pagar por cada venta.
-Cuántas ventas se hicieron para cada tipo de huevo.
-Total de huevos que se vendieron de cada tipo.
-Número total de las ventas de la distribuidora.

ANÁLISIS -->

*Número de registros: (n es el dato identificador --> Ciclo 'para'
*Datos de entrada: nomcli, tiph, cant

*Información de salida: 

nomcli, vrpag --> Por cada venta.
cuántas ventas --> tiph = "E" (contador y se incrementa en 1: cve)
cuántas ventas --> tiph = "M" (contador y se incrementa en 1: cvm)
cuántas ventas --> tiph = "J" (contador y se incrementa en 1: cvj)
SUMA cant --> tiph = "E" (acumulador porque incrementa en una cantidad diferente a 1: ahe)
SUMA cant --> tiph = "M" (acumulador porque incrementa en una cantidad diferente a 1: ahm)
SUMA cant --> tiph = "J" (acumulador porque incrementa en una cantidad diferente a 1: ahj)
SUMA vrpag --> todas las ventas (acumulador: atv)

Datos de proceso: 

vrpag <- cant * vruni
vruni <- 400 si tiph = "E"
vruni <- 450 si tiph = "M"
vruni <- 500 si tiph = "J"
 */
package ejercicio18abril_2;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio18Abril_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomcli;
        int i=0, n=0, cve=0, cvm=0, cvj=0, ahe=0, ahm=0, ahj=0, atv=0, vrpag, vruni = 0, cant;
        String tiph;
        
        Scanner objLector = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de ventas: ");
        n = objLector.nextInt();
        
        for (i=0; i<n; i++)
        {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Ingrese el nombre del cliente: ");
            nomcli = sc.nextLine();
            
            System.out.print("Ingrese el tipo de huevo (E/M/J): ");
            tiph = sc.next();
            
            System.out.print("Ingrese la cantidad de huevos vendida: ");
            cant = sc.nextInt();
            
            switch(tiph)
            {
                case("E"):
                case("e"):
                    
                    vruni = 400;
                    cve = cve + 1;
                    ahe = ahe + cant;
                    break;
                
                case("M"):
                case("m"):
                    
                    vruni = 450;
                    cvm = cvm + 1;
                    ahm = ahm + cant;
                    break;
                
                case("J"):
                case("j"):
                    
                    vruni = 500;
                    cvj = cvj + 1;
                    ahj = ahj + cant;
                    break;
                
                default:
                    
                    System.out.print("Tipo no válido. venta anulada");
                    System.out.println();
                    vruni = 0;
                
            }
               
           vrpag = cant * vruni;
           atv = atv + vrpag;
           
           System.out.print(nomcli + " debe pagar: " + vrpag);
           
           System.out.println();
           System.out.print("________________________________");
           System.out.println();
           
        }
          
           System.out.println("Para el tipo de huevo E se hicieron " + cve + " ventas");
           System.out.println("Para el tipo de huevo M se hicieron " + cvm + " ventas");
           System.out.println("Para el tipo de huevo J se hicieron " + cvj + " ventas");
           System.out.println("Se vendieron " + ahe + " unidades del tipo de huevo E");
           System.out.println("Se vendieron " + ahm + " unidades del tipo de huevo M");
           System.out.println("Se vendieron " + ahj + " unidades del tipo de huevo J");
           System.out.println("El total de ventas de la distribuidora es: " + atv);
    
    }
    
}
