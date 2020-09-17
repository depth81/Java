/*
42.Una empresa transportadora desea sistematizar la liquidación diaria de sus N vehículos, para ello, crea el siguiente registro por cada carro: placa, propietario, tipo de vehículo 
(1=colectivo, 2=microbús, 3=buseta, 4=bus) número de pasajeros transportados, valor de cada pasaje.
   El administrador desea saber:
a) Total recolectado por la empresa.
b) Cuantos de los colectivos transportaron más de 100 pasajeros.
c) Promedio de pasajeros transportados por los microbuses.
d) Placa de la buseta que más dinero recolectó.
e) Cuanto dinero recolectaron en total los buses.

 */

package ejercicio42;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        String placa, placaMay3 = "No aplica", prop = "No aplica";
        int N = 0, i=0, tipo = 1, nroP=0, valP = 0, ct=0, c1=0, c2=0, c3=0, c4=0, c1_100=0, ap2=0, ad4=0, adt=0, mayd=0, totalAc=0;
        float promp2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de vehículos:  ");
        N = sc.nextInt();
        sc.nextLine();
        
        for(i=0; i<N; i++){
            
            System.out.print("Placa: ");
            placa = sc.nextLine();
            
            System.out.print("Propietario: ");
            prop = sc.nextLine();
            
            System.out.print("Tipo(1=colectivo, 2=microbús, 3=buseta, 4=bus):");
            tipo = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Pasajeros: ");
            nroP = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Valor del pasaje: ");
            valP = sc.nextInt();
            sc.nextLine();
            
            totalAc = nroP*valP; //Suma el dinero del vehículo 'actual'  
            
            switch(tipo){
            
                case 1: 
                    c1+=1;
                    if(nroP>100){
                        c1_100+=1;
                    }
                break;
                
                case 2: 
                    c2+=1;
                    ap2+=nroP;
                break;
                
                case 3: 
                    c3+=1;
                    if(totalAc > mayd){
                        mayd = totalAc;
                        placaMay3 = placa;
                    }
                break;
                
                case 4: 
                    c4+=1;
                    ad4+=totalAc;
                break;
                
                default:
                    System.out.println("ELIGE UNA OPCION VALIDA");
                
            }//end switch
            
            adt+=totalAc; //Suma el dinero de todos los vehículos
            
        }//end for
        
        //a) Total recolectado por la empresa.
        System.out.println("El dinero total recolectado por la empresa es: " + adt);
        
        //b) Cuantos de los colectivos transportaron más de 100 pasajeros.
        if(c1!=0){
            System.out.println("Los colectivos que transportaron más de 100 pasajeros son en total: " + c1_100);
        }
        else{
            System.out.println("Datos no disponibles. No se ingresaron colectivos");
        }
        
        //c) Promedio de pasajeros transportados por los microbuses.
        if(c2!=0){
            System.out.println("El promedio de pasajeros transportados por los microbuses : " + ap2/c2);
        }
        else{
            System.out.println("Datos no disponibles. No se ingresaron microbuses");
        }
     
        //d) Placa de la buseta que más dinero recolectó.
        if(c3!=0){
            System.out.println("La placa de la buseta que más dinero recolectó es: " + placaMay3 + " con: " + mayd + " pesos" );
        }
        else{
            System.out.println("Datos no disponibles. No se ingresaron busetas.");
        }
        
        //e) Cuanto dinero recolectaron en total los buses.
        if(c4!=0){
            System.out.println("Los buses recolectaron en total: " + ad4 + " pesos." );
        }
        else{
            System.out.println("Datos no disponibles. No se ingresaron buses.");
        }
    }
    
}
