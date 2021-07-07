package HomeWork;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nguyen Khoi
 */
public class BTString {

    public static Scanner sc = new Scanner(System.in);

    //------------------------------------------------
    //1. Đếm số từ có chứa số
    public static boolean checkDigitInWord(String s) {
        String a = "1234567890";
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(s.charAt(i) + "")) {
                return true;
            }
        }
        return false;
    }

    public static int wordContainDigit(String s) {
        String a[] = s.split("\\s+");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (checkDigitInWord(a[i])) {
                count++;
            }
        }
        return count;
    }

    //------------------------------------------------
    //2. Đếm số lượng chuỗi có chính xác hai số
    public static boolean checkDigit(char a) {
        String b = "0123456789";
        if (b.contains(a + "")) {
            return true;
        }
        return false;
    }

    public static int wordHaveManyDigit(String s) {
        String a[] = s.split("\\s+");
        int countWord = 0;
        for (int i = 0; i < a.length; i++) {
            int count2 = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (checkDigit(a[i].charAt(j))) {
                    count2++;
                }
            }
            if (count2 == 2) {
                countWord++;
            }
        }
        return countWord;
    }

    //------------------------------------------------
    //3. Đếm số lượng chuỗi có tổng bằng 5
    public static int everyWordEqual5(String s) {
        String a[] = s.split("\\s+");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int sumWord = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (checkDigit(a[i].charAt(j))) {
                    sumWord += Integer.parseInt(a[i].charAt(j) + "");
                }
            }
            if (sumWord == 5) {
                count++;
            }
        }
        return count;
    }

    //------------------------------------------------
    //4. Tìm và trả về từ đầu tiên có chính xác 2 nguyên âm
    public static String exactly2Na(String s) {
        String a[] = s.split("\\s+");

        for (String o : a) {
            if (check2NA(o)) {
                return o;
            }
        }
        return "Not-exist";
    }

    public static boolean check2NA(String s) {
        String a = "ueoai";
        s = s.toLowerCase();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a.contains(s.charAt(i) + "")) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        }
        return false;
    }

    //------------------------------------------------
    //5. Đếm chuỗi có ít nhất hai số nguyên tố
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countMin2Prime(String s) {
        int count = 0;
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            int countPrime = 0;
            for (int j = 0; j < a[i].length(); j++) {
                if (checkDigit(a[i].charAt(j))) {
                    if (checkPrime(Integer.parseInt(a[i].charAt(j) + ""))) {
                        countPrime++;
                    }
                }
            }
            if (countPrime >= 2) {
                count++;
            }
        }
        return count;
    }

    //------------------------------------------------
    //6. In ra chuỗi con dài nhất
    public static String printLongestString(String s) {
        String a[] = s.split("\\s+");
        int max = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (max < a[i].length()) {
                max = a[i].length();
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i].length() == max) {
                return a[i];
            }
        }

        return null;
    }

    //------------------------------------------------
    //7. In ra chuỗi con có tổng số có hai chữ lớn nhất
    public static void sum2Number(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            int sume = 0;
            for (int j = 0; j < a[i].length() - 1; j++) {
                char k = a[i].charAt(j);
                char h = a[i].charAt(j + 1);
                if (checkDigit(k) && checkDigit(h)) {
                    String f = k + "" + h + "";
//                    System.out.println(f);
                    int n = Integer.parseInt(f);
                    sume += n;
//                    System.out.println(""+sume);
                } else if (checkDigit(k) && !checkDigit(h)) {
                    int n = Integer.parseInt(k + "");
                    sume += n;
//                    System.out.println(""+sume);
                } else if (checkDigit(k) && (h + "") == null) {
                    sume += Integer.parseInt(k + "");
                }
            }
            System.out.print(sume + "\t");
        }
//        return 0;
    }

    //------------------------------------------------
    //8. Check xem có bao nhiêu chuỗi có các kí tự khác nhau
    public static boolean check1StringDiffer(String s) {
        //s = "abcdef";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((s.charAt(i) + "").equals(s.charAt(j) + "")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int countDifferenceChar(String s) {
        String a[] = s.split("\\s+");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (check1StringDiffer(a[i])) {
                count++;
            }
        }
        return count;
    }

    //------------------------------------------------
    //9. Đến xem có bao nhiêu chuỗi có toàn là số
    public static int countFullNumber(String s) {
        String a[] = s.split("\\s+");
        int flag = 1, count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                if (!checkDigit(a[i].charAt(j))) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;
    }

    //------------------------------------------------
    //10. Sắp xếp chuỗi tăng dần theo alphabet
    public static void sortAccending(String s) {
        char w[] = s.toCharArray();
        for (int i = 0; i < w.length - 1; i++) {
            for (int j = i + 1; j < w.length; j++) {
                if (w[i] > w[j]) {
                    char t = w[i];
                    w[i] = w[j];
                    w[j] = t;
                }
            }
        }
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]);
        }
    }

    public static void sortStringAcd(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            sortAccending(a[i]);
            System.out.println("");
        }
    }

    //------------------------------------------------
    //11.In ra chuỗi bắt đầu bằng chữ 'a'
    public static void startWithA(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (a[i].startsWith("a") || a[i].startsWith("A")) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //12.In ra những chuỗi kết thúc bằng số
    public static boolean checkLastNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (checkDigit(s.charAt(s.length() - 1))) {
                return true;
            }
        }
        return false;
    }

    public static void lastByNumber(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkLastNumber(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //13.In ra chuỗi số nhị phân
    public static boolean checkBinary(String s) {
        String k = "01";
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (!k.contains(s.charAt(i) + "")) {
                flag = 0;
            }
        }
        if (flag == 1) {
            return true;
        }
        return false;
    }

    //In ra từng chuỗi
    public static void printBinary(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkBinary(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //14.In ra chữ số so le nhau: 1a2b
    public static boolean checkChar(char a) {//check kí tự là chữ
        int ascii = (int) a;
        if ((a >= 65 && a < 90) || (a >= 97 && a <= 122)) {
            return true;
        }
        return false;
    }

    public static boolean soLeString(String s) {
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (!checkDigit(s.charAt(i))) {
                    flag = 0;
                }
                if (flag == 0) {
                    return false;
                }
            } else {
                if (!checkChar(s.charAt(i))) {
                    flag = 0;
                }
                if (flag == 0) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void printSoLeStringAndNumber(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (soLeString(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //15.In ra chữ số so le nhau: 1a2b3c4d5e6f7g..........
    public static boolean soLeString1a2b3c(String s) {
        char a = 'a';
        int b = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                if (!(a + "").equalsIgnoreCase(s.charAt(i) + "")) {
                    return false;
                }
                a++;
            } else {
                if (!String.valueOf(b).equals(s.charAt(i) + "")) {
                    return false;
                }
                b++;
            }
        }
        return true;
    }

    public static void printSoLePB2(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (soLeString1a2b3c(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //16.In ra chuỗi có kí tự đặc biệt
    public static boolean checkSpecialChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!checkDigit(s.charAt(i)) && !checkChar(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void printSpecialString(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkSpecialChar(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //17. In ra chuỗi có số nguyên tố so le với chữ: có dạng 2a3b5c7d
    public static boolean checkSoLePrime(String s) {
        char a = 'a';

        int k = 0;
        int c[] = new int[1000];
        for (int i = 0; i < 1000; i++) {
            if (checkPrime(i)) {
                c[k] = i;
                k++;
            }
            //k++;
        }

        int h = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (!String.valueOf(c[h]).equals(s.charAt(i) + "")) {
                    return false;
                }
                System.out.println(c[h]);
                h++;
            } else {
                if (!(a + "").equalsIgnoreCase(s.charAt(i) + "")) {
                    return false;
                }
                a++;
            }
        }
        return true;
    }

    public static void printSoLePrime(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkSoLePrime(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //18. In ra các chuỗi palidrome
    public static boolean checkPalidrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        if (reverse.equals(s)) {
            return true;
        }
        return false;
    }

    public static void printPalidrome(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkPalidrome(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //19. Thay thế tất cả chữ a trong chuỗi thành chữ b
    public static void replaceStringab(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            String replace = a[i].replace('a', 'b');
            System.out.println(replace);
        }
    }

    //------------------------------------------------
    //20. Nối chuỗi lại với nhau
    public static void noiString(String s) {
        String a[] = s.split("\\s+");
        String k = "";
        for (int i = 0; i < a.length; i++) {
            k += a[i];
        }
        System.out.println(k);
    }

    //------------------------------------------------
    //21. Cắt chuỗi từ a tới b: sdavb -> v
    public static int indexA(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                return i;
            }
        }
        return -1;
    }

    public static int indexB(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                return i;
            }
        }
        return -1;
    }

    public static void cutStringAToB(String s) {
        String a[] = s.split("\\s+");

        for (int i = 0; i < a.length; i++) {
            if (indexA(a[i]) == -1 || indexB(a[i]) == -1 || Math.abs(indexB(a[i]) - indexA(a[i])) == 1) {
                System.err.println("Not exist");
            } else {
                if (indexA(a[i]) > indexB(a[i])) {
                    System.out.println(a[i].substring(indexB(s) + 1, indexA(s)));
                } else {
                    System.out.println(a[i].substring(indexA(s) + 1, indexB(s)));
                }
            }
        }
    }

    //------------------------------------------------
    //22. In ra chuỗi format số điện thoại: 567-123-897
    public static String formatPhone(String s) {
        String k = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            k += s.charAt(i);
//            System.out.println(k);
            count++;
            if (count == 3) {
                k += '-';
//                i++;
                count = 0;
            }
        }
        String h = "";
        if (k.charAt(k.length() - 1) == '-') {
            for (int i = 0; i < k.length() - 1; i++) {
                h += k.charAt(i);
            }
            return h;
        } else {
            return k;
        }

    }

    public static void printFormatPhone(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            System.out.println(formatPhone(a[i]));
//            System.out.println(a[i]);
        }
    }

    //------------------------------------------------
    //23. In ra chuỗi có kí tự đầu và cuối là prime
    public static void printFirstLastIsPrime(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if ((checkDigit(a[i].charAt(0)) 
                    && checkPrime(Integer.parseInt(a[i].charAt(a[i].charAt(0)) + "")))
                    && (checkDigit(a[i].charAt(a[i].length() - 1))
                    && checkPrime(Integer.parseInt(a[i].charAt(a[i].charAt(a[i].length() - 1)) + "")))) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //24.Hàm xuất hiện 2 chữ a không cạnh nhau
    public static boolean checkA(String s) {
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            if (s.charAt(i) == 'a' && s.charAt(i + 1) != 'a') {
                flag = 1;
            }
        }
        if (flag == 1) {
            return true;
        }
        return false;
    }

    public static void aKhongCanhNhau(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (checkA(a[i])) {
                System.out.println(a[i]);
            }
        }
    }

    //------------------------------------------------
    //25. Tìm số đầu tiên trong mỗi chuỗi
    public static void searchTheFirstDigit(String s) {
        String a[] = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].startsWith(a[i].charAt(j) + "") && checkDigit(a[i].charAt(j))) {
                    System.out.println(a[i].charAt(j));
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        //BTVN định nghĩa ít nhất 25 từ khác nhau
        //Viết hàm check để kiểm tra 20 loại từ khác nhau
        //tìm và trả về từ đầu tiên (cuối cùng thỏa mãn ddkien abc)
        //tìm và trả về từ đầu tiên có chính xác 2 nguyên âm
        //sort tất cả các từ thỏa mãn điều kiện abc
        //sort tất cả c ác từ trong chuỗi s hoặc là có dạng proper(kí tự đầu viết hoa còn kí tự sau viết thường)
        //sort tất cả các từ ở vị trí thỏa mãn xyz theo thứ tự tăng dần từ điển 
        //sort tất cả các từ ở vị trí chẵn theo tăng dần từ điển
        //-------------------------------------------------------------
        System.out.print("Enter array word: ");
        String s = sc.nextLine();
//        1.System.out.println("1.Có "+wordContainDigit(s)+" chứa số");
//        2.System.out.println("2.Có "+wordHaveManyDigit(s)+" từ có chính xác 2 số");
//        3.System.out.println("3.Số lượng từ có tổng bằng 5: "+everyWordEqual5(s));
//        4.System.out.println("4.Có chính xác hai nguyên âm: " + exactly2Na(s));
//        5.System.out.println("5.Số từ có ít nhất hai số nguyên tố: "+countMin2Prime(s));
//        6.System.out.println("6.Chuỗi con dài nhất là: " + printLongestString(s));
//        7.sum2Number(s);//In ra tổng hai chữ số của mỗi chuỗi
//        8.System.out.println("8.Có "+countDifferenceChar(s)+" chuỗi có kí tự khác nhau");
//        9.System.out.println("9.Có "+countFullNumber(s)+" chuỗi toàn số");
//        10.sortStringAcd(s);
//        11.startWithA(s);
//        12.lastByNumber(s);
//        13.printBinary(s);
//        14.printSoLeStringAndNumber(s);
//        15.printSoLePB2(s);
//        16.printSpecialString(s);
//        17.printSoLePrime(s);
//        18.printPalidrome(s);
//        19.replaceStringab(s);
//        20.noiString(s);
//        21.cutStringAToB(s);
//        22.printFormatPhone(s);
//        23.printFirstLastIsPrime(s);
//        24.aKhongCanhNhau(s);
//        25.searchTheFirstDigit(s);
    }
}
