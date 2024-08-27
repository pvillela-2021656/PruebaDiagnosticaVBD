/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Telefono extends Dispositivo{

    private String tipo;    
    
    public Telefono() {
    }

    public Telefono(String marca, String modelo, String anio, String tipo) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    
    
    @Override
    public void encender(){
        System.out.println("El télefono está encendido...");
    }
    
    public void encender(String codigo){
        System.out.println("El dispositivo se desbloqueo con el codigo: " + codigo);
    }
    
    
    
}
