package com.udemy.stacks;

public class Main {
    public static void main(String[] args) {

        Employee jj = new Employee("Jane", "Jones", 332);
        Employee kk = new Employee("kk", "kk", 332);
        Employee mm = new Employee("mm", "mm", 332);
        Employee nn = new Employee("nn", "nn", 332);

        ArrayStack stack = new ArrayStack(4);

        stack.push(jj);
        stack.push(kk);
        stack.push(nn);
        stack.push(mm);
        stack.printStack();





    }
}
