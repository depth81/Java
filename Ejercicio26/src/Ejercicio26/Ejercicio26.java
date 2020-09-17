/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio26;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String sexo, nom; 
        double estatura,peso,edad;
          
        Scanner objLector = new Scanner(System.in);
        
        System.out.print("ingrese el nombre: ");
        nom = objLector.nextLine();
        
        System.out.print("ingrese el sexo, (MASCULINO) para Hombre y (FEMENINO) para Mujer: ");
        sexo = objLector.nextLine();
        
        System.out.print("ingrese la estatura (m): ");
        estatura = objLector.nextDouble();
        
        System.out.print("ingrese el peso (Kg): ");
        peso = objLector.nextDouble();
        
        System.out.print("ingrese la edad: ");
        edad = objLector.nextDouble();
        
              
        
        if(sexo.equals("FEMENINO"))
        {
            if ((edad>16)&&(estatura>=1.70)&&(peso<=60))
            {
                System.out.print("La aspirante " + nom + " es apta");
            }
            else 
            {
                System.out.print("La aspirante " + nom + " no es apta");
            }
        }
        else if(sexo.equals("MASCULINO")) 
        {
            
            if ((edad>=18)&&(estatura>=1.70)&&(peso<=75))
            {
                System.out.print("El aspirante " + nom + " es apto");
            }
            else 
            {
                System.out.print("El aspirante " + nom + " no es apto");
            }
            
        }
        else 
        {
            System.out.print("ingrese una opción correcta");
        }
    }
    
}
    
