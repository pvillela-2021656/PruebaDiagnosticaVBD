
package org.pruebaDiagnosticaVBD.model;

public class Circulo extends Forma {
    
    private double radio;
    
    
    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio*2;
    }

}
    
    
    
    
    
    

