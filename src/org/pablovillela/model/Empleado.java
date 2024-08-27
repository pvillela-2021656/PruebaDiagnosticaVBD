package org.pablovillela.model;

abstract class Empleado {
    
    protected String nombre;
    protected int edad;
    protected double salario;
    
    public Empleado(){
        
    }

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método abstracto.
    public abstract void trabajar();
    
    // Implementación del método abstracto trabajar.
    public void trabajar(int horas){
        System.out.println(nombre + " esta trabajando " + horas + " ");
    }
}
