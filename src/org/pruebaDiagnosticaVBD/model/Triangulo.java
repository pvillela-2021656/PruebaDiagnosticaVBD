package org.pruebaDiagnosticaVBD.model;


public abstract class Triangulo extends Forma {
    
    
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
    
    @Override
    public String toString(){
        return "La base es de" + base + "la altura es de" + altura;
    }
}
