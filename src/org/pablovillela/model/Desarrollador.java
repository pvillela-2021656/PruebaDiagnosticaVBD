package org.pablovillela.model;

public class Desarrollador extends Empleado {

    private String lenguajeProgramacion;

    // Constructor
    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    // Implementación del método abstracto trabajar.
    @Override
    public void trabajar() {
        System.out.println(nombre + " esta desarrollando en " + lenguajeProgramacion);
    }
    
    // Sobrecarga del método trabajar.
    public void trabajar(String proyecto) {
        System.out.println(nombre + " esta trabajando en el proyecto " + proyecto + " usando el lenguaje " + lenguajeProgramacion);
    }
}
