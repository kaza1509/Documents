package kaza.overViewsC;

import java.util.Scanner;

public class Bai51 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = new int[100];
        int b[] = new int[100];
        int c[] = new int[200];

        System.out.println("Nhập mảng a: ");
        int i = 0, n = 0;
        while (true) {
            System.out.print("a[" + (i) + "] = ");
            a[n++] = Integer.parseInt(sc.nextLine());
            if (a[i] < 0) {
                break;
            }
            i++;
        }

        System.out.println("Nhập mảng b: ");
        int j = 0, m = 0;
        while (true) {
            System.out.print("b[" + (j) + "] = ");
            b[m++] = Integer.parseInt(sc.nextLine());
            if (b[j] < 0) {
                break;
            }
            j++;
        }
//        System.out.println("sl = "+(m+n));
        int l = 0;
        for (int k = 0; k < n; k++) {
            c[l++] = a[k];
        }

        for (int k = 0; k < m; k++) {
            c[l++] = b[k];
        }
        
        System.out.println("Mảng a và b trước khi trộn sắp xếp tăng dần: ");
        for (int k = 0; k < l; k++) {
            System.out.print(c[k]+"\t");
        }

        for (int x = 0; x < l - 1; x++) {
            for (int y = x + 1; y < l; y++) {
                if(c[x] > c[y]) {
                    int temp = c[x];
                    c[x] = c[y];
                    c[y] = temp;
                }
            }
        }
        
        System.out.println("\nMảng a và b sau khi trộn sắp xếp tăng dần");
        for (int k = 0; k < l; k++) {
            System.out.print(c[k]+"\t");
        }
        
    }
}
