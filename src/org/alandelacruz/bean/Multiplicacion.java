package org.alandelacruz.bean;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * carnet:2020390
 * @date 12 abr. 2021
 * @time 23:13:12
 * Código técnico: IN5BV
 */
public class Multiplicacion {
    
    //atributos
    private double num5;
    private double num6;
    private double resultadoMulti;
    
    //costructores
    public Multiplicacion(){
        num5 = 0.0;
        num6 = 0.0;
        resultadoMulti = 0.0;
    }

    public Multiplicacion(double num5, double num6,double resultadoMulti){
        this.num5 = num5;
        this.num6 = num6;
        this.resultadoMulti = resultadoMulti;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public double getNum6() {
        return num6;
    }

    public void setNum6(double num6) {
        this.num6 = num6;
    }

    public double getResultadoMulti() {
        return resultadoMulti;
    }

    //metodo
    public double procedimietoMulti(){
        resultadoMulti= num5 * num6;
        return resultadoMulti;
    };
}