
package Punto6.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Grupo 18
 */
public class Auto implements Serializable{
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipodeCombustible;

    public Auto(){
        
    }
    
    public Auto(String patente, String marca, String modelo, String color, String tipodeCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipodeCombustible = tipodeCombustible;
    }

    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipodeCombustible() {
        return tipodeCombustible;
    }

    public void setTipodeCombustible(String tipodeCombustible) {
        this.tipodeCombustible = tipodeCombustible;
    }
    
    
    
}
