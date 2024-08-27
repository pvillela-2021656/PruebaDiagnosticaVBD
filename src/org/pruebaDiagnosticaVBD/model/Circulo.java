
package org.pruebaDiagnosticaVBD.model;

public abstract class Circulo extends Forma {
    
    private double radio;
    
    
    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio*2;
    }

    @Override
    public String toString() {
        return "Circulo con radio: " + radio + " y color: " + getColor();
    }
}
    
    
    
    
    
    

