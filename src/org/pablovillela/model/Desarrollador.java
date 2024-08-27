package org.pablovillela.model;

public class Desarrollador extends Empleado {

    private String lenguajeProgramacion;

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

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta desarrollando en " + lenguajeProgramacion);
    }

    public void trabajar(String proyecto) {
        System.out.println(nombre + " esta trabajando en el proyecto " + proyecto + " usando el lenguaje " + lenguajeProgramacion);
    }
}
