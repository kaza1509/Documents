/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaza.PTB2;

import java.util.Scanner;

/**
 *
 * @author acer
 */
//ax^2+bx+c=0
public class PTB2 {
    private int a,b,c;
    private double x1,x2;
    private String status;

    public PTB2() {
    }

    public PTB2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số c: ");
        c = Integer.parseInt(sc.nextLine());
    }
    
    public void solve() {
        if(a == 0) {
            if(b == 0) {
                if(c==0) {
                    status = "VSN";
                }
                else {
                    status = "VN";
                }
            }
            else {
                status = "1N";
                x1 = (double)-c/b;
                x2 = x1;
            }
        }
        else {
            double delta = (double)b*b - 4*a*c;
            if(delta<0) {
                status = "VN";
            }
            else if(delta==0) {
                status = "1N Kép";
                x1 = (double)-b/(2*a);
                x2=x1;
            }
            else {
                status = "2N";
                x1 = (double)-b-Math.sqrt(delta)/(2*a);
                x2 = (double)-b+Math.sqrt(delta)/(2*a);
            }
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PTB2{" + "a=" + a + ", b=" + b + ", c=" + c + ", x1=" + x1 + ", x2=" + x2 + ", status=" + status + '}';
    }
    
}
