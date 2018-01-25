/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clase_con_listener;

import java.awt.Event;
import java.util.EventObject;

/**
 *
 * @author chern007
 */
public class Ejemplo_clase_con_listener {

    /**
     * @param args the command line arguments
     */
    
    private static PropiedadesListener escuchadorConMetodos = new PropiedadesListener(){
        @Override
        public void cambioMarca(ObjetoEventoCambios ev) {
            System.out.println("Se ha cambiado la MARCA");
        }

        @Override
        public void cambioColor(ObjetoEventoCambios ev) {
            System.out.println("Se ha cambiado el COLOR");
        }

        @Override
        public void cambioCilindrada(ObjetoEventoCambios ev) {
            System.out.println("Se ha cambiado la CILINDRADA");
        }

        @Override
        public void cambioMatricula(ObjetoEventoCambios ev) {
            System.out.println("Se ha cambiado la MATRICULA");
        }
    
};    
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();        
        miCoche.setAvisador(escuchadorConMetodos);
        
        miCoche.setMarca("Peugeot");
        
    }
    
}
