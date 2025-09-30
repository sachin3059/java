package org.example;

public class Counter {
    private int count = 0;

    // critical section
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}



// synchronization
