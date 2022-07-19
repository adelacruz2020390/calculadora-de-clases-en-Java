package org.alandelacruz.bean;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * carnet:2020390
 * @date 12 abr. 2021
 * @time 23:13:57
 * Código técnico: IN5BV
 */
public class Suma {
 //atributos 
    private double num1;
    private double num2;
    private double resultadosuma;
    
    //costructor 
    public Suma(){
    num1=0.0;
    num2 =0.0;
    resultadosuma = 0.0;           
    }
    
    public Suma (double num1,double num2,double resultadosuma){
        this.num1 = num1;
        this.num2 = num2;
        this.resultadosuma = resultadosuma;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultadosuma() {
        return resultadosuma;
    }
    
    //metodo
    public double procedimietoSuma(){
    resultadosuma = num1 + num2;
        return resultadosuma;
    }
}
