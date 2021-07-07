package kaza.overViewsC;


public class Bai73 {
    
    static boolean check_amstrong(int n) {
        int sum = 0;
        int temp = n;
        while (n>0) {            
            int sd = n%10;
            sum+=Math.pow(sd, 3);
            n/=10;
        }
        if(temp == sum) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 5000; i++) {
            if(check_amstrong(i)) {
                System.out.println(i+"\t");
            }
        }
    }
}
