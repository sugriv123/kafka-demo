package com.kafka.kafka;

import java.util.Objects;

public class DemoClass {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "ABC", 1000);
        Employee e2 = new Employee(1, "ABC", 1000);
        if (e1.equals(e2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}

