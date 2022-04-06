package lesson_10;

import java.util.ArrayList;
import java.util.List;

public class CalculateSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new ContractEmployee());

        int totalSalary = calculateSalary(employeeList);

        System.out.println("Total salary: "+ totalSalary);
    }

    public static int calculateSalary(List<Employee> employeeList){
        int total = 0;

        for (Employee employee: employeeList){
            total += employee.getSalary();
        }

        return total;
    }
}
