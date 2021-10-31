package views;

import java.util.Scanner;

/**
 *
 * @author kazaf
 */
class Validate {

    private static Scanner sc = new Scanner(System.in);

    /**
     * Lấy số chuẩn kiểu int
     * @param msg message
     * @param err error
     * @param min min value
     * @param max max value
     * @return giá trị int
     */
    public static int getInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int num;
                String str = sc.nextLine();
                num = Integer.parseInt(str);
                if (min <= num && num <= max) {
                    return num;
                } else {
                    System.out.println("Number inrange[" + min + "-" + max + "]");
                }
            } catch (NumberFormatException ex) {
                System.out.println(err);
            }
        }
    }

    /**
     * Lấy string theo chuẩn
     * @param msg message
     * @param err error
     * @param regex regex
     * @return String chuẩn
     */
    public static String getString(String msg, String err, String regex) {
        while (true) {
            try {
                System.out.print(msg);
                String str = sc.nextLine();
                if (str.matches(regex)) {
                    return str.trim();
                }
            } catch (Exception e) {
                System.out.println("Meet IOException");
            }
            System.out.println(err);
        }
    }

    /**
     * Get choice
     * @return choice
     */
    public static int getChoice() {
        int choice = getInt("Enter your choice: ", "Invalid choice[1-5]", 1, 5);
        return choice;
    }

    /**
     * Get Name
     * @return name chuẩn
     */
    public static String getName() {
        String name = getString("Enter name: ", "Invalid name", "[a-zA-Z ]+");
        return name;
    }

    /**
     * get Id
     * @return id chuẩn 
     */
    public static String getId() {
        //String id = getString("Enter id: ", "Invaid id(HE******)", "(HE|he)[0-9]{6}");
        String id = getString("Enter id: ", "Invaid id", "[^[0-9]*[1-9][0-9]*$]+");
        return id;
    }

    /**
     * get Semeter
     * @return semeter 
     */
    public static String getSemeter() {
        String semester = getString("Enter semester: ", "Invaid semester[1-9]", "[1-9]");
        return semester;
    }

    /**
     * get Course name
     * @return Course name chuẩn
     */
    public static String getCourse() {
        while (true) {
            System.out.print("Enter course: ");
            String result = sc.nextLine();
            //Name phải có trong 3 khóa học này
            if (result.equalsIgnoreCase("Java")
                    || result.equalsIgnoreCase(".Net")
                    || result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.out.println("There are only three courses: Java, .Net, C/C++");
        }
    }

    /**
     * check yes no
     * @return boolean
     */
    public static boolean getYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    /**
     * U: true D: false
     *
     * @return
     */
    public static boolean getUD() {
        while (true) {
            String result = sc.nextLine();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }
}
