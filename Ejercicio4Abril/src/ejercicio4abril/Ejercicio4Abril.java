/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* ELABORAR UN ALGORITMO DONDE EL USUARIO INGRESE EL NOMBRE DE UNA PERSONA, EL SEXO ( F/M), EL ESTADO CIVIL (C/S/U) Y SALARIO BRUTO.
EL COMPUTADOR LE DEBE MOSTAR EL NOMBRE, LA BONIFICACIÓN Y EL SALARIO NETO TENIENDO EN CUENTA QUE SI ES SOLTERA MUJER TIENE UNA BONIFICACIÓN DEL 20%,
SI ES SOLTERO HOMBRE TIENE UNA BONIFICACIÓN DE 15%, SI ES CASADO TIENE UNA BONIFICACIÓN DEL 30% (SIN IMPORTAR EL SEXO) Y SI ES DE UNIÓN LIBRE TIENE UNA BONIFICACIÓN DEL 25% (SIN IMPORTAR EL SEXO) */

package ejercicio4abril;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */

public class Ejercicio4Abril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nom,sx, ec;
        int sbto, bon, snto, n, i;
        
        Scanner objLector = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas: ");
        n = objLector.nextInt();
        objLector.nextLine();
        
        for (i=0; i<n; i++)
        {
                
        System.out.print("ingrese el nombre del trabajador: ");
        nom = objLector.nextLine();
                
        System.out.print("ingrese el estado civil del trabajador (S/C/U) : ");
        ec = objLector.nextLine();
               
        System.out.print("ingrese el salario bruto del trabajador: ");
        sbto = objLector.nextInt();
   
            switch(ec)
            {
                
                case("S"):
                case("s"):
                    
                    System.out.print("ingrese el sexo del trabajador (M/F): ");
                    sx = objLector.nextLine();
                    
                    if(sx.equals("F") || sx.equals("f") )
                    {
                        bon = sbto * 20/100; 
                    }
                    else
                    {
                        bon = sbto * 15/100;
                    }
                    break;
                    
                case("C"):
                case("c"):
                    
                    bon = sbto * 30/100;
                    break;
                    
                case("U"):
                case("u"):
                    
                    bon = sbto * 25/100;
                    break;
                    
                default:
                    
                    System.out.println("Error en el estado civil.");
                    bon = 0;
            
            } //end switch
            
        snto = sbto + bon;
        
        System.out.println("El trabajador " + nom + " tiene una bonificación de " + bon + " y su salario neto es: " + snto + "\n");
        
        System.out.println("____________________________________________________________________________________________________");
                
        } //end for
    }//end main
}//end public class
