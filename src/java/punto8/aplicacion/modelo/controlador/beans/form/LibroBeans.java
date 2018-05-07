
package punto8.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import punto8.aplicacion.modelo.dominio.Libro;

@ManagedBean
@RequestScoped
public class LibroBeans implements Serializable{
    private Libro libro=new Libro();

    private static ArrayList<Libro> aLstLibros = new ArrayList();
    private ArrayList<Libro> busquedaLibros = new ArrayList();
    
    public LibroBeans() {
    }
    
    public static ArrayList<Libro> getaLstLibros() {
        return aLstLibros;
    }

    public static void setaLstLibros(ArrayList<Libro> aLstLibros) {
        LibroBeans.aLstLibros = aLstLibros;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    public void agregarLibro(){
        LibroBeans.aLstLibros.add(this.libro); 
    }  
    
    public void eliminarLibro(Libro libro){
        LibroBeans.aLstLibros.remove(libro);
        
    }

    public ArrayList<Libro> getBusquedaLibros() {
        return busquedaLibros;
    }

    public void setBusquedaLibros(ArrayList<Libro> busquedaLibros) {
        this.busquedaLibros = busquedaLibros;
    }

   
}
