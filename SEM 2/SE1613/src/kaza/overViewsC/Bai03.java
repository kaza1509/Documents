package kaza.overViewsC;

public class Bai03 {

    static int gt(int n) {
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }

    static int sumGt(int n) {
        int sum = 0;
        while (n>0) {
            int sd = n % 10;
            sum += gt(sd);
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(sumGt(i)==i) {
                System.out.print(i+"\t");
            }
        }
    }
}
