/*
41. Para una cantidad desconocida de registros, se lee: nombre, edad (1=Masculino, 2=Femenino), sexo, estado civil (1=soltero, 2=casado, 3= unión libre, 4=viudo), carrera (1=sistemas, 2=programación, 3=mantenimiento, 4=diseño).
    Elabore un algoritmo que encuentre e imprima:
a) Promedio de edad de todas las mujeres
b) Promedio de edad de todos los hombres
c) Cuantas personas son solteras.
d) Nombre de la persona casada más joven (sin importar el sexo).
e) Porcentaje que representan los viudos respecto al total de las personas.
f) Nombre de todos los de unión libre que tengan más de 80 años.
 */

package ejercicio41;
import java.util.Scanner;

/**
 *
 * @author p84029437
 */
public class Ejercicio41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nom = null, nom80 = null, nMen = null;
        int ed, sx, ec, ca=0, c4=0, cs=0, ct=0, acedh=0, acedm=0, cm=0, ch=0;
        float promedtm=0, promedth=0, porcv=0, men=500;
        
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
           
           if(sx==2){
               acedm = acedm + ed;
               cm+=1;
           }
           else{
               acedh = acedh + ed;
               ch+=1;
           }
           
           switch(ec){
           
               case 1:
                   cs=cs+1;
                   break;
               
               case 2:
                   if(ed < men){
                       men = ed;
                       nMen = nom;
                   }
                   break;
               
               case 3:
                   if(ed > 80){
                       nom80 += nom + ", ";
                   }
                   break;
               
               case 4:
                   c4=c4+1;
                   break;
               
               default:
                    System.out.println("ELIGE UNA OPCION VALIDA");
                    
           } //end switch
           
           System.out.print("Nombre: ('*' para finalizar) ");
           nom = sc.nextLine();
           
         }//end while
         
         if(cm != 0){
             promedtm = acedm / cm;
             System.out.println("El promedio de edad de todas las mujeres es: " + promedtm);
         }
         else{
             System.out.println("No se ingresaron mujeres");
         }
         
         if(ch != 0){
             promedth = acedh / ch;
             System.out.println("El promedio de edad de todos los hombres es: " + promedth);
         }
         else{
             System.out.println("No se ingresaron hombres");
         }        
             
         System.out.println("El número de personas solteras es: " + cs);
         
         System.out.println("El nombre de la persona casada más joven es: " + nMen + " con " + men + " años de edad.");
         
         if(ct != 0 && c4 != 0){
             porcv = c4 * 100 / ct;
             System.out.println("El porcentaje que representan los viudos respecto al total de las personas es: " + porcv + "%");
         }
         
         System.out.println("Los nombres de todos los de unión libre que tienen más de 80 años son: " + nom80.substring(4));
          
    }//end main()
    
}//end
