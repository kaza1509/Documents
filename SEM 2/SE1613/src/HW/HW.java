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
public class HW {

    //-------------------------- SUPPORT METHOD Q1 - Q2 --------------------------
    //check số nguyên tô
    public boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    //In ra collections a
    public void print(ArrayList<Integer> a) {
        System.out.println(a);
    }

    //lấy giá trị trung bình
    public double takeAverage(ArrayList<Integer> a) {
        double avg = 0;
        for (int i = 0; i < a.size(); i++) {
            avg += a.get(i);
        }
        avg = avg / a.size();
        return avg;
    }

    //lấy số nguyên tố lớn hơn hoặc bằng a
    public int takePrimeGreater(int a) {
        int i = a;
        while (true) {
            if (checkPrime(i)) {
                return i;
            }
            i++;
        }
    }

    //lấy ước số nguyên tố lớn nhất
    public int takeMaxPrimeGCD(int n) {
        for (int i = n - 1; i > 1; i--) {
            if (checkPrime(i) && n % i == 0) {
                return i;
            }
        }
        return 0;
    }

    //lấy tổng các ước số của nó
    public int takeSumGCD(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //lấy phần tử ngược 123 -> 321
    public int takeReverse(int n) {
        String k = String.valueOf(n);
        StringBuilder sb = new StringBuilder(k);
        return Integer.parseInt(sb.reverse().toString());
    }

    //---------------------------------------------------------------
    //==================== f1 ====================
    //1. tìm và trả về số phần tử lớn hơn giá trị trung bình trong list
    public int f11(ArrayList<Integer> ar) {
        double avg = 0;
        int count = 0;
        for (Integer o : ar) {
            avg += o;
        }
        avg /= ar.size();
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > avg) {
                count++;
            }
        }
        return count;
    }

    //2. tính và tổng giá trị của các phần tử lớn hơn giá trị trung bình trong list
    public int f12(ArrayList<Integer> ar) {
        int sum = 0;
        for (Integer o : ar) {
            sum += o;
        }
        double avg = sum / ar.size();
        int sumMore = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > avg) {
                sumMore += ar.get(i);
            }
        }
        return sumMore;
    }

    //3. Tính và trả về tổng các giá trị ở vị trí không phải là số nguyên tố
    public int f13(ArrayList<Integer> ar) {
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (!checkPrime(i)) {
                sum += ar.get(i);
            }
        }
        return sum;
    }

    //4. Tính và trả về (phần nguyên) số lớn nhất lớn hơn bao nhiêu lần so với số bé nhất
    public int f14(ArrayList<Integer> ar) {
        int max = ar.get(0), min = ar.get(0);
        for (Integer o : ar) {
            if (o > max) {
                max = o;
            }
            if (o < min) {
                min = o;
            }
        }
        return max / min;
    }

    //5. a. xóa bỏ phần tử lớn nhất và bé nhất đầu tiên xuất hiện trong list
    public void f151(ArrayList<Integer> ar) {
        int max = ar.get(0), min = ar.get(0);
        int posMax = 0, posMin = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > max) {
                max = ar.get(i);
                posMax = i;
            }
            if (ar.get(i) < min) {
                min = ar.get(i);
                posMin = i;
            }
        }
        if (posMax > posMin) {
            ar.remove(posMax);
            ar.remove(posMin);
        } else if (posMax < posMin) {
            ar.remove(posMin);
            ar.remove(posMax);
        }
    }

    //5. b. tính và trả về giá trị trung bình (phần nguyên) của list đó
    public double f152(ArrayList<Integer> ar) {
        double avg = 0;
        for (int i = 0; i < ar.size(); i++) {
            avg += ar.get(i);
        }
        avg /= ar.size();
        return avg;
    }

    //6. a. xóa bỏ tất cả phần tử lớn nhất và bé nhất xuất hiện trong list,
    public void f161(ArrayList<Integer> ar) {
        int max = ar.get(0), min = ar.get(0);
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > max) {
                max = ar.get(i);
            }
            if (ar.get(i) < min) {
                min = ar.get(i);
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == min || ar.get(i) == max) {
                ar.remove(i);
            }
        }
    }

    //6. b. tính và trả về giá trị trung bình (phần nguyên) của list đó
    public void f612(ArrayList<Integer> ar) {

    }

    //7. Tính và trả về giá trị trung bình nửa đầu của list (không xét phần tử giữa nếu có)
    public double f17(ArrayList<Integer> ar) {
        //4 5 6 7 8 9
        //2 3 4 5 6
        double avg = 0;
        for (int i = 0; i < ar.size() / 2; i++) {
            avg += ar.get(i);
        }
        avg /= (ar.size() / 2);
        return avg;
    }

    //8. a-tính giá trị trung bình của các phần tử lớn hơn giá trị trung bình của list
    public double f18(ArrayList<Integer> ar) {
        double avg = 0;
        for (int i = 0; i < ar.size(); i++) {
            avg += ar.get(i);
        }
        avg /= ar.size();
        double avgMore = 0;
        int count = 0;
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) > avg) {
                avgMore += ar.get(i);
                count++;
            }
        }
        avgMore /= count;
        return avgMore;
    }

    //9. tìm và trả về giá trị có tần suất xuất hiện nhiều nhất trong list
    public int f19(ArrayList<Integer> ar) {
        //8 5 1 6 3 5 7 5
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < ar.size(); i++) {
            int count = 0;
            for (int j = i; j < ar.size(); j++) {
                if (ar.get(i) == ar.get(j)) {
                    count++;
                }
            }
            c.add(count);
        }
        //vị trí của phần tử trong count cũng là vị trí của phần tử trong ar
        int index = c.indexOf(Collections.max(c));
        return ar.get(index);
    }

    //10. tìm và trả về (phần nguyên) giá trị trung bình của tần suất xuất hiện các số trong list
    public double f110(ArrayList<Integer> ar) {
        ArrayList<Integer> br = new ArrayList<>();
        br.add(ar.get(0));
        for (int i = 1; i < ar.size(); i++) {
            boolean f = true;
            for (int j = 0; j < br.size(); j++) {
                if (ar.get(i) == br.get(j)) {
                    f = false;
                }
            }
            if (f) {
                br.add(ar.get(i));
            }
        }

        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < br.size(); i++) {
            int count = 0;
            for (int j = 0; j < ar.size(); j++) {
                if (br.get(i) == ar.get(j)) {
                    count++;
                }
            }
            c.add(count);
        }

        double avg = 0;
        for (int i = 0; i < c.size(); i++) {
            avg += c.get(i);
        }
        return avg / c.size();
    }

    //==================== f2 ==================== 
    //---------- Sorting mặc định là tăng dần -----------
    //1. sort các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
    public void f21(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size() / 2; i++) {
            b.add(a.get(i));
        }
        Collections.sort(b);

        int j = 0;
        for (int i = 0; i < a.size() / 2; i++) {
            a.set(i, b.get(j));
            j++;
        }
        print(a);
    }

    //2. sort tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
    public void f22(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (takeAverage(a) < a.get(i)) {
                b.add(a.get(i));
            }
        }

        Collections.sort(b);

        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (takeAverage(a) < a.get(i)) {
                a.set(i, b.get(j));
                j++;
            }
        }

        print(a);
    }

    //3. sort tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
    public void f23(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < takeAverage(a)) {
                b.add(i);
            }
        }

        Collections.sort(b);

        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < takeAverage(a)) {
                a.set(i, b.get(j));
                j++;
            }
        }
        print(a);
    }

    //4. sort tất cả các phần tử chẵn, các phần tử lẻ đứng im
    public void f24(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                b.add(a.get(i));
            }
        }
        Collections.sort(b);

        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                a.set(i, b.get(j));
                j++;
            }
        }
        print(a);
    }

    //5. sort tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
    public void f25(ArrayList<Integer> a) {
        //tự nghĩ ra mà làm
        print(a);
    }

    //6. reverse các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
    public void f26(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size() / 2; i++) {
            b.add(a.get(i));
        }
        Collections.reverse(b);

        int j = 0;
        for (int i = 0; i < a.size() / 2; i++) {
            a.set(i, b.get(j++));
        }
        print(a);
    }

    //7. reverse tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
    public void f27(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > takeAverage(a)) {
                b.add(a.get(i));
            }
        }

        Collections.reverse(b);
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > takeAverage(a)) {
                a.set(i, b.get(j++));
            }
        }
        print(a);
    }

    //8. reverse tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
    public void f28(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < takeAverage(a)) {
                b.add(a.get(i));
            }
        }

        Collections.reverse(b);
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < takeAverage(a)) {
                a.set(i, b.get(j++));
            }
        }
        print(a);
        print(a);
    }

    //9. reverse tất cả các phần tử chẵn, các phần tử lẻ đứng im
    public void f29(ArrayList<Integer> a) {
        //giống câu f24
        print(a);
    }

    //10. reverse tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
    public void f210(ArrayList<Integer> a) {
        //tự tìm tòi
        print(a);
    }

    //11. delete các phần tử nẳm ở nửa đầu của list (ko tính chính giữa) phía sau đứng im
    public void f211(ArrayList<Integer> a) {
        ArrayList<Integer> b = new ArrayList<>();

        for (int i = 0; i < a.size() / 2; i++) {
            b.add(a.get(i));
        }

        a.removeAll(b);
        print(a);
    }

    //12. delete tất cả các phần tử có giá trị lớn hơn giá trị trung bình, các phần tử khác đứng im
    public void f212(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > takeAverage(a)) {
                a.remove(i);
                i--;
            }
        }
        print(a);
    }

    //13. delete tất cả các phần tử có giá trị bé hơn giá trị trung bình, các phần tử khác đứng im
    public void f213(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < takeAverage(a)) {
                a.remove(i);
                i--;
            }
        }
        print(a);
    }

    //14. delete tất cả các phần tử chẵn, các phần tử lẻ đứng im
    public void f214(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                a.remove(i);
                i--;
            }
        }
        print(a);
    }

    //15. delete tất cả các phần tử thỏa mãn điều kiện (abc), các phần tử khác đứng im
    public void f215(ArrayList<Integer> a) {
        //tự nghĩ
        print(a);
    }

    //16. thay thế tất cả các phần tử bằng số nguyên tố lớn hơn hoặc bằng và gần với nó nhất
    public void f216(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, takePrimeGreater(a.get(i)));
        }
        print(a);
    }

    //17. thay thế tất cả các phần tử bằng ước số nguyên tố lớn nhất của nó.
    public void f217(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, takeMaxPrimeGCD(a.get(i)));
        }
        print(a);
    }

    //18. thay thế tất cả các phần tử bằng tổng các ước số của nó.
    public void f218(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, takeSumGCD(a.get(i)));
        }
        print(a);
    }

    //19. thay thế tất cả các phần tử bằng số ngược với nó (123-->321)
    public void f219(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            a.set(i, takeReverse(a.get(i)));
        }
        print(a);
    }

    //20. thay thế tất cả các phần tử bằng số thỏa mãn điều kiện (abc) bé hơn hoặc bằng và gần với nó nhất
    public void f220(ArrayList<Integer> a) {
        //tự suy nghĩ thêm
        print(a);
    }

    //-------------------------- SUPPORT METHOD Q3 --------------------------
    //lấy 1 mảng các số từ chuỗi
    public String[] takeNumberToString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                s = s.replace(s.charAt(i), ' ');
            }
        }
        s = s.trim();
        String []k = s.split("\\s+");
        return k;
    }

    //==================== f3 ==================== 
    //1. Đếm và trả về trong chuỗi có bao nhiêu ký tự số <s123a2> - 4 số
    public int f31(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    //2. Đếm số và trả vè trong chuỗi có bao nhiêu số <s123a2> - 2 số
    public int f32(String s) {
        return takeNumberToString(s).length;
    }

    //3. Tính và trả về tổng các chữ số trong chuỗi - <s123a2> 8
    public int f33(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(s.charAt(i) + "");
            }
        }
        return sum;
    }

    //4. Tính và trả về tổng các số xuất hiện trong s <s123a2> - 125
    public int f34(String s) {
        int sum = 0;
        for (int i = 0; i < takeNumberToString(s).length; i++) {
            sum+=Integer.parseInt(takeNumberToString(s)[i]);
        }
        return sum;
    }

    //5. Tìm và trả về giá trị max (min) trong chuỗi <s123a2> - 123, 251 
    public int f35(String s) {
        String k[] = takeNumberToString(s);
        int max = Integer.parseInt(k[0]);
        for (int i = 0; i < k.length; i++) {
            int x = Integer.parseInt(k[i]);
            if(x > max)
                max = x;
        }
        return max;
    }

    //6. Tìm và trả về số từ trong chuỗi thỏa mãn điều kiện abc
    public int f36(String s) {
        //tự nghĩ
        return 0;
    }

    //7. Tính và trả về phần nguyên của giá trị trung bình của các số xuất hiện trong chuỗi <s12b3a2> ->5
    public int f37(String s) {
        int avg = 0;
        for (int i = 0; i < takeNumberToString(s).length; i++) {
            avg+=Integer.parseInt(takeNumberToString(s)[i]);
        }
        avg/=takeNumberToString(s).length;
        return avg;
    }

    //8. Tính và trả về tổng các số là nguyên tố có trong chuỗi <s12b3a5> -> 8
    public int f38(String s) {
        int sum = 0;
        for (int i = 0; i < takeNumberToString(s).length; i++) {
            if(checkPrime(Integer.parseInt(takeNumberToString(s)[i]))) {
                sum+=Integer.parseInt(takeNumberToString(s)[i]);
            }
        }
        return sum;
    }

    //9. Đếm và trả về số các số là nguyên tố có trong chuỗi <s12b3a5> -> 2
    public int f39(String s) {
        int count = 0;
        for (int i = 0; i < takeNumberToString(s).length; i++) {
            if(checkPrime(Integer.parseInt(takeNumberToString(s)[i]))) {
                count++;
            }
        }
        return count;
    }

    //10. Tìm và trả về số có tần suất xuất hiện lớn nhất trong chuỗi <s12b3 a5s1 b17 a5s 12b3a5>->5
    public int f310(String s) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < takeNumberToString(s).length; i++) {
            a.add(Integer.parseInt(takeNumberToString(s)[i]));
        }
        
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = i; j < a.size(); j++) {
                if(a.get(i) == a.get(j))
                    count++;
            }
            c.add(count);
        }
        int index = c.indexOf(Collections.max(c));
        return a.get(index);
    }
    
    //-------------------------- SUPPORT METHOD Q4 --------------------------
    
    
    //==================== f4 ==================== 
    //1. đảo ngược tất cả các ký tự trong chuỗi |abc12 ->21cba
    public String f41(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    
    //2. đảo ngược nửa đầu các ký tự của chuỗi không tính ký tự giữa |abc123456 --> 1cba23456
    public String f42(String s) {
        
        return null;
    }
    
    //3. đảo ngược tất cả các từ trong chuỗi |a1 a2 b3 c4 -> c4 b3 a2 a1
    public String f43(String s) {
        
        return null;
    }
    
    //4. đảo ngược nửa cuối các từ trong chuỗi ko tính từ ở giữa |a1 a2 b3 c4 -> a1 a2c4 b3
    public String f44(String s) {
        
        return null;
    }
    
    //5. sort nửa đầu các từ trong chuỗi theo thứ tự tăng dần của từ điển (khong tinh tu chinh giữa)
    //cong hoa xa hoi chu nghia viet nam -> cong hoa hoi xa chu nghia viet nam
    public String f45(String s) {
        
        return null;
    }
    
    //6. sort tất cả các từ thỏa mãn điều kiện abc
    public String f46(String s) {
        
        return null;
    }
    
    //7. sort tất cả các ký tự không phải là space theo thứ tự tăng dần của ACSII code: a1 b2 c4 -->12 4a bc
    public String f47(String s) {
        
        return null;
    }
    
    //8. xóa bỏ từ đầu tiên dài nhất trong chuỗi
    //cong hoa xa hoi12 chu nghia viet nam -> cong hoa xa chu nghia viet nam
    public String f48(String s) {
        
        return null;
    }
    
    //9. xóa bỏ từ đầu tiên (cuối cùng) thỏa mãn điều kiện abc
    public String f49(String s) {
        
        return null;
    }
    
    //10. thay thế từ có chứa ký tự số đầu tiên bằng "Hello"
    //cong hoa xa12 hoi chu1 nghia2 --> cong hoa Hello hoi chu1 nghia2
    public String f410(String s) {
        
        return null;
    }
    
}
