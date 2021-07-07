package kaza.PTB1;

import java.util.Scanner;


public class PTB1 {
    private int a;
    private int b;
    private String status;
    private double x;

    public PTB1() {
    }

    public PTB1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập b: ");
        b = Integer.parseInt(sc.nextLine());
    }
    
    public void solve() {
        if(a == 0) {
            if(b == 0) {
                status = "VSN";
            }
            else {
                status = "VN";
            }
        }
        else {
            status = "CN";
            x = -(double)b/(a);
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    @Override
    public String toString() {
        return "PTB1{" + "a=" + a + ", b=" + b + ", status=" + status + ", x=" + x + '}';
    }
    
}


