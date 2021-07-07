class A implements Cloneable
 {int x;
  A() {}
  A(int x1) {x=x1;}
  void set(int x1) {x=x1;}
  public String toString() {return("" + x);}
  public Object clone() throws CloneNotSupportedException
   {return super.clone();
   }
 }
public class Main
 {public static void main(String [] args) throws CloneNotSupportedException
   {A t = new A(5);
    A h=null;
    try {h = (A) t.clone();} catch(CloneNotSupportedException e) {}
    System.out.println(t==h); // false
    System.out.println(h); //(1)
    t.set(100);//(2)
    System.out.println(h); // The same as (1), not affected by (2)
    t.set(5);//(3)
    A g = t; // shallow copy
    System.out.println(g==t);//true
    System.out.println(g);//(4)
    t.set(100);//(5)
    System.out.println(g);// Not the same as (4), affected by (5)
   }
 }
