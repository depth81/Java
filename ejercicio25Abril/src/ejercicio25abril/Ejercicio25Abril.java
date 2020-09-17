/*
Se tiene una cantidad desconocida de registros, cada regitro contiene
el nombre, el sexo, la edad y la estatura de una persona.
Se desea un programa que muestre:
	- Promedio de estatura de los hombres
	- porcentaje que representan las mujeres mayores de edad 
	  respecto a todas las mujeres	

ANÁLISIS

NRO REGISTROS	{? ==> DATO CENTINELA ==> CICLO MIENTRAS

DATOS DE ENTRADA{NOM, SX, ED, EST 

INF. SALIDA		{PROMEDIO EST --> SX = "M"  -->AESTM 
                                                       CM	
														   	
			 PORCENTAJE SX = "F", ED >=18 /  SX = "F"->CFMAY
								   CF
														   	
DATOS PROCESO	{PROMEDIO = AESTM / CM	
		 PORCENTAJE = CFMAY * 100 / CF
				 
*/



package ejercicio25abril;
import java.util.*;

/**
 *
 * @author p84029437
 */
public class Ejercicio25Abril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objLector = new Scanner(System.in);
        String nom;
        Character sex;
        int ed, cm=0, cfmay=0, cf=0;
        float est, aestm = 0, promedio=0, porcentaje=0;
        System.out.print("Nombre (Ingrese * si desea terminar): ");
        nom = objLector.next();  //lectura de String
        
        while(!nom.equals("*"))  // ! al principio para negar ("mientras no sea igual a *)
        {
            
            System.out.print("Sexo (F/M): ");
            sex = objLector.next().charAt(0);   //leer un caracter
            System.out.print("Edad: ");
            ed = objLector.nextInt();  //leer un entero
            System.out.print("Estatura: ");
            est = objLector.nextFloat();  //leer un float
            
            if((sex == 'M') || (sex == 'm'))
            {
                
                aestm = aestm + est;   //acumulando estaturas
                cm = cm + 1;    //contador de hombres
                
            }
            else if((sex == 'F') || (sex == 'f')) 
            {
            
                cf = cf + 1;   //contador de mujeres
                
                if(ed>=18)
                {
                
                    cfmay = cfmay + 1;
                
                }
            
            }
            else 
            {
            
                System.out.println("Error en el campo 'sexo'. Registro no procesado");
            
            }
           
        System.out.print("Nombre (Ingrese * si desea terminar): ");
        nom = objLector.next();  //lectura de String
            
        }// end while
        
        //Validar (si es necesario) y mostrar los resultados
        
        if(cm != 0)  //validar posible división entre 0 si no se ingresan hombres
        {
        
            promedio = aestm / cm;
            System.out.println("El promedio de estatura de los hombres es: " + promedio);
        
        }
        // no hay else porque si no se ingrsan hombres, ya el promedio fue inicializado en 0
        
        if (cf != 0)  //validar posible división entre 0 si no se ingresan mujeres
        {
        
            porcentaje = cfmay * 100 / cf;
            System.out.println("Porcentaje de mujeres mayores de edad "
                    + "respecto a todas las mujeres es: " + porcentaje + "%");
        
        }
        // no hay else porque si no se ingrsan mujeres, ya el porcentaje fue inicializado en 0
       
    }//end main
}//end public class

