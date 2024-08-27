package org.pruebaDiagnosticaVBD.model;

public abstract class Forma {
    
    /*
    atributo de la clase forma
    */

    private String color;
    
    // atributo de la clase forma y que se heredera a la otras subclases
    
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
    
    //metodo para mostrar la informacion
    
    public void mostrarInformacion(){
        System.out.println("El color es" + color);
        System.out.println("El area es de" + calcularArea());
             
        
    }
    

}



