// Fig. 2.7: Suma.java
// Programa que recibe dos números y muestra la suma.
import java.util.Scanner; // el programa usa la clase Scanner

public class Suma
{
// el método main empieza la ejecución de la aplicación en Java
public static void main(String[] args)
{
// crea objeto Scanner para obtener la entrada de la ventana de comandos
Scanner entrada = new Scanner(System.in);

int numero1; // primer número a sumar
int numero2; // segundo número a sumar
int suma; // suma de numero1 y numero2

System.out.print("Escriba el primer entero: "); // indicador
numero1 = entrada.nextInt(); // lee el primer número del usuario

System.out.print("Escriba el segundo entero: "); // indicador
numero2 = entrada.nextInt(); // lee el segundo número del usuario

suma = numero1 + numero2; // suma los números, después almacena el total en suma

System.out.printf("La suma es %d%n", suma); // muestra la suma
 } // fin del método main
} // fin de la clase Suma