
package punto1.aplicacion.modelo.dominio;

import java.io.Serializable;


public class Escala implements Serializable{
    private String tipo="abd";
    private double temperatura;

    public Escala(String tipo, double temperatura) {
        this.tipo = tipo;
        this.temperatura = temperatura;
    }

    public Escala() {
        
    }
    public double conversorCelsiusaFarenheit(){
        return temperatura*1.8+32;
    }
    
    public double conversorCelsiusaKelvin(){
        return temperatura+273.15;
    }
    
    public double conversorFarenheitaCelsius(){
        return (temperatura-32)/1.8;
    }
    public double conversorFarenheitaKelvin(){
        return 5/9 *(temperatura-32) + 273.15;
    }
    public double conversorKelvinaCelsius(){
        return temperatura-273.15;
    }
    
    public double conversorKelvinaFarenheit(){
        return 1.8*(temperatura-273.15) + 32;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    
}