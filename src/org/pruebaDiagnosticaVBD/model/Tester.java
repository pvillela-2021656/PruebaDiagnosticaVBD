/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Tester extends Empleado {

    private String tipoPruebas;

    // Constructor
    public Tester(String nombre, int edad, double salario,String tipoPruebas) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }

    // Implementación del método abstracto trabajar.
    @Override
    public void trabajar() {
        System.out.println(nombre + " esta usando la prueba " + tipoPruebas);
    }

    // Sobrecarga del método trabajar.
    public void trabajar(String herramienta, String proyecto) {
        System.out.println(nombre + " esta trabajando en el proyecto " + proyecto + " con la herramienta " + herramienta);
    }
}
