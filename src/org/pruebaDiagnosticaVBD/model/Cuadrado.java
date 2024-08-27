/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Cuadrado extends Forma {
    // atributos

    private double base;
    private double altura;

    public Cuadrado(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    /*
    metodo para calcular el area del cuadrado
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
}
