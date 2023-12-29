class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor for Member class
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    // Constructor for Employee class
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    // Constructor for Manager class
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Day4_qn1 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("Virat", 30, "123-456-7890", "123 Main St", 50000.0, "Java Developer");

        // Creating a Manager object
        Manager manager = new Manager("Rahul", 35, "987-654-3210", "456 Park Ave", 80000.0, "Human Resources");

        // Printing details and salary for the Employee
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        employee.printSalary(); // using the method from the Member class
        System.out.println("Specialization: " + employee.specialization);
        System.out.println();

        // Printing details and salary for the Manager
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary(); // using the method from the Member class
        System.out.println("Department: " + manager.department);
    }
}
