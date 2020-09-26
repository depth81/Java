/*
 Promedio, mayor elemento y la suma de los elementos de las posicioines pares.
 */
package clasevectores19sept2020;

/**
 *
 * @author p84029437
 */
public class ClaseOperaciones {
    
    int k;
    
    public double Promedio(int n, int[] numeros){
        
        double promedio, acum=0;
        
        for(k=0; k<n; k++){           
            
            acum+=numeros[k];
            
        }
        
        promedio = acum/n;
        
        return promedio;
        
    }
    
    public int Mayor(int n, int[] salarios){
        
        int mayor = salarios[0];
        
        for(k=0; k<n; k++)
            if(salarios[k] > mayor)
                mayor=salarios[k];
        
        return mayor;
    }
    
    public int Suma(int n, int[] salarios){
        
        int suma=0;
        
        for(k=0;k<n;k++) 
            if(k%2==0)
                suma+=salarios[k];
        
        return suma;
        
    }
    
}
