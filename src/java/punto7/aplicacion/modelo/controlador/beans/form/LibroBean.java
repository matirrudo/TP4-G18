package punto7.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.ViewScoped;
//import java.io.Serializable;
import punto7.aplicacion.modelo.dominio.Libro;

@ManagedBean
@RequestScoped
public class LibroBean implements Serializable{
    private Libro libro=new Libro();

    private static ArrayList<Libro> aLstLibros = new ArrayList();
    
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
    
}
