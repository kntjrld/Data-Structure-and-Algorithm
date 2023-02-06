package com.udemy.stacks.queus;

public class Main {
    public static void main(String[] args) {
        Employee xyz = new Employee("xxx", "yyy", 202);
        Employee abc = new Employee("abc", "abc", 203);
        Employee def = new Employee("def", "def", 204);
        Employee mno = new Employee("mno", "mno", 205);

        ArrayQueue arrayQueue = new ArrayQueue(4);
        arrayQueue.add(xyz);
        arrayQueue.add(abc);
        arrayQueue.add(def);
        arrayQueue.add(mno);

        arrayQueue.printQueue();
    }
}
