package org.pruebaDiagnosticaVBD.model;


public class Cuadrado extends Forma {
    
    private double base;
    private double altura;
    
    
    public Cuadrado(double base, double altura, String color){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return base*altura;
    }
       
 
}
