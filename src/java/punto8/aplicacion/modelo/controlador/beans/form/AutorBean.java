
package punto8.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import punto7.aplicacion.modelo.dominio.Autor;


@ManagedBean
@ViewScoped
public class AutorBean implements Serializable{
        ArrayList<Autor> lstAutor=new ArrayList();

    public ArrayList<Autor> getLstAutor() {
        return lstAutor;
    }

    public void setLstAutor(ArrayList<Autor> lstAutor) {
        this.lstAutor = lstAutor;
    }
        
    public AutorBean() {
        lstAutor.add(new Autor("Dan Brown",1));
        lstAutor.add(new Autor("Paulo Coelho",2));
        lstAutor.add(new Autor("J.R.R. Tolkien",3));
        lstAutor.add(new Autor("Anna Frank",4));
        lstAutor.add(new Autor("Jorge Luis Borges",5));
        lstAutor.add(new Autor("Julio Cortázar",6));
        lstAutor.add(new Autor("Pablo Neruda",7));
        lstAutor.add(new Autor("Adolfo Bioy Casares",8));
        lstAutor.add(new Autor("Mario Vargas Llosa",9));
        lstAutor.add(new Autor("Eduardo Galeano",10));
        
    }
    
}
