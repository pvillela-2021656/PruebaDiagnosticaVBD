package org.pruebaDiagnosticaVBD.model;


public class Triangulo extends Forma {
    
    /*
    Atributos de la subclase triangulo
    */
    private double base;
    private double altura;
    
    
    
    public Triangulo(int base, int altura, String color){
        super(color);
        this.base = base;
        this.altura = altura;
        
    }
    
    /*
    metodo para calcular el area del triangulo
    */
    @Override
    public double calcularArea(){
        return base*altura/2;
    }
    
}
