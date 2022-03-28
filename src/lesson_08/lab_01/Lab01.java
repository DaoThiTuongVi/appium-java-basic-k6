package lesson_08.lab_01;

import lesson_08.lab_01.ContractEmployee;
import lesson_08.lab_01.Employee;
import lesson_08.lab_01.FullTimeEmployee;

import java.util.ArrayList;
import java.util.List;

public class Lab01 {
    /*
    Create a class Employee with a method salary to return employee’s salar
There are 2 types of employee: Full time employee and contract employee
Full time employee has salary is 50000 and contract employee has salary 40000
Write a method to accept a list of Employee and calculate total salary
For example, company has 3 FTE and 2 contractor
     */
    public static void main(String[] args) {
        Employee employee1 = new FullTimeEmployee();
        Employee employee2 = new FullTimeEmployee();
        Employee employee3 = new FullTimeEmployee();
        Employee employee4 = new ContractEmployee();
        Employee employee5 = new ContractEmployee();

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        System.out.println(calculateTotalSalary(employeeList));
    }

    public static int calculateTotalSalary(List<Employee> employeeList){
        int totalSalary = 0;

        for (Employee employee: employeeList){
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}
