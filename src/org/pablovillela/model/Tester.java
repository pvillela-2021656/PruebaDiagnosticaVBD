package org.pablovillela.model;

public class Tester extends Empleado {

    private String tipoPruebas;

    public Tester(String tipoPruebas, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " esta usando la prueba " + tipoPruebas);
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println(nombre + " esta trabajando en el proyecto " + proyecto + " con la herramienta " + herramienta);
    }
}
    
