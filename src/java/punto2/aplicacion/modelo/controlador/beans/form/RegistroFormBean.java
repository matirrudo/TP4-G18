package punto2.aplicacion.modelo.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class RegistroFormBean implements Serializable {

    private int num;
    private int max;
    private int min=1000;
    private double promedio;
    private ArrayList<Integer> listaNumeros = new ArrayList<>();

    public RegistroFormBean() {
    }

    public RegistroFormBean(int num) {
        this.num = num;
    }

    public void agregarNumero() {
        listaNumeros.add(num);
    }



    public void setMax(int max) {
        this.max = max;
    }
    
    public int getMax() {
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)>max) {
                max=listaNumeros.get(i);
            }
        }
        return max;
    }
    
    public void setMin(int min) {
        this.min = min;
    }
    public int getMin() {
        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)<min) {
                min=listaNumeros.get(i);
                System.out.println("MINIMO: "+min);
            }
        }
        return min;
    }
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }
    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        double algo=0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            algo=listaNumeros.get(i)+algo;
            
        }
        promedio=algo/listaNumeros.size();
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
