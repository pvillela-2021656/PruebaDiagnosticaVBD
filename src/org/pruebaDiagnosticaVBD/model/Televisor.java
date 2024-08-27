/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public class Televisor extends Dispositivo{
    
    private String tamanoPantalla;

    public Televisor() {
        
    }

    public Televisor(String marca, String modelo, String anio, String tamanoPantalla) {
        super(marca, modelo, anio);
        this.tamanoPantalla = tamanoPantalla;
    }
    
    @Override
    public void encender(){
        System.out.println("La televisión está encendiendo...");
    }
     
    @Override
    public void encender(int volumen){
        System.out.println("El volumen del televisor está en el: " +  volumen + "%");
    }
    
    
    
}
