
package punto7.aplicacion.modelo.dominio;

public class Autor {
    private String nombre;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Autor(){
        
    }

    public Autor(String nombre, int id) {
        this.nombre = nombre;
        this.id=id;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
