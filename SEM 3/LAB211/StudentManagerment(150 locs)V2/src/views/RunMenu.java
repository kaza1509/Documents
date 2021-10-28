package views;

/**
 *
 * @author kazaf
 */
public class RunMenu {

    public void menu() {
        view v = new view();
        while (true) {
            System.out.println("================= Menu ==============\n"
                    + "1. Create\n"
                    + "2. Find and Sort\n"
                    + "3. Update/Delete\n"
                    + "4. Report\n"
                    + "5. Exit");
            System.out.println("=====================================");
            System.out.print("Do you want to see list student(Y/N): ");
            if(Validate.getYN()) 
                v.displayStudent();
            
            int choice = Validate.getChoice();

            switch (choice) {
                case 1:
                    v.createStudent();
                    break;
                case 2:
                    v.findAndSort();
                    break;

                case 3:
                    v.updateOrDelete();
                    break;

                case 4:
                    v.report();
                    break;

                case 5:
                    System.out.println("Exit program");
                    System.exit(0);
                    break;
            }
        }
    }
}
