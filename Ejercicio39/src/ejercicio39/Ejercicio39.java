/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

39. Se tiene un grupo de registros, no se conoce cuantos, cada registro contiene el nombre, la edad, estatura (cm), sexo (1=hombre, 2=mujer), 
deporte (1=natación, 2= fútbol, 3=ciclismo, 4=patinaje, 5=otro deporte). 
    Elabore un algoritmo que imprima:
• Promedio de edad de las personas que prefieren el fútbol.
• Porcentaje que representan las mujeres que prefieren el ciclismo respecto a las personas de ciclismo.
• Nombre de la mujer más alta en patinaje.
• Cuantos de los que practican natación, pesan menos de 50 kg y miden más de 1.80 m.
• Promedio de edad de todas las personas sin importar el deporte que practiquen.

 */
package ejercicio39;
import java.util.Scanner;
/**
 *
 * @author p84029437
 */
public class Ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        
        String nom = null, nMayEst = null;
        int ed, sx, dep, est, mayEst, ct, acedFut, c1, c2, c3, c4, c5, c23, cn, aced;
        float promF, promT, porc, peso;
        
        promF = 0;
        promT = 0;
        porc = 0;
        mayEst = 0;
        ct = 0;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        c23 = 0;
        cn = 0;
        acedFut = 0;
        peso = 0;
        aced = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nombre: ('*' para finalizar) ");
        nom = sc.nextLine();
        
        while(!nom.equals("*")){
                              
           System.out.print("Edad: ");
           ed = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Estatura (cm): ");
           est = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Peso (Kg): ");
           peso = sc.nextFloat();
           sc.nextLine();
           
           System.out.print("Sexo: (1=hombre, 2=mujer) de la persona: ");
           sx = sc.nextInt();
           sc.nextLine();
           
           System.out.print("Deporte: (1=natación, 2= fútbol, 3=ciclismo, 4=patinaje, 5=otro deporte): ");
           dep = sc.nextInt();
           sc.nextLine();
           
           ct+=1;  //Aumenta con cada persona que se ingresa.
           aced = aced + ed;  //Acumula la edad de cada persona ingresada.
           
           switch(dep){
           
               case 1:
                   c1=c1+1;
                   if(peso<=50 && est>=180){
                       cn+=1;
                   }
                   break;
               case 2:
                   c2=c2+1;
                   acedFut = acedFut + ed;
                   break;
               case 3:
                   c3=c3+1;
                   if(sx==2){
                     c23+=1;           
                   }
                   break;
               case 4:
                   c4=c4+1;
                   if(est>mayEst){
                       mayEst = est;
                       nMayEst = nom;
                   }
                   break;
               case 5:
                   c5=c5+1;
                   break;
               default:
                   
                    System.out.println("ELIGE UNA OPCION VALIDA");
                    
           } //end switch
           
           //sc.nextLine();
           System.out.print("Nombre: ('*' para finalizar) ");
           nom = sc.nextLine();
                      
        } // end while

        if(c2 != 0){
            promF = acedFut / c2;
            System.out.println("Promedio de edad de las personas que prefieren el fútbol: " + promF);
        }
        else{
            System.out.println("No se ingresaron personas en fútbol");
        }
        
        if(c3 != 0){
            porc = c23 * 100 / c3;
            System.out.println("Porcentaje que representan las mujeres que prefieren el ciclismo respecto a las personas de ciclismo: " + porc + "%");
        }
        else{
            System.out.println("No se ingresaron personas en ciclismo");
        }
        
        System.out.println("La mujer más alta en patinaje es: " + nMayEst + " con: " + mayEst + " cm");
        
        System.out.println("De los que practican natación, " + cn + " pesan menos de 50 kg y miden más de 180 cm.");
          
        
        if(ct != 0){
            promT = aced / ct;
            System.out.println("El Promedio de edad de todas las personas sin importar el deporte que practiquen es: " + promT);
        }
        else{
            System.out.println("No se ingresaron personas en ningún deporte");
        }
              
    } // end main()
    
} //end public class
