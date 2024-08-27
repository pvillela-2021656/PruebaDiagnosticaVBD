/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Computadora extends Dispositivo {

    String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, String anio, String sistemaOperativo) {
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("La computadora está encendiendo...");
    }

    public void encender(String clave) {
        System.out.println("El dispositivo se desbloqueo con el codigo: " + clave);
    }

}
