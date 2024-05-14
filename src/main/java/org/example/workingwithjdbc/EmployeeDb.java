package org.example.workingwithjdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDb {

    String url = "jdbc:postgresql://localhost:5432/postgres";
    public void addEmployee(Employee employee) {
        String SQL = "INSERT INTO employees(name, email, department) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getEmail());
            pstmt.setString(3, employee.getDepartment());
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("An employee was added successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String SQL = "SELECT * FROM employees";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("department")
                );
                employees.add(emp);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return employees;
    }


    public void updateEmployee(Employee employee) {
        String SQL = "UPDATE employees SET name = ?, email = ?, department = ? WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, employee.getName());
            pstmt.setString(2, employee.getEmail());
            pstmt.setString(3, employee.getDepartment());
            pstmt.setInt(4, employee.getId());
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("An employee was updated successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void deleteEmployee(int id) {
        String SQL = "DELETE FROM employees WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("An employee was deleted successfully!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
