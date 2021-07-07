package kaza.PTB1;


public class Main {
    
    public static void main(String[] args) {
        PTB1 p1 = new PTB1();
        p1.input();
        p1.solve();
        if(p1.getStatus().equals("CN")) {
            System.out.print(p1.getStatus()+" x = ");
            System.out.println(p1.getX());
        }
        else if(p1.getStatus().equals("VN")) {
            System.out.println(p1.getStatus());
        }
        else {
             System.out.println(p1.getStatus());
        }
        System.out.println(p1);
    }
}
