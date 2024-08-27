
package org.pruebaDiagnosticaVBD.model;


public class Rectangulo extends Forma{
    
    //atributos
    private double largo;
    private double ancho;
    
    
    public Rectangulo(int largo, int ancho, String color){
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }    
    /*
    metodo para calcualr el area del rectangulo
    */
    @Override
    public double calcularArea(){
        return largo*ancho;
    }
}
