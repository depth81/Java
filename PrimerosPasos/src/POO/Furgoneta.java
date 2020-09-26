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
public class Furgoneta extends Coche{
    
    private int capacidadCarga;
    
    private int plazasExtra;
    
    //Método constructor()
    public Furgoneta(int plazasExtra, int capacidadCarga){
        
        //super() llama al constructor de la clase Padre (Coche)
        super();
        
        //Agregar las propiedades específicas de una furgoneta.
        this.capacidadCarga = capacidadCarga;
        
        this.plazasExtra = plazasExtra;
        
    }
    
    //getter()
    public String dimeDatosFurgoneta(){
        
        return "la capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;
        
    }
    
}
