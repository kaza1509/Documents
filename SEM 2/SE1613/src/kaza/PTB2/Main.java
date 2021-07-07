package kaza.PTB2;


public class Main {
    
    public static void main(String[] args) {
        PTB2 p2 = new PTB2();
        p2.input();
        p2.solve();
//        VSN/VN/1N/1N Kép/2N
        if(p2.getStatus().equalsIgnoreCase("VSN")) {
            System.out.println(p2.getStatus());
        }
        else if(p2.getStatus().equalsIgnoreCase("VN")) {
            System.out.println(p2.getStatus());
        }
        else if(p2.getStatus().equalsIgnoreCase("1N")) {
            System.out.println(p2.getStatus()+" : "+p2.getX1());
        }
        else if(p2.getStatus().equalsIgnoreCase("1N Kép")) {
            System.out.println(p2.getStatus()+" : "+p2.getX1());
        }
        else {
            System.out.println(p2.getStatus()+" : ");
            System.out.println("x1 = "+p2.getX1()+" and x2 = "+p2.getX2());
        }
        System.out.println(p2);
    }
}
