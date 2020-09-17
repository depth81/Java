/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escribir un algoritmo en donde el usuario ingrese, para N personas, el nombre, el sexo (F/M), y el número de hijos.
Se debe mostrar:
-El nombre de la persona y el valor total del subsidio que es de COP 34800 por cada hijo.
-Cuántas personas corresponden a mujeres.
-Cuántas personas corresponden a hombres.
-Total de hijos de las mujeres.
-Total de hijos de los hombres.

ANÁLISIS =>

Número de registros (N-->Dato identificador --> Ciclo PARA)

Datos de entrada: 
NOM, SX, NRHIJOS

Información de salida: 
NOM, VRTSUB --> cada registro
CUÁNTAS SON MUJERES-> SX="F" (cf) es un contador de madres e incrementa en 1.
CUÁNTOS SON HOMBRES -> SX="H" (ch) es un contador de padres e incrementa en 1.
SUMA NRHIJOS --> SX="F" (ahf) es un acumulador de los hijos de las mujeres e incrementa en una variable.
SUMA NRHIJOS --> SX="M" (ahm) es un acumulador de los hijos de los hombres e incrementa en una variable.

Datos de proceso:
VRTSUB = NRHJOS*34800	

 */
package ejercicio18abril;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio18Abril 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner objLector = new Scanner(System.in);
        
        String nom;
        int n, i, nrhijos, vrtsub, cf=0, ch=0, ahf=0, ahm=0;
        char sx;
        
        System.out.print("Ingrese la cantidad de registros: ");
        n = objLector.nextInt();
        
        for (i=1; i<=n; i++)
        {
            System.out.print("Nombre: ");
            nom = objLector.next();
            
            System.out.print("Sexo: ");
            sx = objLector.next().charAt(0);
            
            System.out.print("Cantidad de hijos: ");
            nrhijos = objLector.nextInt();
            
            vrtsub = nrhijos * 34800;
            
            System.out.print(nom+" El valor que recibe por subsidio es COP:"+vrtsub);
            
            System.out.println(); //espacio en blanco          
            System.out.print("_____________________________________________________");
            System.out.println(); //espacio en blanco
            
            if(sx=='F' || sx=='f')
            {
                cf = cf + 1;
                ahf = ahf + nrhijos;
            }
            else if (sx=='M' || sx=='m')
            {
                ch = ch + 1;
                ahm = ahm + nrhijos;
            }
            else 
            {
                System.out.print("Error en el campo sexo. El registro no fue contabilizado");
                System.out.println();
                //vrtsub = 0;            
            }
            
        }
        
        System.out.print("Cantidad de mujeres: " + cf);
        System.out.println();
        System.out.print("Cantidad de hombres: " + ch);
        System.out.println();
        System.out.print("Total de hijos de las mujeres: " + ahf);
        System.out.println();
        System.out.print("Total de hijos de los hombres: " + ahm);
        System.out.println();
               
    }
    
}
