/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Estudiante
 */
public class Engire {
    private String marca;
    private int potencia;
    Wheel [] axle;
    
    public Engire (){
        this.marca = "Honda";
        this.potencia = 11000;
    }
    
    public Engire(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
        
    
    }
    
    public void setAxle (Wheel [] axle){
        this.axle = axle;
    
    }

    @Override
    public String toString() {
        return "Engire{" + "marca=" + marca + ", potencia=" + potencia + ", axle=" + axle + '}';
    }
    
}
