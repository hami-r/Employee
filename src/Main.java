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
                    System.out.println("Number of Employees: " + employeeList.size());
                    for (int i = 0; i < employeeList.size(); i++) {
                        System.out.println((i+1) + ")");
                        employeeList.get(i).display();
                    }
                    break;
                case 3:
                    System.out.println("Enter the employee id:");
                    int id = scanner.nextInt();
                    boolean isFound = false;
                    int found = 0;
                    for(int i = 0; i < employeeList.size(); i++) {
                        if(employeeList.get(i).employeeId == id) {
                            isFound = true;
                            found = i;
                            break;
                        }
                    }
                    if(isFound){
                        System.out.println("Employee founded!!");
                        employeeList.get(found).display();
                    }
                    else {
                        System.out.println("Employee not found");
                    }
                    break;
                case 4:
                    System.out.println("Enter the employee ID to be deleted");
                    id = scanner.nextInt();
                    for(int i = 0; i < employeeList.size(); i++) {
                        if(employeeList.get(i).employeeId == id) {
                            employeeList.remove(i);
                            System.out.println("Employee is deleted!\n" +
                                    "Current number of employees = " + employeeList.size());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        }
    }
}