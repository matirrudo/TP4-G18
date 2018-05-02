package punto7.aplicacion.modelo.controlador.beans.form;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.ViewScoped;
//import java.io.Serializable;
import punto7.aplicacion.modelo.dominio.Libro;

@ManagedBean
@RequestScoped
public class LibroBean {
    private Libro libro=new Libro();
    private static List<Libro> lstLibros = new ArrayList();
    
    public LibroBean() {
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public static List<Libro> getLstLibros() {
        return lstLibros;
    }

    public static void setLstLibros(List<Libro> lstLibros) {
        LibroBean.lstLibros = lstLibros;
    }
    
    public void agregarLibro(){
        LibroBean.lstLibros.add(this.libro); 
    }  
    
    public void eliminarLibro(Libro libro){
        LibroBean.lstLibros.remove(libro);
        
    }
    
}
