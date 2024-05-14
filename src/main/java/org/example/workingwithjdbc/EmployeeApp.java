package org.example.workingwithjdbc;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeDb employeeDb = new EmployeeDb();

        // Adding employees
        Employee dylan = new Employee(10, "Dylan", "dylan@example.com", "Software Developer");
        Employee tim = new Employee(11, "Tim", "tim@example.com", "Software Developer");
        Employee maaike = new Employee(12, "Maaike", "maaike@example.com", "Software Developer");

        employeeDb.addEmployee(dylan);
        employeeDb.addEmployee(tim);
        employeeDb.addEmployee(maaike);
        System.out.println("*******************************");

        // Display all employees
        System.out.println("All employees:");
        for (Employee emp : employeeDb.getAllEmployees()) {
            System.out.println(emp);
        }

        System.out.println("*******************************");

        // Update Maaike's job title
        maaike.setDepartment("Software Trainer");
        employeeDb.updateEmployee(maaike);

        // Display all employees after update
        System.out.println("\nAll employees after update:");
        for (Employee emp : employeeDb.getAllEmployees()) {
            System.out.println(emp);
        }

        System.out.println("*******************************");

        // Delete Maaike
        employeeDb.deleteEmployee(maaike.getId());

        // Display all employees after deletion
        System.out.println("\nAll employees after deleting Maaike:");
        for (Employee emp : employeeDb.getAllEmployees()) {
            System.out.println(emp);
        }
    }
}
