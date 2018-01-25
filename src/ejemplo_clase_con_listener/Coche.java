/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clase_con_listener;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import java.util.EventObject;

/**
 *
 * @author chern007
 */
public class Coche {

    private String marca;
    private String color;
    private int cilindrada;
    private int matricula;
    private PropiedadesListener avisador;

    public void setAvisador(PropiedadesListener avisador) {
        this.avisador = avisador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        
       ObjetoEventoCambios cambioMarca = new ObjetoEventoCambios(this);
       avisador.cambioColor(cambioMarca);
       
        
        
        
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    

}

interface PropiedadesListener extends EventListener {

    public abstract void cambioMarca(ObjetoEventoCambios ev);

    public abstract void cambioColor(ObjetoEventoCambios ev);

    public abstract void cambioCilindrada(ObjetoEventoCambios ev);

    public abstract void cambioMatricula(ObjetoEventoCambios ev);

}

class ObjetoEventoCambios extends EventObject{
    
//    Coche coche;
//    
//    public ObjetoEventoCambios(Object source,Coche _coche) {
//        super(source);
//        this.coche = _coche; 
//        
//    }    
    
    
    
    
    public ObjetoEventoCambios(Object source) {
        super(source);
        
    }
}
