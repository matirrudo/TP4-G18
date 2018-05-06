package punto4.aplicacion.modelo.cotrolador.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class AhorcadoFormBean implements Serializable{
    private String palIngresada="";
    private char[] palSalida= new char[palIngresada.length()];
    private char letra;
    private int contador=0;
    
    public AhorcadoFormBean() {
    }
    public void buscarCoincidencia(){
        for (int i = 0; i < palIngresada.length(); i++) {
            if (letra==palIngresada.charAt(i)) {
                palSalida[i]=letra;
            }else{
                palSalida[i]='-';
                setContador(getContador() + 1);
            }
                    
        }
    }

    /**
     * @return the palIngresada
     */
    public String getPalIngresada() {
        return palIngresada;
    }

    /**
     * @param palIngresada the palIngresada to set
     */
    public void setPalIngresada(String palIngresada) {
        this.palIngresada = palIngresada;
    }

    /**
     * @return the letra
     */
    public char getLetra() {
        return letra;
    }

    /**
     * @param letra the letra to set
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }

    /**
     * @return the palSalida
     */
    public char[] getPalSalida() {
        return palSalida;
    }

    /**
     * @param palSalida the palSalida to set
     */
    public void setPalSalida(char[] palSalida) {
        this.palSalida = palSalida;
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
