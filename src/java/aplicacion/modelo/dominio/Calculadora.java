
package aplicacion.modelo.dominio;

import java.io.Serializable;

public class Calculadora implements Serializable{
    public double sumar(double numeroA, double numeroB){
        return numeroA+numeroB;
    }
    public double restar(double numeroA, double numeroB){
        return numeroA-numeroB;
    }
        public double multiplicar(double numeroA, double numeroB){
        return numeroA*numeroB;
        }
        /*    public double dividir(double numeroA, double numeroB){
        return numeroA / numeroB;}*/
            public double dividir(double numeroA, double numeroB){
            return numeroA/numeroB;
            }
}    

