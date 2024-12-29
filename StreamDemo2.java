//Fetch all the Employees name whose salary is greater then 50k

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
    Integer employeeId;
    String employeeName;
    Double employeeSalary;

    public Employee(Integer employeeId, String employeeName, Double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}

public class StreamDemo2 {
    public static void main(String[] ar){
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(111, "Scott", 75000D));
        list.add(new Employee(222, "John", 45000D));
        list.add(new Employee(333, "Martin", 55000D));
        list.add(new Employee(444, "Smith", 65000D));
        list.add(new Employee(555, "Virat", 95000D));

        list.stream()
                .filter(e -> e.employeeSalary > 50000)
                .forEach(System.out::println);

        list.stream()
                .filter(e -> e.employeeSalary > 50000)
                .forEach(emp -> System.out.println(emp.employeeName));
    }
}
