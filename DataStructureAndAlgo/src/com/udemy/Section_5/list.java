package com.udemy.Section_5;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
       /* ArrayList<String> str = new ArrayList<String>(); */
       /* ArrayList<Integer> integer = new ArrayList<Integer>(); */

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Kent", "Jarold", 22));
        employeeList.add(new Employee("Jarold", "Ken", 23));
        employeeList.add(new Employee("Test", "Emp", 24));

//       /*employeeList.forEach(System.out::println);*/ print list
//       /*employeeList.remove(2);*/ remove employee'

        System.out.println(employeeList.contains(new Employee("Kent", "Jarold", 22)));



    }
}
