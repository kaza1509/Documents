package DemoInterface;
public interface IntA {
    //phải có 1 trong 3 từ khóa dưới
    public static final int x = 10;
    public int y = 10;
    abstract public void m1();//không có body # rỗng
//    abstract public void m1(){};
//    Chỉ chấp nhận public
    void m2();
    static void m3(){}
    default void m4(){}
}

interface B {
    void m5();
}

interface C extends B, IntA {//có thể extend từ nhiều i
    
}

class D {
    
}

class F{}

class E extends D implements C,B,IntA{//extend từ 1 class - extend trước rồi mới đến interface

    @Override
    public void m5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
