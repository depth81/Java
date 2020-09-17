/*
Actividad 2. La empresa WC cuenta con 4 empleados. Un empleado labora 8 horas diarias en la modalidad por proyectos. Si el tipo de proyecto es diferente de A y B el valor de la hora día es de $5.000, 
si es tipo B el valor de la hora día es de $10.000 y si es tipo A, el valor de la hora día es de $20.000. Mostrar por consola el valor de la hora día. 
Calcular el sueldo mensual; este cálculo se obtiene de multiplicar el valor de la hora día por las horas laborales diarias (tener en cuenta que son 8 horas diarias y 30 días del mes). 
Luego, Si el sueldo mensual es mayor a $1.500.000 mostrar por consola "Salario es mayor a tope máximo", si sueldo mensual no supera el $1.500.000 
entonces pagarle al empleado por concepto de hora extra el valor de la hora día incrementada en un 6% (tener en cuenta que se le pagarán 3 horas extras).
 */
package repaso_lenguajedeprogramacion_2;

/**
 *
 * @author p84029437
 */
public class Repaso_LenguajeDeProgramacion_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char proyecto;
        int sueldoMensual, valorHora;
        double extra, salarioFinal;
        
        proyecto = 'C';
        salarioFinal=0;
        sueldoMensual=0;
        valorHora=0;
        extra=0;
        
        
        switch(proyecto){
                
                case 'A':     
                    // Mostrar por consola el valor de la hora día
                    System.out.println("El valor de la hora día es: " + 20000);
                    //Calcular el sueldo mensual
                    sueldoMensual=20000*8*30;
                    System.out.println("El sueldo mensual es: " + sueldoMensual);
                    
                    if(sueldoMensual>1500000){
                        System.out.println("Salario es mayor al tope máximo");
                    }
                    else{
                        extra = (20000+(20000*0.06))*3;
                        System.out.println("El valor de la hora extra es: " + extra/3);
                        System.out.println("El nuevo salario es: " + sueldoMensual+extra);
                    }
                  
                    break;
                    
                case 'B':
                    // Mostrar por consola el valor de la hora día
                    System.out.println("El valor de la hora día es: " + 10000);
                    //Calcular el sueldo mensual
                    sueldoMensual=10000*8*30;
                    System.out.println("El sueldo mensual es: " + sueldoMensual);
                    
                    if(sueldoMensual>1500000){
                        System.out.println("Salario es mayor al tope máximo");
                    }
                    else{
                        extra = (10000+(10000*0.06))*3;
                        System.out.println("El valor de la hora extra es: " + extra/3);
                        System.out.println("El nuevo salario es: " + sueldoMensual+extra);
                    }
                    break;
                   
                default:
                     // Mostrar por consola el valor de la hora día
                    System.out.println("El valor de la hora día es: " + 5000);
                    //Calcular el sueldo mensual
                    sueldoMensual=5000*8*30;
                    System.out.println("El sueldo mensual es: " + sueldoMensual);
                    
                    if(sueldoMensual>1500000){
                        System.out.println("Salario es mayor al tope máximo");
                    }
                    else{
                        extra = (5000+(5000*0.06))*3;
                        System.out.println("El valor de la hora extra es: " + extra/3);
                        salarioFinal = sueldoMensual + extra;
                        System.out.println("El nuevo salario es: " + salarioFinal);
                    }
                      
            }// end switch
        
    }
    
}
