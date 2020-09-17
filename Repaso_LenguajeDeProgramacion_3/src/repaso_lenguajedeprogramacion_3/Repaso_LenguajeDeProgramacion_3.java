/*
Actividad 3. El hotel WC, está interesado en realizar la automatización de los precios a cobrar por habitación dependiendo de la cantidad de huéspedes; a los que se les deberá cobrar 
una tarifa acorde a los días de estadía. Y al final se le debe realizar un descuento. Tener presente:

        TARIFAS
INDIVIDUAL	$2.500
DOBLE           $4.600
FAMILIAR	$5.200

Para los cobros:
●	En caso de que llegue un solo huésped, el precio de la habitación será la cantidad de días que se va a hospedar por la tarifa individual.
●	En caso de que llegue una pareja de huéspedes, el precio de la habitación será la cantidad de días que se van a hospedar por la tarifa doble.
●	Y en el caso de que lleguen tres huéspedes, el precio de la habitación será la cantidad de días que se van a hospedar por la tarifa familiar.
Para los descuentos:
●	Para un solo huésped se le aplicará un descuento del 5% sobre el cobro con IVA
●	Para la pareja de huéspedes se les aplicará un descuento del 9% sobre el cobro con IVA
●	Y para tres huéspedes se les aplicará un descuento del 15% sobre el cobro con IVA

 */
package repaso_lenguajedeprogramacion_3;

/**
 *
 * @author p84029437
 */
public class Repaso_LenguajeDeProgramacion_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int nroHuespedes, precioHab, costoTotal, dias;
        double precioDcto, precioIVA;
        
        nroHuespedes=4;
        precioHab=0;
        costoTotal=0;
        dias=4;
        precioIVA=0;
        precioDcto=0;
        
        if(nroHuespedes==1){
            precioHab=dias*2500;
            System.out.println("Precio sin IVA: " + precioHab);
            precioIVA = precioHab + precioHab*0.16;
            System.out.println("Precio con IVA: " + precioIVA);
            precioDcto = precioIVA - precioIVA*0.05;
            System.out.println("Precio con descuento: " + precioDcto);
        }
        else if(nroHuespedes==2){
            precioHab=dias*4600;
            System.out.println("Precio sin IVA: " + precioHab);
            precioIVA = precioHab + precioHab*0.16;
            System.out.println("Precio con IVA: " + precioIVA);
            precioDcto = precioIVA - precioIVA*0.09;
            System.out.println("Precio con descuento: " + precioDcto);
        }
        else{
            precioHab=dias*5200;
            System.out.println("Precio sin IVA: " + precioHab);
            precioIVA = precioHab + precioHab*0.16;
            System.out.println("Precio con IVA: " + precioIVA);
            precioDcto = precioIVA - precioIVA*0.15;
            System.out.println("Precio con descuento: " + precioDcto);
        }
        
    }
    
}
