import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isContinue = true;
        ArrayList<Employee> employeeList = new ArrayList<>();
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
                case 1:
                    Employee employee = new Employee();
                    employeeList.add(employee);
                    System.out.println("Employees ADDED = " + employeeList.size());
                    break;
                case 2:
                    System.out.println(employeeList.size());
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println(i + ")");
                        employeeList.get(i).display();
                    }
                    break;
            }
        }
    }
}