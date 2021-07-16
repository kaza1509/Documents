/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.*;

/**
 *
 * @author Khoi Nguyen
 */
public class MyTV {

    //========================== f1 ==========================
    //1. đếm và trả về số TV có size lớn giá trị x đã cho
    public int f11(ArrayList<TV> a, int x, String s) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getSize() > x) {
                count++;
            }
        }
        return count;
    }

    //2. đếm và trả về số TV có name chứa chuỗi s đã cho (không phân biệt chữ hoa thường)
    public int f12(ArrayList<TV> a, int x, String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            String h = a.get(i).getName().toLowerCase();
            if (h.contains(s)) {
                count++;
            }
        }
        return count;
    }

    //3. Tính và trả về phần nguyên tổng giá của các TV có size >x
    public int f13(ArrayList<TV> a, int x, String s) {
        double sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getPrice() > x) {
                sum += a.get(i).getPrice();
            }
        }
        return (int) sum;
    }

    //4. Tính và trả về tổng các size của TV có name chữa chuỗi s (không phân biệt chữ hoa thường)
    public int f14(ArrayList<TV> a, int x, String s) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getName().toLowerCase().contains(s.toLowerCase())) {
                sum += a.get(i).getSize();
            }
        }
        return sum;
    }

    //5. Tính và trả về phần nguyên của giá trung bình các TV có trong list
    public int f15(ArrayList<TV> a, int x, String s) {
        double avg = 0;
        for (int i = 0; i < a.size(); i++) {
            avg += a.get(i).getPrice();
        }
        avg /= a.size();
        return (int) avg;
    }

    //6. Tính và trả về size của TV có giá gần với giá trị trung bình của list
    public int f16(ArrayList<TV> a, int x, String s) {
        double avg = 0;
        for (int i = 0; i < a.size(); i++) {
            avg += a.get(i).getSize();
        }
        avg /= a.size();

        //tìm chênh lệch trị tuyệt đối của giá nhỏ nhất
        ArrayList<Double> c = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            c.add(Math.abs(avg - a.get(i).getSize()));
        }
        int indexMin = c.indexOf(Collections.min(c));
        return a.get(indexMin).getSize();
    }

    //7. Đếm và trả về số TV có size nhỏ hơn x và tên không chứa chuỗi s
    public int f17(ArrayList<TV> a, int x, String s) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getSize() < x && !a.get(i).getName().toLowerCase().contains(s.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    //8. Tính và trả về phần nguyên của giá trị size trung bình trong list a
    public int f18(ArrayList<TV> a, int x, String s) {
        double avg = 0;
        for (int i = 0; i < a.size(); i++) {
            avg += a.get(i).getSize();
        }
        avg /= a.size();
        return (int) avg;
    }

    //9. Tìm và trả về size phổ biến nhất trong list a
    public int f19(ArrayList<TV> a, int x, String s) {
        ArrayList c = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if (a.get(i).getSize() == a.get(j).getSize()) {
                    count++;
                }
            }
            c.add(count);
        }
        int index = c.indexOf((Integer) Collections.max(c));
        return a.get(index).getSize();
    }

    //10. Tìm và trả về size TV có giá nhỏ hơn và gần nhất với giá trị x đã cho
    public int f110(ArrayList<TV> a, int x, String s) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getSize() < x) {
                return a.get(i).getSize();
            }
        }
        return 0;
    }

    //========================== f2 ==========================
    //-------------- Support f2 ----------------
    public void print(ArrayList<TV> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");
    }
    //1. sort tất cả TV theo tăng dần của giá
    public void f21(ArrayList<TV> a, int x, String s) {
        System.out.println("Sort giá tăng dần:");
        Collections.sort(a, new Comparator<TV>(){
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getPrice() > o2.getPrice())
                    return 1;
                else {
                    return -1;
                }
            }
            
        });
        print(a);
    }

    //2. sort tất cả TV theo tăng dần của size-> name(tăng)-> price (giảm)
    public void f22(ArrayList<TV> a, int x, String s) {
        System.out.println("Sort theo tăng dần của size-> name(tăng)-> price (giảm):");
        Collections.sort(a, new Comparator<TV>(){
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getSize() > o2.getSize())
                    return 1;
                else if(o1.getSize() < o2.getSize())
                    return -1;
                else {
                    if(o1.getName().compareTo(o2.getName()) > 1)
                        return 1;
                    else if(o1.getName().compareTo(o2.getName()) < 1) {
                        return -1;
                    }
                    else {
                        if(o1.getPrice() > o2.getPrice())
                            return -1;
                        else {
                            return 1;
                        }
                    }
                }
            }
            
        });
        print(a);
    }

    //3. sort size tất cả TV trong list a thỏa mãn điều kiện size >=x
    public void f23(ArrayList<TV> a, int x, String s) {
        System.out.println("Sort size tất cả TV trong list a thỏa mãn điều kiện size >=x");
        ArrayList<TV> b = new ArrayList<TV>();
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x)
                b.add(a.get(i));
        }

        Collections.sort(b, new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getSize() > o2.getSize())
                    return 1;
                else 
                    return -1;
            }
        });
        
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x){
                a.set(i, b.get(j));
                j++;
            }
        }
        
        print(a);
    }

    //4. Xóa bỏ TV đầu tiên của list mà có size >=x đã cho
    public void f24(ArrayList<TV> a, int x, String s) {
        System.out.println("Xóa bỏ TV đầu tiên của list mà có size >=x đã cho");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() > x) {
                a.remove(i);
                break;
            }
        }
        print(a);
    }

    //5. Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)
    public void f25(ArrayList<TV> a, int x, String s) {
        System.out.println("Xóa bỏ tất cả TV mà có name chứa s đã cho (Không phân biệt chữ hoa thường)");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().toLowerCase().contains(s.toLowerCase())) {
                a.remove(i);
                i--;
            }
        }
        print(a);
    }

    //6. Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên
    public void f26(ArrayList<TV> a, int x, String s) {
        System.out.println("Đảo ngược tất cả các TV trong list có size <=x các TV khác giữ nguyên");
        ArrayList<TV> b = new ArrayList<TV>();
        for (int i = a.size() - 1; i >= 0; i--) {
            if(a.get(i).getSize() <= x) {
                b.add(a.get(i));
            }
        }
        
        int j =0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getSize() <= x) {
                a.set(i, b.get(j));
                j++;
            }
        }
        print(a);
    }

    //7. Xóa bỏ TV đầu tiên có giá lớn thứ 2 trong list
    public void f27(ArrayList<TV> a, int x, String s) {
        ArrayList<TV> ar = a;
        
        Collections.sort(ar, new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getPrice() > o2.getPrice())
                    return -1;
                else 
                    return 1;
            }
        });
        
        double price = ar.get(1).getPrice();
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() == price) {
                a.remove(i);
                i--;
            }
        }
        
        print(a);
    }

    //8. Xóa bỏ tất cả TV có giá lớn thứ 2 trong list
    public void f28(ArrayList<TV> a, int x, String s) {
        ArrayList<TV> ar = a;
        
        Collections.sort(ar, new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getPrice() > o2.getPrice())
                    return -1;
                else 
                    return 1;
            }
        });
        
        double price = ar.get(1).getPrice();
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() == price) {
                a.remove(i);
                i--;
            }
        }
        print(a);
    }

    //9. Đổi vị trí TV có price lớn nhất với TV có price bé nhất
    public void f29(ArrayList<TV> a, int x, String s) {
        ArrayList<TV> ar = a;
        Collections.sort(ar, new Comparator<TV>() {
            @Override
            public int compare(TV o1, TV o2) {
                if(o1.getPrice() > o2.getPrice())
                    return -1;
                else 
                    return 1;
            }
        });
        
        double minPrice = ar.get(ar.size()-1).getPrice();
        double maxPrice = ar.get(0).getPrice();
        ar.clear();
        
        int indexMin = 0, indexMax = 0;
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() == minPrice) {
                indexMin = i;
                break;
            }
        }
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() == maxPrice) {
                indexMax = i;
                break;
            }
        }
        
        System.out.println(indexMin);
        System.out.println(indexMax);
        
        
        print(a);
    }

    //10. Đổi vị trí TV có size lớn nhất và TV có size bé nhất
    public void f210(ArrayList<TV> a, int x, String s) {

        print(a);
    }

    //11. Đổi vị trí TV có size lớn nhất cho TV có price lớn nhất nhất
    public void f211(ArrayList<TV> a, int x, String s) {

        print(a);
    }

    //12. đổi chỗ vị trí TV có price lớn thứ 2 đầu tiên với TV có size bé nhất
    public void f212(ArrayList<TV> a, int x, String s) {

        print(a);
    }

}
