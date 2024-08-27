/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.pruebaDiagnosticaVBD.system;

import org.pruebaDiagnosticaVBD.model.*;

/**
 *
 * @author informatica
 */
public class Main {

    
    public static void main(String[] args) {
        
        Telefono telefono = new Telefono("Samsung", "4641AS-1", "2023", "Vertical");
        Computadora computadora = new Computadora("Lenovo", "23AS-2", "2024", "Windows");
        Televisor televisor = new Televisor("LG", "HJA-25", "2010", "34 pulgadas");
        
        
        System.out.println("------------------------------------------------");
        
        telefono.encender();
        telefono.encender(34);
        telefono.encender("Abc");
        telefono.mostrarInformacion();
        
        System.out.println("------------------------------------------------");
        
        computadora.encender();
        computadora.encender(135);
        computadora.encender("contrasenia");
        computadora.mostrarInformacion();
        
        System.out.println("------------------------------------------------");
        
        televisor.encender();
        televisor.encender(50);
        televisor.mostrarInformacion();
        
      
    }
    
}
