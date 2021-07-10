/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author kazaf
 */
public class CheckValidate {

    private Scanner sc = new Scanner(System.in);

    public int getAnInteger() {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.print("This is not integer. Please input again: ");
            }
        }
    }

    public double getAnDouble() {
        double n;
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.print("This is not double. Please input again: ");
            }
        }
    }

    public String getAnID() {
        while (true) {
            String rollNo = sc.nextLine();
            if (rollNo.length() == 8 && rollNo.charAt(0) == 'H' && rollNo.charAt(1) == 'E') {
                return rollNo;
            }
            System.err.print("Re-Input. RollNo(HEXXXXXX): ");
        }
    }

    public double getAnMark() {
        double n;
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if (n >= 0 && n <= 10 )
                    return n;
                System.err.print("Re-Input mark(0.0 -> 10.0): ");
            } catch (NumberFormatException e) {
                System.err.print("Re-Input mark(0.0 -> 10.0): ");
            }
        }
    }
}
