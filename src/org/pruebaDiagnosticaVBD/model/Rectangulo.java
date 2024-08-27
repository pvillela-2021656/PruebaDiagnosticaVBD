
package org.pruebaDiagnosticaVBD.model;


public abstract class Rectangulo extends Forma{
    
    private double largo;
    private double ancho;
    
    
    public Rectangulo(int largo, int ancho, String color){
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }    
    
    @Override
    public double calcularArea(){
        return largo*ancho;
    }
    
    @Override
    public String toString(){
        return "El largo es de"+largo+"el ancho es de"+ancho;
    }
}
