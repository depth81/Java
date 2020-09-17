/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

30.Se tienen 10 registros, cada registro contiene el nombre, salario básico hora, el número de horas trabajadas, el total de deducciones y el total de bonificaciones. 
Elabore un algoritmo que imprima por cada trabajador el nombre, el salario bruto y el salario neto.

 */
package ejercicio30;

import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom;
        float SBH,NHT,TD,TB,SB,SN;
        int i;
                     
        for(i=0;i<=9;i++)
        {   
            Scanner objLector = new Scanner(System.in);
            
            System.out.print("ingrese el nombre del trabajador: ");
            nom = objLector.nextLine();
                        
            System.out.print("ingrese el salario básico por hora: ");
            SBH = objLector.nextFloat();
            
            System.out.print("ingrese el número de horas trabajadas: ");
            NHT = objLector.nextFloat();
            
            System.out.print("ingrese el total de deducciones: ");
            TD = objLector.nextFloat();
            
            System.out.print("ingrese el total de bonificaciones: ");
            TB = objLector.nextFloat();
            
            SB = SBH*NHT+TB;
            SN = SB-TD;
            
            System.out.print("El trabajador " + nom + " tiene un salario bruto de " + SB + " y su salario neto es: " + SN + "\n");
        
            System.out.print("_________________________________________________________________________________________________ \n");
        
        }
     
    }
    
}
