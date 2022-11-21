import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("""
                    <--------------MENU--------------->
                    1. Add Employee
                    2. Display All Employee
                    3. Search Employee
                    4. Delete Employee
                    5. Exit
                    Select your option:""");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {

            }
        }
    }
}