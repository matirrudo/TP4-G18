package punto8.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import punto8.aplicacion.modelo.dominio.Libro;

@ManagedBean
@RequestScoped
public class LibroBean implements Serializable{
    private Libro libro=new Libro();

    private static ArrayList<Libro> aLstLibros = new ArrayList();
    private static ArrayList<Libro> busquedaLibros = new ArrayList();
    
    public LibroBean() {
    }
    
    public static ArrayList<Libro> getaLstLibros() {
        return aLstLibros;
    }

    public static void setaLstLibros(ArrayList<Libro> aLstLibros) {
        LibroBean.aLstLibros = aLstLibros;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }


    public void agregarLibro(){
        LibroBean.aLstLibros.add(this.libro); 
    }  
    
    public void eliminarLibro(Libro libro){
        LibroBean.aLstLibros.remove(libro);
        
    }

    public static ArrayList<Libro> getBusquedaLibros() {
        return busquedaLibros;
    }

    public static void setBusquedaLibros(ArrayList<Libro> busquedaLibros) {
        LibroBean.busquedaLibros = busquedaLibros;
    }
    
}
