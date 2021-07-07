package kaza.overViewsC;

import java.util.Scanner;


public class Bai07 {
    static final double PI = 3.14;
    static Scanner sc = new Scanner(System.in);
    
    static double caculate_triangle(int a, int b, int c) {
        if(a+b<=c||b+c<=a||c+a<=b||a<=0||b<=0||c<=0) {
            return -1;
        }
        else {
            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return s;
        }
    }
    
    static void Menu() {
        System.out.println("1.Diện tích hình thang");
        System.out.println("2.Diện tích hình tròn");
        System.out.println("3.Diện tích hình tam giác");
        System.out.println("4.Thể tích khối hộp");
        System.out.println("0.Thoát chương trình.");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
    
    static void caculate() {
        int choice;
        while (true) {   
            System.out.println("----------------------");
            Menu();
            choice = Integer.parseInt(sc.nextLine());
            switch(choice) {
                case 1: {
                    System.out.print("Nhập đáy trên: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập đáy dưới: ");
                    int b = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập chiều cao: ");
                    int h = Integer.parseInt(sc.nextLine());
                    double s = ((a+b)*h)/2;
                    System.out.println("Diện tích hình thang là: "+s);
                    break;
                }
                
                case 2: {
                    System.out.print("Nhập bán kính: ");
                    int r = Integer.parseInt(sc.nextLine());
                    double s = PI*r*r;
                    System.out.println("Diện tích hình tròn là: "+s);
                    break;
                }
                
                case 3: {
                    int a,b,c;
                    System.out.print("Nhập cạnh a: ");
                    a = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nhập cạnh b: ");
                    b = Integer.parseInt(sc.nextLine());
                    
                    System.out.print("Nhập cạnh c: ");
                    c = Integer.parseInt(sc.nextLine());
                    
                    if(caculate_triangle(a, b, c) == -1) {
                        System.err.println("Đầu vào bị lỗi");
                    }
                    else {
                        System.out.println("Diện tích tam giác là: "+caculate_triangle(a, b, c));
                    }
                    break;
                }
                
                case 4: {
                    System.out.print("Nhập cạnh của khối hộp: ");
                    int a = Integer.parseInt(sc.nextLine());
                    
                    System.out.println("Thể tích khối lập phương là: "+(a*a*a));
                    break;
                }
                
                case 0: {
                    System.err.println("Bạn đã thoát chương trình!");
                    System.exit(0);
                    break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        caculate();
    }
}
