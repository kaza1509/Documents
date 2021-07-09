// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
class Main {
   public static void main(String args[]) throws Exception {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter food name: ");
       String name = in.readLine();
       System.out.print("Enter snack price: ");
       int price = Integer.parseInt(in.readLine());
       System.out.print("Enter snack maker: ");
       String maker = in.readLine();            
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       System.out.println("OUTPUT:");      
       if(tc == 1) {
            Food b = new Food(name);
            System.out.println(b);
            b = new Snack(name, price, maker);
            System.out.println(b);
       }
       else if(tc == 2) {
           Snack b = new Snack(name, price, maker);
           System.out.println(b.getSalePrice());
       }
   }
 }