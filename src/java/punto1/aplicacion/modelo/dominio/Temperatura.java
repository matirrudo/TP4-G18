
package punto1.aplicacion.modelo.dominio;

import java.io.Serializable;


public class Temperatura implements Serializable{
    double grados;
    String escala;

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
    public double pasarAKelvin(String escala, double grados){
        double gradosK = 0;
        if (escala.equals("celcius")){
            gradosK=grados+273.15;
            
        }
        return gradosK;
    
}
}