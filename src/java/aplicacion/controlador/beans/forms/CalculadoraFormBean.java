
package aplicacion.controlador.beans.forms;

import aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private Calculadora calculadora;
    private double numeroA;
    private double numeroB;

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }
    public CalculadoraFormBean() {
        calculadora =new Calculadora();
    }
    
    public double sumar(){
    return calculadora.sumar(numeroA, numeroB);
    }
    
    public double restar(){
    return calculadora.restar(numeroA, numeroB);
    }
    
    public double multiplicar(){
    return calculadora.multiplicar(numeroA, numeroB);
    }
    
    public double dividir(){
    return calculadora.dividir(numeroA, numeroB);
    }
}
