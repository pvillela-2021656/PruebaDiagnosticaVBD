
package org.pruebaDiagnosticaVBD.model;

/**
 *
 * @author informatica
 */
public abstract class Dispositivo {
    
    // Atributos
    
    private String marca;
    private String modelo;
    private String anio;
    
    /*
        Constructor vacío
    */
    
    public Dispositivo() {
        
    }
    
    
    // Metodo sobrecargado
    
    public Dispositivo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    /*
        Método abstracto de encender
    */
    public abstract void encender();
    
    /*
        Método para el voltaje en ls demás clases
    */
    
    public void encender(int voltaje){
        System.out.println("El dispositivo al encender tiene un voltaje de " + voltaje + "V");
    }
    
    /*
        Método mostrar información
    */
    
    public void mostrarInformacion(){
        System.out.println("Información del dispositivo: { " + "\n" + 
                "Marca: " + marca + "\n" + 
                "Modelo: " + modelo + "\n" + 
                "Año: " + anio
               );
    }
    
}
