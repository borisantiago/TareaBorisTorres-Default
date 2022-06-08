
package com.mycompany.project;


public interface IDispositivo {
    
    final int porcentaje = 0;
    
    public default void prender(String dispositivo){
        System.out.println("Prendiendo " + dispositivo);
    }
    
    public default void apagar(String dispositivo){
        System.out.println("Apagar dispositivo " +dispositivo);
    }
    
    public default void cargarBateria(int voltaje, int tiempoCarga, double duracion){
        System.out.println("Voltaje: " +voltaje);
        System.out.println("Tiempó de carga " +tiempoCarga);
        System.out.println("Tiempo de descarga " +duracion);
    }
    public default double cargarBateria(double voltaje){
        return voltaje*10;
    }
    public default void cargarBateria(double voltaje, double tiempoCarga, String duracion){
        System.out.println("Voltaje " + voltaje);
        System.out.println("Tiempo de carga "+ tiempoCarga);
        System.out.println("Duracion" + duracion);
    }
    
    public void mostrarResolucion() throws Exception;
   

    //public void prender();
            
}
