package com.udemy.Section_5;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist<C> {
    public static void main(String[] args) {
        Employee kj = new Employee("Kent", "Jarold", 22);
        Employee jk = new Employee("Jarold", "Ken", 23);
        Employee te = new Employee("Test", "Emp", 24);

        LinkedList<Employee> list = new LinkedList<>();
        list.add(kj);
        list.add(jk);
        list.add(te);

        Iterator iterator = list.iterator();
        System.out.println("HEAD");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("<=>");
        }
        System.out.println("TAIL");
        System.out.println("null");



    }
}
