package kaza.overViewsC;

import java.util.Scanner;


public class Bai55 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Nhập số km: ");
        int sokm = Integer.parseInt(sc.nextLine());
        if(sokm>=1&&sokm<=4) {
            sum+=5000*sokm;
        }
        if(sokm>=5&&sokm<=19) {
            sum+=3000*(sokm-4)+5000*4;
        }
        if(sokm>=20) {
            sum+=2000*(sokm-19)+3000*(sokm-4)+5000*4;
        }
        System.out.println("Tổng tiền khách phải trả là: "+sum);
    }
}
