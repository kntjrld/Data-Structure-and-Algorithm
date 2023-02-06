package com.udemy.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {
    private LinkedList<storedEmployee>[] hashtable;

    public ChainedHashTable(){
        hashtable = new LinkedList[5];
        for(int i = 0; i < hashtable.length; i++){
            hashtable[i] = new LinkedList<storedEmployee>();
        }
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new storedEmployee(key, employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        ListIterator<storedEmployee> iterator = hashtable[hashedKey].listIterator();
        storedEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);
        ListIterator<storedEmployee> iterator = hashtable[hashedKey].listIterator();
        storedEmployee employee = null;
        while (iterator.hasNext()){
            employee = iterator.next();
            if(employee.key.equals(key)){
                break;
            }
        }
        if(employee == null){
            return null;
        }else {
            hashtable[hashedKey].remove(employee);
            return employee.employee;
        }
    }
    private int hashKey(String key){
        return  Math.abs(key.hashCode()) % hashtable.length;
    }

    public void printHashtable(){
        for (int i = 0; i<hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {

                System.out.println("Position " + i + ":  empty");
            } else {
                System.out.println("Position " + i + ":");
                ListIterator<storedEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()){
                    System.out.println(iterator.next().employee);
                    System.out.println("->");
                }
                System.out.println("null");
            }
        }
    }
}
