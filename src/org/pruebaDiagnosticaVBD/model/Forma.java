package org.pruebaDiagnosticaVBD.model;

public abstract class Forma {

    private String color;

    public Forma() {

    }

    public Forma(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract double calcularArea();
    
    
    public void mostrarInformacion(){
        System.out.println("El color es" + color);
        System.out.println("El area es de" + calcularArea());
             
        
    }
    

}



