// ======= DO NOT EDIT MAIN FUNCTION ============
import java.io.*;
import java.util.*;
class Main {
   public static void main(String args[]) throws Exception{
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter number of Meeting: ");
       int n = Integer.parseInt(in.readLine());
       ArrayList<Meeting> a = new ArrayList();
       for(int i = 0; i < n; i++){
           System.out.println("");
           System.out.print("Who will you meeting: ");         
           String who = in.readLine();           
           System.out.print("Meeting date: ");           
           String day = in.readLine();           
           System.out.print("Meeting duration: ");           
           int duration = Integer.parseInt(in.readLine());          
           a.add(new Meeting(who, day, duration));
       }
       System.out.println("");
       System.out.print("Enter Searching day: ");
       String day = in.readLine();
       System.out.print("Enter test function (1-f1;2-f2): ");
       int c = Integer.parseInt(in.readLine());
       IMeeting i = new MyMeeting();
       System.out.println("OUTPUT:");    
       if(c == 1)
          System.out.println(i.f1(a));       
       else if(c == 2)
          System.out.println(i.f2(a,day));
   }
 }
