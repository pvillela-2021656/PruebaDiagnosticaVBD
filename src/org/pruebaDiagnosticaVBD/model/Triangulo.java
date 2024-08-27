package org.pruebaDiagnosticaVBD.model;


public class Triangulo extends Forma {
    
    
    private double base;
    private double altura;
    
    
    
    public Triangulo(int base, int altura, String color){
        super(color);
        this.base = base;
        this.altura = altura;
        
    }
    
    
    @Override
    public double calcularArea(){
        return base*altura/2;
    }
    
}
