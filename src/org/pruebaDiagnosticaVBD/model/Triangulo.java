/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Triangulo extends Forma{
    
    /*
    Atributos de la subclase triangulo
    */
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura){
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
