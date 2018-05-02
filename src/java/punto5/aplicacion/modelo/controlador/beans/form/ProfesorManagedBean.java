
package punto5.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto5.aplicacion.modelo.dominio.Profesor;

/**
 *
 * @author GRUPO 18
 */
@ManagedBean
@ViewScoped
public class ProfesorManagedBean implements Serializable{

    private Profesor profesor;
    private ArrayList<Profesor> lista=new ArrayList<>();
   
    public ProfesorManagedBean() {
        profesor=new Profesor();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        this.lista = lista;
    }
    
     public void agregarProfesor(){
        lista.add(profesor);
    }

    
}
