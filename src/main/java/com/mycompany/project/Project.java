
package com.mycompany.project;

public class Project {

    public static void main(String[] args) throws Exception  {
        Laptop lap = new Laptop();
        Escritorio esc = new Escritorio();
        Movil mov = new Movil();
        
        //encender
        System.out.println("--- ENCENDER DISPOSITIVO ---");
        lap.prender("Laptop");
        esc.prender("PC Escritorio");
        mov.prender("Movil");
        
        System.out.println("");
        
        //apagar
        System.out.println("--- APAGAR DISPOSITIVO ---");
        lap.apagar("Laptop");
        esc.apagar("PC Escritorio");
        mov.apagar("Movil");
        System.out.println("");

        
        //Cargar bateria
        System.out.println("--- CARGAR BATERIA ---");
        lap.cargarBateria(4, 5, 3.5);
        esc.cargarBateria(1.2);
        mov.cargarBateria(9.1, 5, " rapido");
        System.out.println("");

                
        //mostrar resolucion
        
        System.out.println("--- BRILLO ---");
        for(int i=0; ;i++){
            lap.mostrarResolucion();
        }
        
          
        
        
        
    }
}
