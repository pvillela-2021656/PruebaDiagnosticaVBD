package org.pruebaDiagnosticaVBD.model;


public class Cuadrado extends Forma {
    // atributos
    private double base;
    private double altura;
    
    
    public Cuadrado(double base, double altura, String color){
        super(color);
        this.base = base;
        this.altura = altura;
    }
    /*
    metodo para calcular el area del cuadrado
    */
    @Override
    public double calcularArea(){
        return base*altura;
    }
       
 
}
