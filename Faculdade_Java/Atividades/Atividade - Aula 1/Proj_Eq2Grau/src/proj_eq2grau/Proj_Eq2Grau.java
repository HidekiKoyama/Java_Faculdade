/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj_eq2grau;

/**
 *
 * @author Hideki Koyama
 */
public class Proj_Eq2Grau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Calculo com Atributo 'delta' */
        Eq2Grau eq = new Eq2Grau();

        eq.setA(2);
        eq.setB(17);
        eq.setC(200);

        eq.calcularDelta();
        eq.calcularX1();
        eq.calcularX2();

        System.out.println("Utilizando o Atributo 'delta' ");
        System.out.println("x1= " + eq.getX1());
        System.out.println("x2= " + eq.getX2());

        /*Calculo sem o Atributo 'delta' */
        System.out.println("_______________________________________________________________");
        Eq2Grau eq1 = new Eq2Grau();
        
        eq1.setA(2);
        eq1.setB(17);
        eq1.setC(200);
        
        eq1.calcularX1NoDelta();
        eq1.calcularX2NoDelta();
                
        System.out.println("Sem utilizar o Atributo 'delta' ");
        System.out.println("x1= " + eq1.getX1());
        System.out.println("x2= " + eq1.getX2());
    }
}
