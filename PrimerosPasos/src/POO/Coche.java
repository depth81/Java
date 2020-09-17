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
public class Coche {
    
    //'private': Solo se pueden manipular por los métodos correspondientes.
    private int ruedas;
    
    private int largo;
    
    private int ancho;
    
    private int motor;
    
    private int pesoPlataforma;
    
    //Características que varían dependiendo de cada coche.
    private String color;
    
    private int pesoTotal;
    
    private boolean asientosCuero, climatizador;
    
    //método constructor (lleva el mismo nombre de la clase).Define el estado inicial de un objeto.
    public Coche(){
        
        ruedas = 4;
        
        largo = 2000;
        
        ancho =  300;
        
        motor = 1600;
        
        pesoPlataforma = 500;
        
    }
    
    //método getter(). Porporciona el valor de una propiedad.
     public String dimeDatosGenerales(){
         
         //Obligatorio el 'return'.
         return  "La plataforma del vehículo tiene " + ruedas + " ruedas " +
                 ". Mide " + largo/1000 + " metros, tiene un ancho de " + ancho +
                 " cm y un peso de plataforma de " + pesoPlataforma + " Kg.";
         
     }
      
      //método setter(). Establece o modifica el valor de una propiedad.
      public void estableceColor(String colorCoche){
          
          color = colorCoche;
          
      }
      
      //getter() que me diga el color.
      public String dimeColor(){
          
          return "El color del coche es: " + color;
          
      }
      
      //setter() para los asientos de cuero.
      public void configuraAsientos(String asientosCuero){
          
          //'this' se refiere a la variable de la clase. Una variable se llama igual que el argumento.
          //Si no lleva el 'this' hace referencia al argumento.
          if(asientosCuero.equalsIgnoreCase("si")){
              this.asientosCuero = true;
          }
          else{
              this.asientosCuero = false;
          }
      }
      
       //getter()
       public String dimeAsientos(){
           
           //Acá se hace referencia a la variable de clase sin usar el 'this' porque ya no hay conflicto de nombres.
           if(asientosCuero == true){
               
               return "El coche tiene asientos de cuero";
               
           }else{
               
               return "El coche tiene asientos de serie";
               
           }
           
       }
       
       //setter
       public void configuraClimatizador(String climatizador){
           
           if(climatizador.equalsIgnoreCase("si")){
               
               //Me refiero a la variable de clase 'climatizador'
               this.climatizador = true;
               
           }else{
               
               this.climatizador = false;
               
           }
           
       }
       
       //getter
       public String dimeClimatizador(){
           
           if(climatizador){
               
               return "El coche tiene climatizador";
               
           }else{
               
               return "El coche lleva aire acondicionado sin climatizador";
               
           }
           
       }
       
       //Getter + Setter
        public String dimePesoCoche(){
        
            int pesoCarroceria = 500;
        
            pesoTotal = pesoPlataforma + pesoCarroceria;
            
            if(asientosCuero==true){
                
                pesoTotal = pesoTotal + 50;
                
            }
            if(climatizador){
                
                pesoTotal += 20;
                
            }
            
            return "El peso del coche es: " + pesoTotal;
        
        }
            
        //Getter
        public int precioCoche(){
            
            int precioFinal = 10000;
            
            if(asientosCuero){
                
                precioFinal += 2000;
                
            }
            if(climatizador){
                
                precioFinal += 1500;
                
            }
            
            return precioFinal;
            
        }
    
          
}
    

