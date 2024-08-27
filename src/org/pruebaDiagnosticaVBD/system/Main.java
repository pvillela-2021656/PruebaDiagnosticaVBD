package org.pruebaDiagnosticaVBD.system;

import java.util.Scanner;
import org.pruebaDiagnosticaVBD.model.*;

/**
 *
 * @author informatica
 */
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        /*
         - Ejercicio 1
        
        */
        
        Tester tester = new Tester("Pablo", 20, 1500.0, "SpringBoot");
        Desarrollador desarrollador = new Desarrollador("Esteban", 21, 3000.0,"Java");
        
        
        /*
         - Ejercicio 2
        */
        
        Circulo circulo = new Circulo("Azul", 4.0);
        Cuadrado cuadrado = new Cuadrado("Rojo",5.0 ,7.0);
        Rectangulo rectangulo = new Rectangulo("Rosa", 8.0 ,9.0 );
        Triangulo triangulo = new Triangulo("Gris",10.0 ,11.0 );
        
        
        
        /*
         - Ejercicio 3
        */
        
        Telefono telefono = new Telefono("Samsung", "4641AS-1", "2023", "Vertical");
        Computadora computadora = new Computadora("Lenovo", "23AS-2", "2024", "Windows");
        Televisor televisor = new Televisor("LG", "HJA-25", "2010", "34 pulgadas");

        int flag = 1;

        while (flag == 1) {
            System.out.println("[ ---------- Prueba Diagnostica ----------]");
            System.out.println("[ - - - Menú principal - - - ]");
            System.out.println("¿Qué ejercicio desea visualizar");
            System.out.println("1. (Pablo Villela) Ejercicio 1: Empleados" + "\n"
                    + "2. (Diego García) Ejercicio 2: Formas" + "\n"
                    + "3. (Diego Bercian) Ejercicio 3: Dispositivos" + "\n" + 
                    "4. Salir");
            int eleccion = leer.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("-----------------Tester----------------------");
                    
                    tester.trabajar();
                    tester.trabajar(3);
                    tester.trabajar("Visual Studio", "Empresarial");
                    
                    System.out.println("------------------Desarrolador---------------------");
                    
                    desarrollador.trabajar();
                    desarrollador.trabajar("Tienda");
                    continuar();
                    break;
                case 2:
                    
                    System.out.println("---------------Circulo------------------------");
                    
                    circulo.calcularArea();
                    circulo.mostrarInformacion();
                    
                    System.out.println("-----------------Cuadrado----------------------");
                    
                    cuadrado.calcularArea();
                    cuadrado.mostrarInformacion();
                    
                    System.out.println("-----------------Rectangulo----------------------");
                    
                    rectangulo.calcularArea();
                    rectangulo.mostrarInformacion();
                    
                    System.out.println("-----------------Triangulo----------------------");
                    
                    triangulo.calcularArea();
                    triangulo.mostrarInformacion();

                    continuar();

                    break;
                case 3:
                    System.out.println("--------------------Telefono----------------------------");

                    telefono.encender();
                    telefono.encender(34);
                    telefono.encender("Abc");
                    telefono.mostrarInformacion();

                    System.out.println("-------------------Computadora-----------------------------");

                    computadora.encender();
                    computadora.encender(135);
                    computadora.encender("contrasenia");
                    computadora.mostrarInformacion();

                    System.out.println("----------------Televisor--------------------------------");

                    televisor.encender();
                    televisor.encender(50);
                    televisor.mostrarInformacion();

                    continuar();

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;

            }

        }

    }

    public static void continuar() {

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Desea seguir en el programa?");
        System.out.println("1. Si" + "\n" + "2. No");
        int salir = leer.nextInt();
        if (salir == 1) {
            System.out.println("Programa en funcionamiento");
        } else if (salir == 2) {
            System.out.println("Saliento del programa...");
            System.exit(0);
        } else {
            System.out.println("Ninguna de las anteriores");
            continuar();
        }
    }

}
