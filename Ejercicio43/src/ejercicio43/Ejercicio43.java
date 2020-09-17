/*
    *43. Se tiene una cantidad desconocida de registros, cada registro contiene los datos de un trabajador así : nombre, edad, sexo, número de hijos, estado civil(1=soltero, 2=casado, 3=unión libre), 
sección ala que pertenece(1=planta, 2= ventas, 3=sistemas, 4=contabilidad, 5=administración) salario básico hora, número de horas trabajadas, 
      Elabore un algoritmo que encuentre e imprima:
a) 	Nombre y salario neto de todo el personal.
b) 	Promedio del número de hijos de los hombres de contabilidad.
c) 	Nombre de la persona de sistemas que más salario neto tiene.
d) 	porcentaje que representan las personas solteras de ventas, respecto a todo el personal de ventas.
e)      Nombre de la persona de planta que trabajó el menor número de horas.
f) 	Porcentaje que representan la persona de planta mayor de 50 años, respecto a todas las personas de planta.

NOTA: Las deducciones son iguales al 8.5 % del salario bruto para seguridad social.
	 Las bonificaciones son:	$97.000.oo de subsidio de transporte
					$34.000.oo por cada hijo, como subsidio familiar

+++++++++++			
	
ANÁLISIS =>

N registros significa que se conoce la cantidad de registros y que el usuario sabe de antemano cuántos son.
Dato identificador. Aplica el ciclo PARA.

ENTERO N,I

INICIO 

	ESCRIBA "INGRESE LA CANTIDAD DE REGISTROS: "
	LEA N
	
	PARA I <- 1 HASTA N HAGA
		ESCRIBA I, " CESDE "
		LLAMAR NUEVA_LINEA		
	FIN PARA

FIN

***

Si se tiene una cantidad desconocida de registros entonces se trabaja con el 'dato centinela' y aplica el ciclo MIENTRAS:

CADENA [35] NOM

INICIO

	ESCRIBA "INGRESE EL NOMBRE (* SI DESEA TERINAR): "
		LEA NOM
		
	MIENTRAS(NOM <> "*") HAGA
		
		ESCRIBA NOM, " ESTUDIA EN EL CESDE "
		LLAMAR NUEVA_LINEA
		
		ESCRIBA "INGRESE EL NOMBRE (* SI DESEA TERINAR): "
		LEA NOM
	
	FIN MIENTRAS 
	
FIN
	
******************************

Continuando con el algoritmo...

NOTAS: Para sacar promedios se usa un acumulador, para contar elementos se usa un contador.

Nro. DE REGISTROS: DESCONOCIDO. DATO CENTINELA (CICLO MIENTRAS)

DATOS DE ENTRADA: NOM, NHIJOS, EC, SEC. SBH, NHT

DATOS DE SALIDA: a)NOM, SALARIO TODOS / b) PROMHIJOS NHIJOS (SEC=4)(CREAR ANH4,C4) / c) MAYOR SALARIO (SEC=3) (CREAR MAY, NMAY)/ 
				 d) PORC SOLTEROS ((EC=1) Y (SEC=2)) RESPECTO A TODOS (SEC=2) (CREAR C12, C2) / e) MENOR NHT (SEC=1)
				 
DATOS PROCESO: SALARIO = SBH*NHT
			   PROM = ANH4 / C4
			   PORC = C12 * 100 / C2


 */
 
package ejercicio43;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String NOM, NMAY, NMEN;
        int NHIJOS, EC, SEC, SBH, ANH4, C50, C4, C12, C2, EDAD, C1, C1M50;
        float NHT, SALARIO, MAY, MEN, PORC1, PORC2, PROM;
        
        ANH4 = 0;
 	C4 = 0;
 	MAY = 0;
 	NMAY = "NO APLICA";
 	C12 = 0;
 	C2 = 0;
 	MEN = 500;
 	NMEN = "NO APLICA";
 	EDAD = 0;
 	C1 = 0;
 	C1M50 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre: ('*' para finalizar) ");
        NOM = sc.nextLine();

        while(!NOM.equals("*")){
            
            System.out.print("EDAD: ");
            EDAD = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Nro HIJOS: ");
            NHIJOS = sc.nextInt();
            sc.nextLine();
            
            System.out.print("ESTADO CIVIL (1=SOLTERO, 2=CASADO, 3=UNION LIBRE): ");
            EC = sc.nextInt();
            sc.nextLine();
            
            System.out.print("SECCION: (1=planta, 2= ventas, 3=sistemas, 4=contabilidad, 5=administración):");
            SEC = sc.nextInt();
            sc.nextLine();
            
            System.out.print("VALOR HORA: ");
            SBH = sc.nextInt();
            sc.nextLine();
            
            System.out.print("CANTIDAD DE HORAS: ");
            NHT = sc.nextFloat();
            //sc.nextLine();
            
            SALARIO = NHT * SBH;
            
            System.out.println("TU SALARIO ES: " + SALARIO);
            System.out.println("*************************");
            
            switch(SEC){
                
                case 4:     
                    ANH4 = ANH4 + NHIJOS;
                    C4 = C4 + 1;
                    break;
                    
                case 3:
                    if(SALARIO > MAY){
                        MAY = SALARIO;
 			NMAY = NOM;
                    }
                    break;
                    
                case 2:
                    C2 = C2 + 1;
                    if(EC != 1){
                       C12 = C12 + 1;
                    }           
                    break;
                  
                case 1:
                    C1 = C1 + 1;
                    if(NHT < MEN){
                       MEN = NHT;
                       NMEN = NOM;
                    }      
                    
                    if(EDAD>50){
                        C1M50 = C1M50 + 1;
                    }  
                    break;        
                   
                default:
                    System.out.println("ELIGE UNA OPCION VALIDA");
                      
            }// end switch
            
            sc.nextLine();
            System.out.print("Nombre: ('*' para finalizar) ");
            NOM = sc.nextLine();
            
        } //end while
        
        if(C4 != 0){
            PROM = ANH4 / C4;
            System.out.println("PROMEDIO DEL NÚMERO DE HIJOS DE LAS PERSONAS DE CONTABILIDAD: " + PROM);
        }
        else{
            System.out.println("NO SE INGRESARON PERSONAS DE CONTABILIDAD");
        }
        
        if(C2 != 0){
            PORC1 = C12 * 100 / C2;
            System.out.println("porcentaje que representan las personas solteras de ventas, respecto a todo el personal de ventas: " + PORC1 + "%");
        }
        else{
           System.out.println("NO SE CALCULA EL PORCENTAJE PORQUE NO SE INGRESARON PERSONAS EN VENTAS"); 
        }
        
        if(C1 != 0){
           PORC2 = C1M50 * 100 / C1;
           System.out.println("El porcentaje que representan las personas de planta mayores de 50 años, respecto a todas las personas de planta, es: " + PORC2 + "%");
        }
        else{
            System.out.println("NO SE CALCULA EL PORCENTAJE PORQUE NO SE INGRESARON PERSONAS EN PLANTA");
        }
        
        System.out.println("PERSONA DE SISTEMAS QUE MÁS SALARIO TIENE: " + NMAY + " CON $" + MAY);
        
        System.out.println("PERSONA DE PLANTA QUE TRABAJO EL MENOR NUMERO DE HORAS: " + NMEN + " CON " + MEN + " HORAS.");
        
    } //end main
    
} //end public class


