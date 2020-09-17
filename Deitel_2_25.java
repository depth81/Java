/*(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par [sugerencia:
use el operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando
se divide entre 2]. */

import java.util.Scanner;

public class Deitel_2_25 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int numero;
        int residuo;

        System.out.print("Escriba el numero entero: ");
        numero = entrada.nextInt(); 
    
        residuo = numero % 2;

        if (residuo == 0){
            System.out.println("El numero es par");
        }
        if (residuo != 0){
            System.out.println("El numero es impar");
        }
        
    }

}