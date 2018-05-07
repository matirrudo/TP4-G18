
package Punto6.aplicacion.modelo.controlador;

import Punto6.aplicacion.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Grupo 18
 */
@ManagedBean
@ViewScoped
public class AutoManagedBean implements Serializable{
   
    private ArrayList<Auto> lista=new ArrayList<>();
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipodeCombustible;
   
    
    public AutoManagedBean() {
        lista.add(new Auto("ACD 234", "Ford", "Focus", "Negro", "Diesel"));
        lista.add(new Auto("ATR 342", "Fiat", "Toro", "Blanco", "Diesel"));
        lista.add(new Auto("BTD 477", "Ford", "Rangers", "Negro", "Diesel"));
    }

    public ArrayList<Auto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Auto> lista) {
        this.lista = lista;
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
    
    public void modificarAuto(RowEditEvent event){
        Auto a=(Auto) event.getObject();
        a.setPatente(patente);
        a.setModelo(modelo);
        a.setMarca(marca);
        a.setColor(color);
        a.setTipodeCombustible(tipodeCombustible);
    }
    
    
}
