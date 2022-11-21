import java.util.ArrayList;
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
            ArrayList<Employee> employeeList = new ArrayList<>(5);
            switch (choice) {
                case 1:
                    Employee employee = new Employee();
                    employeeList.add(employee);
                    System.out.println("Employee ADDED!");
                    break;
            }
        }
    }
}