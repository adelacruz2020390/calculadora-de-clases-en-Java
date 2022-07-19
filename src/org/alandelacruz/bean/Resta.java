package org.alandelacruz.bean;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * carnet:2020390
 * @date 12 abr. 2021
 * @time 23:37:17
 * Código técnico: IN5BV
 */
public class Resta {

   //atributos 
    private double num3;
    private double num4;
    private double resultadoresta;
    
    //costructor 
    public Resta(){
    num3=0.0;
    num4 =0.0;
    resultadoresta = 0.0;           
    }
    
    public Resta (double num3,double num4,double resultadoresta){
        this.num3 = num3;
        this.num4 = num4;
        this.resultadoresta = resultadoresta;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getResultadoResta() {
        return resultadoresta;
    }
    
    //metodo
    public double procedimietoResta(){
    resultadoresta = num3 - num4;
        return resultadoresta;
    }

}
