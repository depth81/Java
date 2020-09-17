/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

38. Un empresario del transporte cuenta con 30 vehículos entre buses, busetas y colectivos. Al final del día se elabora por cada vehículo un registro con la placa, el tipo (1= bus, 2= buseta, 3= colectivo) 
y el número de pasajeros transportados. Elabore un algoritmo que imprima por cada vehículo la placa, el dinero recolectado y el pago para el conductor que es el 20 % del total recolectado. 
También tenga en cuenta que el precio del pasaje en Bus es de $2200.oo, en Buseta es de $ 2500.oo y en Colectivos es de $3500.oo.

 */
package ejercicio38;
import java.util.Scanner;
/**
 *
 * @author p84029437
 */
public class Ejercicio38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String placa;
        int tipo, numP, dinRec, pagoCond, i;
        
        for(i=0;i<30;i++)
        {
        
           Scanner sc = new Scanner(System.in);
            
           System.out.print("Ingrese la placa del vehiculo: ");
           placa = sc.nextLine();
           
           System.out.print("Ingrese el tipo del vehículo (1= bus, 2= buseta, 3= colectivo): ");
           tipo = sc.nextInt();
           
           System.out.print("Ingrese el número de pasajeros transportados: ");
           numP = sc.nextInt();
           
            switch(tipo) {
            //Bus
                case 1:
                    dinRec = numP * 2200;
                    break;
            //Buseta
                case 2:
                    dinRec = numP * 2500 ;
                    break;
            //Colectivo
                default:
                    dinRec = numP * 3500  ;
                    break;
            }
            
            pagoCond = dinRec * 20/100;
            
            System.out.println("el vehículo con placa " + placa + " ha recolectado: " + dinRec + " pesos y el pago del conductor es: " + pagoCond + " pesos");

        }
        
    }
    
}
