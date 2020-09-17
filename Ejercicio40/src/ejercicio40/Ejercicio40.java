/*
40. Para una cantidad desconocida de registros, se lee: nombre, edad (1=Masculino, 2=Femenino), sexo, estado civil (1=soltero, 2=casado, 3= unión libre, 4=viudo), carrera (1=sistemas, 2=programación, 3=mantenimiento, 4=diseño).
    Elabore un algoritmo que encuentre e imprima:
a) 	Nombre de la mujer de sistemas más joven.
b) 	Nombre del hombre más viejo en sistemas.
c) 	Promedio de edad de las personas de programación que son casadas
d) 	Porcentaje que representan los menores de edad que estudian mantenimiento respecto a todas las personas de mantenimiento.
e) 	Cuantas personas de diseño son mujeres mayores de edad.
 */

package ejercicio40;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom = null, nMen = null, nMay = null;
        int ed, sx, ec, ca=0, c1=0, c2=0, c3=0, c4=0, cs=0, cc=0, cul=0, cv=0, ct=0, cme=0, cmay=0, aced=0;
        float prom=0, porc=0, may=0, men=500;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ('*' para finalizar) ");
        nom = sc.nextLine();
        
        while(!nom.equals("*")){
                              
           System.out.print("Edad: ");
           ed = sc.nextInt();
           sc.nextLine();
                    
           System.out.print("Sexo(1=Masculino, 2=Femenino): ");
           sx = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Estado civil(1=soltero, 2=casado, 3= unión libre, 4=viudo): ");
           ec = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Carrera(1=sistemas, 2=programación, 3=mantenimiento, 4=diseño): ");
           ca = sc.nextInt();
           sc.nextLine();
           
           ct+=1;  //Aumenta con cada persona que se ingresa.
                    
           switch(ca){
           
               case 1:
                   c1=c1+1;
                   if(sx==2){
                       if(ed < men){
                           men = ed;
                           nMen = nom;
                       }
                   }
                   if(sx==1){
                       if(ed > may){
                           may = ed;
                           nMay = nom;
                       }
                   }
                   break;
               
               case 2:
                   c2=c2+1;
                   if(ec==2){
                       cc = cc + 1;
                       aced = aced + ed;
                   }
                   break;
               
               case 3:
                   c3=c3+1;
                   if(ed < 18){
                       cme+=1;
                   }
                   break;
               
               case 4:
                   c4=c4+1;
                   if(sx==2){
                       if(ed >= 18){
                           cmay+=1;
                       }
                   }
                   break;
               default:
                   
                    System.out.println("ELIGE UNA OPCION VALIDA");
                    
           } //end switch
           
           System.out.print("Nombre: ('*' para finalizar) ");
           nom = sc.nextLine();

        } //wnd while
        
        System.out.println("El mombre de la mujer de sistemas más joven es: " + nMen + " con: " + men + " años de edad.");
        
        System.out.println("El nombre del hombre de mayor edad en sistemas es: " + nMay + " con: " + may + " años de edad.");
        
        if (c2 != 0 && cc != 0){
            prom = aced / cc;
            System.out.println("El promedio de edad de las personas de programación que son casadas es: " + prom);
        }
        else{
            System.out.println("No se ingresaron personas casadas en la carrera de sistemas");
        }
        
        if(c3 != 0 && cme != 0){
            porc = cme * 100 / c3;
            System.out.println("El porcentaje que representan los menores de edad que estudian mantenimiento respecto a todas las personas de mantenimiento es: " + porc + "%");
        }
        else{
            System.out.println("No se ingresaron menores de edad en la carrera de mantenimiento");
        }
        
        System.out.println("Hay " + cmay + " mujeres mayores de edad matriculadas en la carrera de diseño");
        
    }//end main()
    
}//end
