import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// Employee.java
public class Employee {
    // Fields
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    // Display method
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }


    // Main class
    public static void main(String[] args) {
        // Creating multiple objects of Employee class
        Employee emp1 = new Employee(1, "Alice", 50000);
        Employee emp2 = new Employee(2, "Bob", 60000);
        Employee emp3 = new Employee(3, "Charlie", 70000);

        // Displaying information of each employee
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();

        ArrayList<Employee> list = new ArrayList<>();


        list.add(emp1);
        list.add(emp2);
        list.add(emp3);


        System.out.println("array list :----- " +list);
        List<String> getNameStartBEmployee = list.stream().map(Employee::getName)
                .filter(x -> {
                    return x.startsWith("B");
                })
                .collect(Collectors.toList());
        System.out.println("getNameStartBEmployee : : "+getNameStartBEmployee);


        // highest Salary
        Employee employee = list.stream().max((e1, e2) -> Double.compare(e1.salary, e2.salary)).get();
        System.out.println(employee);
        Employee employee1 = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(employee1);

        Employee employee2 = list.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.println(employee2);
        // list.stream().filter().collect();



    }
}
