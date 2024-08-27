/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Rectangulo extends Forma {

    //atributos
    private double largo;
    private double ancho;

    public Rectangulo(String color, double largo, double ancho) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    /*
    metodo para calcualr el area del rectangulo
     */
    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}
