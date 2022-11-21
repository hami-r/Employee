import java.util.Scanner;

public class Employee {
    int employeeId;
    String name;
    String designation;
    double salary;
    String companyName;
    String phoneNumber;
    String email;

    public Employee() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the details:");
        System.out.print("Employee ID: ");
        this.employeeId = input.nextInt();
        input.nextLine();
        System.out.print("Name: ");
        this.name = input.nextLine();
        System.out.print("Designation: ");
        this.designation = input.nextLine();
        System.out.print("Salary: ");
        this.salary = input.nextDouble();
        System.out.print("Company Name: ");
        input.nextLine();
        this.companyName = input.nextLine();
        System.out.print("Phone Number:");
        this.phoneNumber = input.nextLine();
        System.out.print("E-mail: ");
        this.email = input.nextLine();
    }

    void display() {
        System.out.println("Employee ID: " + employeeId + "\n" +
                "Name: " + name + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: " + salary + "\n" +
                "Company Name: " + companyName + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email: " + email + "\n");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();

    }
}
