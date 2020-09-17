/* (Múltiplos) Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo e
imprima el resultado. [Sugerencia: use el operador residuo]. */

import java.util.Scanner;

public class Deitel_2_26{

public static void main(String[] args) {
    
// crea objeto Scanner para obtener la entrada de la ventana de comandos
 Scanner entrada = new Scanner(System.in);

 int num1, num2, residuo;

 System.out.print("escriba el primer entero: ");
 num1 = entrada.nextInt();

 System.out.print("escriba el segundo entero: ");
 num2 = entrada.nextInt();

residuo = num1 % num2;

if (residuo == 0) {
    System.out.println("el primer numero es multiplo del segundo");
  }
else {
    System.out.println("el primer numero NO es multiplo del segundo");
  }
  
}

}