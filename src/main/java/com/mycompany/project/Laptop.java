
package com.mycompany.project;


public class Laptop implements IDispositivo{
    
    int porcentaje;
    
    @Override
    public void mostrarResolucion() throws Exception{
         porcentaje+=10;
         if(porcentaje == 100){
             parar();
         }
         
         Thread.sleep(1*1000);
         System.out.println(porcentaje);
    }
    
    public void parar() throws Exception {
        throw new Exception(" llego al 100%"); 
    } 
    
}
