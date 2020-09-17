/*
/* 
2020/13/06
PAULO ENRIQUE TORO VALDERRAMA (71370437) - SÁBADOS


CESDE
ESCUELA DE INNOVACIÓN INDUSTRIAL
Técnico Laboral como Asistente en Desarrollo de Software
LÓGICA DE PROGRAMACIÓN
Evaluación de desempeño y producto segundo momento


Una empresa inmobiliaria registra, por cada propiedad, los siguientes datos:
Código de la propiedad, dirección, ciudad,  tipo (1= Casa, 2=Apartamento, 3 = Local comercial y 4 = Finca), área, número de habitaciones y valor alquiler. Elabore un algoritmo que procese estos registros y encuentre:

1. Código de la casa con mayor valor de alquiler
2. Promedio del número de habitaciones de los apartamentos 
3. Porcentaje que representan las fincas localizadas en Copacabana con respecto a todas las fincas
4. Dirección del local comercial de menor área

 */


package evaluacionmomento2;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class EvaluacionMomento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String COD, DIR, CIUDAD, CODMAY="No aplica", DIRMEN="No aplica", CIUDADMEN="No aplica";
        int TP, C1=0, C2=0, C3=0, C4=0, ACH2=0, C4COPA=0, NUMHAB;
        float PROMHAB, PORC4COPA=0, VALQ, AREA, VALMAY=0, AREAMEN=1000000;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Codigo('*' para finalizar):  ");
        COD = sc.nextLine();
                
        while(!COD.equals("*")){
        
            System.out.print("Dirección: ");
            DIR = sc.nextLine();
            
            System.out.print("Ciudad: ");
            CIUDAD = sc.nextLine();
            
            System.out.print("Tipo (1= Casa, 2=Apartamento, 3 = Local comercial y 4 = Finca): ");
            TP = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Area: ");
            AREA = sc.nextFloat();
            
            System.out.print("Habitaciones: ");
            NUMHAB = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Valor del alquiler: ");
            VALQ = sc.nextInt();
            sc.nextLine();
            
            System.out.println("************");
            
            switch(TP){
            
                case 1: 
                    C1+=1;
                    if(VALQ > VALMAY){
                        VALMAY = VALQ;
 			CODMAY = COD;
                    }
                break;
                
                case 2: 
                    C2+=1;
                    ACH2 = ACH2 + NUMHAB;
                break;
                
                case 3: 
                    C3+=1;
                    if(AREA < AREAMEN){
                        AREAMEN = AREA;
 			DIRMEN = DIR;
 			CIUDADMEN = CIUDAD;
                    }
                break;
                
                case 4: 
                    C4+=1;
                    if(CIUDAD.equals("COPACABANA") || CIUDAD.equals("Copacabana") || CIUDAD.equals("copacabana")){
                        C4COPA = C4COPA+1;	
                    }
                break;
                
                default:
                    System.out.println("ELIGE UNA OPCION VALIDA");
                
            }//end switch
        
            System.out.println("Codigo('*' para finalizar):  ");
            COD = sc.nextLine();
            
        }//end while
        
        //1. Código de la casa con mayor valor de alquiler
        if(C1!=0){
            System.out.println("EL CODIGO DE LA CASA CON MAYOR VALOR DE ALQUILER ES: " + CODMAY);
        }
        else{
            System.out.println("DATOS NO DISPONIBLES. NO SE INGRESARON CASAS.");
        }
        
       //2. Promedio del número de habitaciones de los apartamentos.
        if(C2!=0){
            PROMHAB = ACH2 / C2;
            System.out.println("EL PROMEDIO DEL NUMERO DE HABITACIONES DE LOS APARTAMENTOS ES: " + PROMHAB);
        }
        else{
            System.out.println("DATOS NO DISPONIBLES. NO SE INGRESARON APARTAMENTOS.");
        }
     
        //3. Porcentaje que representan las fincas localizadas en Copacabana con respecto a todas las fincas
        if(C4!=0){
            PORC4COPA = C4COPA * 100 / C4;
            System.out.println("EL PORCENTAJE QUE REPRESENTAN LAS FINCAS UBICADAS EN COPACABANA RESPECTO A TODAS LAS FINCAS ES: " + PORC4COPA + "%");
        }
        else{
            System.out.println("DATOS NO DISPONIBLES. NO SE INGRESARON FINCAS.");
        }
        
        //4. Dirección del local comercial de menor área
        if(C3!=0){
            System.out.println("LA DIRECCION DEL LOCAL COMERCIAL CON LA MENOR AREA ES: " + DIRMEN + " EN LA CIUDAD DE " + CIUDADMEN + ", CON UN AREA DE: " + AREAMEN + " m2" );
        }
        else{
            System.out.println("DATOS NO DISPONIBLES. NO SE INGRESARON LOCALES COMERCIALES.");
        }
        
    }//end main()
    
}//end
