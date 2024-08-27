/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Circulo extends Forma {

    private double radio;

    /*
    atributos de la subclase circulo
     */
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    // metodo para calcular el area del circulo
    @Override
    public double calcularArea() {
        return Math.PI * radio * 2;
    }
}
