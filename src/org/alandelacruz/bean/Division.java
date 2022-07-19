package org.alandelacruz.bean;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * carnet:2020390
 * @date 12 abr. 2021
 * @time 23:36:50
 * Código técnico: IN5BV
 */
public class Division {

    //atributos
    private double num7;
    private double num8;
    private double resultadoDivision;
    
   //costructores
    public Division(){
    num7 = 0.0;
    num8 = 0.0;
    resultadoDivision = 0.0;
    }

    public Division(double num7, double num8, double resultadoDivision) {
        this.num7 = num7;
        this.num8 = num8;
        this.resultadoDivision = resultadoDivision;
    }

    public double getNum7() {
        return num7;
    }

    public void setNum7(double num7) {
        this.num7 = num7;
    }

    public double getNum8() {
        return num8;
    }

    public void setNum8(double num8) {
        this.num8 = num8;
    }

    public double getResultadoDivision() {
        return resultadoDivision;
    }
    
    public double procedimietoDivision(){
    resultadoDivision = num7/num8;
    return resultadoDivision;
    }
    
    
    
}
