/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author p84029437
 */

public class UsoVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear un objeto tipo 'Coche'.
//        Coche miCoche = new Coche();
//        
//        miCoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
//        
//        System.out.println(miCoche.dimeColor());
//        
//        System.out.println(miCoche.dimeDatosGenerales());
//        
//        miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
//        
//        System.out.println(miCoche.dimeAsientos());
//        
//        miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
//        
//        System.out.println(miCoche.dimeClimatizador());
//        
//        System.out.println(miCoche.dimePesoCoche()); //getter + setter
//        
//        System.out.println("El precio final del coche es: " + miCoche.precioCoche());

          Coche miCoche1 = new Coche();
          
          miCoche1.estableceColor("Rojo");
          
          Furgoneta miFurgoneta1 = new Furgoneta(7,580);
          
          miFurgoneta1.estableceColor("Azul");
          
          miFurgoneta1.configuraAsientos("Si");
          
          miFurgoneta1.configuraClimatizador("Si");
          
          System.out.println(miCoche1.dimeDatosGenerales() + " " +  miCoche1.dimeColor());
          
          System.out.print(miFurgoneta1.dimeDatosGenerales() + " "  + miFurgoneta1.dimeDatosFurgoneta());
        
    }
    
    
    
}
