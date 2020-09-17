/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

36. En una universidad, cada que se matricula un estudiante se elabora un registro con el número del carnet, la cantidad de materias matriculadas y el estrato social al que pertenece. 
Elabore un algoritmo que imprima por cada estudiante el carnet y el valor de la matricula, teniendo en cuenta que si el número de materias es superior a 5 y el estrato social es igual a '1' 
se le hace un descuento del 20 %. Cada materia tiene un valor de $100.000.oo

*/
package ejercicio36;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numCarnet, numMaterias, estrato, numEst, i; 
        double valorMat, dcto;
        String nom;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        numEst = sc.nextInt();
        
        for(i=0; i<numEst; i++)
        {
            
            Scanner objLector = new Scanner(System.in);
            
            System.out.print("Ingrese el nombre del estudiante: ");
            nom = objLector.nextLine();
            
            System.out.print("Ingrese el número del carnet: ");
            numCarnet = objLector.nextInt();
            
            System.out.print("Ingrese la cantidad de materias matriculadas: ");
            numMaterias = objLector.nextInt();
            
            System.out.print("Ingrese el estrato (1,2,3,4,5,6): ");
            estrato = objLector.nextInt();
            
            valorMat = numMaterias*100000;
            
            if(numMaterias>5)
            {
                if(estrato==1)
                {
                    dcto = valorMat*0.2;
                    valorMat = valorMat - dcto;
                }
            }
            
            System.out.println("El estudiante " + nom + " con número de carnet: " + numCarnet + " debe cancelar: " + valorMat + " por concepto de matrícula");
            System.out.print("___________________________________________________________________________________________________________________________\n");
            
        }

    }
    
}