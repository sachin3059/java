package org.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer method");
            innerMetod();
        } finally {
            lock.unlock();
        }
    }

    public  void innerMetod(){
        lock.lock();
        try{
            System.out.println("Inner method");
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args){
        ReenterantExample example = new ReenterantExample();
        example.outerMethod();
    }

}
