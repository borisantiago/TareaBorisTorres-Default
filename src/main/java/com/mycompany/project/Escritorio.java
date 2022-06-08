
package com.mycompany.project;

public class Escritorio implements IDispositivo {

    int porcentaje;
    
    @Override
    public void mostrarResolucion() throws Exception {
         porcentaje+=2;
         if(porcentaje == 100){
             parar();
         }
         System.out.println(porcentaje);
    }
    
    public void parar() throws Exception {
        throw new Exception("Finaliza"); 
    } 

      
}
