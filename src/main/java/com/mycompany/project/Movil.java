
package com.mycompany.project;


public class Movil implements IDispositivo{

    int porcentaje;
    
    @Override
    public void mostrarResolucion() throws Exception {
    porcentaje+=3;
         if(porcentaje == 100){
             parar();
         }
         System.out.println(porcentaje);
    }
    
    public void parar() throws Exception {
        throw new Exception("Finaliza"); 
    } 

    
}
