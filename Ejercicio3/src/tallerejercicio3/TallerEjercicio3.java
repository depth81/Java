/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tallerejercicio3;
import java.util.Scanner;

/**
 *
 * @author 501
 */
public class TallerEjercicio3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner objLector = new Scanner(System.in);
        
        int taxis, buses, particulares, motos, dineroTaxis, dineroBuses, dineroParticulares, dineroMotos, dineroTotal;
        
        System.out.print("ingrese los taxis: ");
        taxis = objLector.nextInt();
        
        System.out.print("ingrese los buses: ");
        buses = objLector.nextInt();
        
        System.out.print("ingrese los particulares: ");
        particulares = objLector.nextInt();
        
        System.out.print("ingrese las motos: ");
        motos = objLector.nextInt();
        
        dineroTaxis = taxis*3000;
        dineroBuses = buses*10000;
        dineroParticulares = particulares*5000;
        dineroMotos = motos*2000;
        dineroTotal = dineroTaxis + dineroBuses + dineroParticulares + dineroMotos;
        
        System.out.println("el dinero de los taxis es: " + dineroTaxis);
        System.out.println("el dinero de los buses es: " + dineroTaxis);
        System.out.println("el dinero de los particulares es: " + dineroTaxis);
        System.out.println("el dinero de los motos es: " + dineroTaxis);
        System.out.println("el dinero total es: " + dineroTotal);
    }
    
}
