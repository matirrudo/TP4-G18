
package punto1.aplicacion.modelo.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto1.aplicacion.modelo.dominio.Escala;

/**
 *
 * @author GRUPO 18
 */
@ManagedBean
@ViewScoped
public class EscalaFormBean implements Serializable{

  
    private Escala escala;
    private String tipo="abc";

    public EscalaFormBean(){
        escala=new Escala();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double conversorTemperatura(){
        double resultado=0;
        if(escala.getTipo().equals("Celsius")==true){
            if(tipo.equals("Grados Fahrenheit")==true){
                resultado=escala.conversorCelsiusaFarenheit();
            }else{if(tipo.equals("Kelvin")==true){
                resultado=escala.conversorCelsiusaKelvin();
            }else{
                resultado=escala.getTemperatura();
            }
                
            }
                
        }else{if(escala.getTipo().equals("Grados Fahrenheit")==true){
            if(tipo.equals("Celsius")==true){
                resultado=escala.conversorFarenheitaCelsius();
            }else{if(tipo.equals("Kelvin")==true){
                resultado=escala.conversorFarenheitaKelvin();
            }else{
                resultado=escala.getTemperatura();
            }
                
            }
        }else{
            if(escala.getTipo().equals("Kelvin")==true){
                if(tipo.equals("Celsius")==true){
                    resultado=escala.conversorKelvinaCelsius();
                }else{if(tipo.equals("Grados Fahrenheit")==true){
                    resultado=escala.conversorKelvinaFarenheit();
                }else{
                    resultado=escala.getTemperatura();
                }
                    
                }
            }
        }
            
        }
        return resultado;
    }
    

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }
    
    
    
}
