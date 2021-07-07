package kaza.overViewsC;

import java.util.Scanner;


public class Bai72 {
    static final double PI  = 3.14;
    static Scanner sc = new Scanner(System.in);
    
    static int UCLN(int a, int b) {
        while (a!=b) {            
            if(a>b) {
                a=a-b;
            }
            else {
                b=b-a;
            }
        }
        return a;
    }
    
    static int BCLN(int a, int b){
        return a*b/(UCLN(a, b));
    }
    
    static void menu() {
        System.out.println("==================================");
        System.out.println("1.Tính diện tích hình tròn");     
        System.out.println("2.Tính chu vi tam giác");
        System.out.println("3.Tìm BCNN(m,n)");
        System.out.println("0.Thoát chương trình");
    }
    
    public static void main(String[] args) {
        while (true) {      
            menu();
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1: {
                    System.out.print("Nhập bán kính r: ");
                    double r = Double.parseDouble(sc.nextLine());
                    double s = PI * r *r;
                    System.out.println("Diện tích hình tròn là: "+s);
                    break;
                }
                
                case 2: {
                    System.out.print("Nhập cạnh a: ");
                    int a = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nhập cạnh b: ");
                    int b = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nhập cạnh c: ");
                    int c = Integer.parseInt(sc.nextLine());
                    
                    System.out.println("Chu vi tam giác là: "+(a+b+c));
                    break;
                }
                
                case 3: {
                    System.out.print("Nhập số a: ");
                    int a = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nhập số b: ");
                    int b = Integer.parseInt(sc.nextLine());
                    
                    System.out.println("UCLN("+a+","+b+") = "+UCLN(a, b));
                    System.out.println("BCNN("+a+","+b+") = "+BCLN(a, b));
                    break;
                }
                
                case 0: {
                    System.err.println("Bạn đã thoát chương trinh");
                    System.exit(0);
                }
            }
        }
    }
}
