
package punto1.aplicacion.modelo.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.modelo.dominio.Temperatura;


@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable{
    private Temperatura temperatura;
    private double grados;
    private String escala;
    private String escalaElejida;

    public String getEscalaElejida() {
        return escalaElejida;
    }

    public void setEscalaElejida(String escalaElejida) {
        this.escalaElejida = escalaElejida;
    }
    
    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(int grados) {
        this.grados = grados;
    }

    public String getEscala() {
        return escala;
    }

    public void setEscala(String escala) {
        this.escala = escala;
    }
    
    public TemperaturaFormBean() {
        temperatura=new Temperatura();
    }
    
    public double pasarAKelvin(){
        return temperatura.pasarAKelvin(escala, grados);
    }
    
    
}
