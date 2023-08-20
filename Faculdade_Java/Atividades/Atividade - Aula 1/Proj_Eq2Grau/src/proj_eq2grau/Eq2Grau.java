/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj_eq2grau;

/**
 *
 * @author Hideki Koyama
 */
public class Eq2Grau {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public void calcularDelta() {
        delta = b * b - 4 * a * c;
    }

    public void calcularX1() {
        if (delta < 0) {
            double newDelta = (delta * -1);
            x1 = (-b + Math.sqrt(newDelta)) / (2 * a);

        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public void calcularX2() {
        if (delta < 0) {
            double newDelta = (delta * -1);
            x2 = (-b - Math.sqrt(newDelta)) / (2 * a);

        } else {
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
    }

    public void calcularX1NoDelta() {
        if ((b * b - 4 * a * c) < 0) {
            System.out.println("estsive aqui");
            x1 = (-b + Math.sqrt((b * b - 4 * a * c) * -1)) / (2 * a);
        } else {
            System.out.println("else " + getA());
            x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }
    }

    public void calcularX2NoDelta() {
        if ((b * b - 4 * a * c) < 0) {
            x2 = (-b - Math.sqrt((b * b - 4 * a * c) * -1)) / (2 * a);

        } else {
            x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }
    }

}
