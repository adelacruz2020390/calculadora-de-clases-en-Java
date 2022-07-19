package org.alandelacruz.system;
import org.alandelacruz.bean.Suma;
import org.alandelacruz.bean.Resta;
import org.alandelacruz.bean.Multiplicacion;
import org.alandelacruz.bean.Division;
import org.alandelacruz.bean.Opciones;
import org.alandelacruz.bean.Salir;
import javax.swing.JOptionPane;

/**
 * 
 * @author Alan Eduardo De La Cruz Najera
 * carnet:2020390
 * @date 12 abr. 2021
 * @time 21:33:13
 * Código técnico: IN5BV
 */
public class Principal {
public static void main(String[] args) {

     
    Opciones opciones = new Opciones();
       
        int opciones1 = Integer.parseInt(JOptionPane.showInputDialog
        ("menu de opciones"
         + "\n1.suma"
         + "\n2.resta"
         + "\n3.multiplicacion"
         + "\n4.division"
         + "\n5.salir"
         + "\ningresa tu opcion"));
        
    opciones.setOpciones1(opciones1);
        
    switch(opciones1){
        case 1:
        
            Suma sumatoria = new Suma();
        
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el sugundo numero"));
        
            sumatoria.setNum1(num1);
            sumatoria.setNum2(num2);
            sumatoria.procedimietoSuma();
            
            JOptionPane.showMessageDialog
            (null, "la suma es:"+ sumatoria.getResultadosuma());
            
        break;
        
        case 2:
        
            Resta resta = new Resta();
        
            double num3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
            double num4 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el sugundo numero"));
        
            resta.setNum3(num3);
            resta.setNum4(num4);
            resta.procedimietoResta();
            
            JOptionPane.showMessageDialog
            (null, "el resultado de la resta es:"+ resta.getResultadoResta());
        
        break;
        
        case 3:
            Multiplicacion multiplicacion = new Multiplicacion();
            
            double num5 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
            double num6 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el sugundo numero"));
        
            multiplicacion.setNum5(num5);
            multiplicacion.setNum6(num6);
            multiplicacion.procedimietoMulti();
            
            JOptionPane.showMessageDialog
            (null, "el resultado de la multiplicacion es:"+ multiplicacion.getResultadoMulti());            
               
        break;
        
        case 4:
        Division division = new Division();
        
        double num7 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
        double num8 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));    
            
        division.setNum7(num7);
        division.setNum8(num8);
        division.procedimietoDivision();
        
        JOptionPane.showMessageDialog
        (null,"el resultado de la division es:" + division.getResultadoDivision());
        
        System.exit(0);
        break;
        
        case 5:
            Salir salir = new Salir();
            
            System.exit(salir.getSalir());
            
        break;
        
       
        }
        
        
       
    }

}
