/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoInterface;

/**
 *
 * @author acer
 */
public interface QuanCo {
    void move();
    
}

class Vua implements QuanCo{

    @Override
    public void move() {
        System.out.println("Vua di 1 o");
    }
    
}

class Hau implements QuanCo{

    @Override
    public void move() {
        System.out.println("Hau di thang - cheo truoc sai trai phai");
    }
    
}

class Voi implements QuanCo{

    @Override
    public void move() {
        System.out.println("Voi thì đi chéo");
    }
    
}

class Xe implements QuanCo{

    @Override
    public void move() {
        System.out.println("Xe đi thẳng ngang");
    }
    
}

class NhapThanh implements QuanCo{

    @Override
    public void move() {
        System.out.println("Vua va xe doi cho");
    }
    
}

class Using {
    public static void main(String[] args) {
        QuanCo trang;// đa hình trong object
        //interface là khuôn đúc ra class
        //overload/override là đa hình trong method
        //đa hình trong kiểu dữ liệu: generic
        trang = new QuanCo() { //anonymous class
            @Override
            public void move() {
                System.out.println("Vua và xe dong thoi di chuyen");
            }
        };
        //...
        trang = new NhapThanh();
        trang.move();
        //............
        trang = new Xe();
        trang.move();
        //............
        trang = new Voi();
        trang.move();
        //...
        trang = new Vua();
        trang.move();
        //...
        trang = new Xe();
        trang.move();
    }
}
