
package org.pruebaDiagnosticaVBD.model;

public class Circulo extends Forma {
    
    private double radio;
    
    /*
    atributos de la subclase circulo
    */
    public Circulo(double radio, String color){
        super(color);
        this.radio = radio;
    }
    
    // metodo para calcular el area del circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio*2;
    }

}
    
    
    
    
    
    

