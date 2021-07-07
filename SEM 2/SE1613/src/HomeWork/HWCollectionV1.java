/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeWork;

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Nguyen Khoi
 */
public class HWCollectionV1 {

    public static Scanner sc = new Scanner(System.in);

    //Co-method-----------------------------------------------
    public static boolean checkPrime(int n) {
    // Kiểm tra số nguyên tố
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static int maxPrime(int n) {
    // Trả về max số nguyên tố
        for (int i = n; i >= 2; i--) {
            if (checkPrime(i) == true && n % i == 0) {
                return i;
            }
        }
        return -1;
    }

    //f1-----------------------------------------------
    public static void f1(ArrayList<Integer> a) {
        //1. Remove tất cả các phần tử là số nguyên tố trong list
        //f1RemovePrimes(a);

        //2. Sort tất cả phần tử có trong a (không sử dụng colections.sort())
        //f1SortElement(a);
        
        //3. Sort tất cả các số nguyên tố trong list a, các số khác đứng yên
        //f1SortPrimes(a);

        //4. Thêm vào trước phần tử đầu tiên lớn nhất số 100
        //f1AddFrontMax(a);
        
        //5. Giả sử size >= 10. Sắp xếp 5 phần tử đầu tiên(cuối cùng) theo thứ tự giảm dần, reverse 5 phần tử cuối đầu tiên
        //f1Reverse5FirstLastAnd5SortLastFirst(a);
        
        //6. Giả sử số phần tử của list là chẵn, chia list thành hai phần riêng biệt rồi sort -> merge sort
        f1MergeSort(a);

        //7. Thay thế tất cả các phần tử của a bằng ước số nguyên tố lớn nhất của nó
        //f1ChangeElementByMaxPrime(a);
    }

    public static void f1RemovePrimes(ArrayList<Integer> a) {
        //1. Remove tất cả các phần tử là số nguyên tố trong list
        for (int i = a.size() - 1; i >= 0; i--) {
            if (checkPrime(a.get(i))) {
                a.remove(a.get(i));
            }
        }
        System.out.println(a);
    }

    public static void f1SortElement(ArrayList<Integer> a) {
        //2. Sort tất cả phần tử có trong a (không sử dụng colections.sort())
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    Integer tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            }
        }
        System.out.println("Sorted: " + a);
    }

    public static void f1SortPrimes(ArrayList<Integer> a) {
        //3. Sort tất cả các số nguyên tố trong list a, các số khác đứng yên
        ArrayList<Integer> listPrime = new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            if(checkPrime(a.get(i)))
                listPrime.add(a.get(i));
        }
        Collections.sort(listPrime);
        
        int j = 0;
        for (int i = 0; i < a.size(); i++) {
            if(checkPrime(a.get(i))) {
                a.set(i, listPrime.get(j));
                j++;
            }
        }
        
        System.out.println("After sort prime: "+a);
    }

    public static void f1AddFrontMax(ArrayList<Integer> a) {
        //4. Thêm vào trước phần tử đầu tiên lớn nhất số 100
        Integer max = a.get(0);
        int posMax = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > max) {
                //max = a.get(i);
                posMax = i;
            }
        }
        a.add(posMax, 100);

        System.out.println("After add 100 in front of max: " + a);
    }

    public static void f1Reverse5FirstLastAnd5SortLastFirst(ArrayList<Integer> a) {
        //5. Giả sử size >= 10. Sắp xếp 5 phần tử đầu tiên(cuối cùng) theo thứ tự giảm dần, reverse 5 phần tử cuối đầu tiên
        ArrayList<Integer> list5FirstElment = new ArrayList<>();
        ArrayList<Integer> list5LastElement = new ArrayList<>();

        //reverse 5 element first
        for (int i = 4; i >= 0; i--) {
            list5FirstElment.add(a.get(i));
        }
        
        //Sort 5 last elements
        for (int i = a.size() - 5; i < a.size(); i++) {
            list5LastElement.add(a.get(i));
        }
        Collections.sort(list5LastElement);
        
        //set 5 elemet first last
        for (int i = 0; i < 5; i++) {
            a.set(i, list5FirstElment.get(i));
        }
        
        int j = 0;
        for (int i = a.size()-5; i < a.size(); i++) {
            a.set(i, list5LastElement.get(j));
            j++;
        }
        System.out.println("The final array: "+a);
    }

    public static void f1MergeSort(ArrayList<Integer> a) {
        //6. Giả sử số phần tử của list là chẵn, chia list thành hai phần riêng biệt rồi sort
        int length = a.size()/2;//10 11
        ArrayList<Integer> listFirst = new ArrayList<>();
        ArrayList<Integer> listLast = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            listFirst.add(a.get(i));
        }
        Collections.sort(listFirst);
        
        for (int i = length; i < a.size(); i++) {
            listLast.add(a.get(i));
        }
        Collections.sort(listLast);
        
        int j=0;
        for (int i = 0; i < a.size(); i++) {
            if(i<length) 
                a.set(i, listFirst.get(i));
            else {
                a.set(i, listLast.get(j));
                j++;
            }
        }
        
        System.out.println("Sort follow half list: "+a);
    }
    
    public static void f1ChangeElementByMaxPrime(ArrayList<Integer> a) {
        //7. Thay thế tất cả các phần tử của a bằng ước số nguyên tố lớn nhất của nó
        ArrayList<Integer> listMaxPrime = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            listMaxPrime.add(maxPrime(a.get(i)));
        }
        System.out.println("List Max Prime: " + listMaxPrime);
    }

    //f2-----------------------------------------------
    public static void f2(ArrayList<Integer> a) {
        //1. Tính và trả về tổng các số nguyên tố trong list a
        //System.out.println("Sum Primes: "+f2SumPrime(a));

        //2. Đếm và trả về các số là số nguyên tố trong list a
        //System.out.println("Count Primes: "+f2CountPrime(a));
        //3. Tính và trả về tổng(tích) các số nửa đầu trong list a (Không tính phần tử ở giữa nếu có)
        //System.out.println("Sum Half List: "+f2SumHalfElements(a));
        //4. Tính tổng(hiệu, tích, thương) các số bé nhất và lớn nhất trong list a
        //System.out.println("Sum Min Max: " + f2SumMinMax(a));
        //5. Tính tổng của tất cả trong 2 loại số lớn nhất trong list a
        //System.out.println("Sum Twos Max: " + f2SumTwoMaxNumber(a));
    }

    public static int f2SumPrime(ArrayList<Integer> a) {
        //1. Tính và trả về tổng các số nguyên tố trong list
        int sumPrime = 0;
        for (Integer o : a) {
            if (checkPrime(o)) {
                sumPrime += o;
            }
        }
        return sumPrime;
    }

    public static int f2CountPrime(ArrayList<Integer> a) {
        //2. Đếm và trả về các số là số nguyên tố trong list a
        int count = 0;
        for (Integer o : a) {
            if (checkPrime(o)) {
                count++;
            }
        }
        return count;
    }

    public static int f2SumHalfElements(ArrayList<Integer> a) {
        //3. Tính và trả về tổng(tích) các số nửa đầu trong list a (Không tính phần tử ở giữa nếu có)
        int sumHalf = 0;
        for (int i = 0; i < a.size() / 2; i++) {
            sumHalf += a.get(i);
        }
        return sumHalf;
    }

    public static int f2SumMinMax(ArrayList<Integer> a) {
        //4. Tính tổng(hiệu, tích, thương) các số bé nhất và lớn nhất trong list a
        int sumMinMax = Collections.max(a) + Collections.min(a);
        return sumMinMax;
    }

    public static int f2SumTwoMaxNumber(ArrayList<Integer> a) {
        //5. Tính tổng của tất cả trong 2 loại số lớn nhất trong list a
        int sumMax = 0;
        Collections.sort(a);
        int maxFirst = a.get(a.size() - 1);// -> max thứ nhất

        int maxSecond = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) < maxFirst) {
                maxSecond = a.get(i);
                break;
            }
        }

        int countFirstMax = 0, countSecondMax = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == maxFirst) {
                countFirstMax++;
            }
            if (a.get(i) == maxSecond) {
                countSecondMax++;
            }
        }
        sumMax = maxFirst * countFirstMax + maxSecond * countSecondMax;
        return sumMax;
    }

    //------------------------------------------------
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Input size: ");
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            a.add(rd.nextInt(100));
        }
        System.out.println("The array is: " + a);
        //f1--------------------------------
        f1(a);
        //f2--------------------------------
        //f2(a);
    }
}
