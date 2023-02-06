package com.udemy.hashtable;

public class SimpleHashTable {
    private storedEmployee[] hashtable;
    public SimpleHashTable(){
        hashtable = new storedEmployee[5];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }else{
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(occupied(hashedKey)){
            System.out.println("Sorry, there's a already an employee at position " + hashedKey);
        }else{
            hashtable[hashedKey] = new storedEmployee(key, employee);
        }
    }
    public Employee get(String key){
        int hashKey = findKey(key);
        if(hashKey == -1){
            return null;
        }
        return hashtable[hashKey].employee;
    }

    public Employee remove(String key){
        int hashedKey = findKey(key);
        if(hashedKey  == -1){
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
//        hashtable[hashedKey] = null;
//        rehashing
        storedEmployee[] oldHashTable = hashtable;
        hashtable = new storedEmployee[oldHashTable.length];
        for(int i =0; i< oldHashTable.length; i++){
            if(oldHashTable[i] != null){
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }
    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        }
        else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

       if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
           return hashedKey;
       }else{
           return -1;
       }

    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            }
            else {
                System.out.println("Position " + i + ": " +hashtable[i].employee);
            }
        }
    }
}
