package org.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 1000;

    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);

        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawl");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()  + " completed withdrawl. remaining balance is " + balance);
                    } catch (Exception e){
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName());
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock , would try again later");
            }
        } catch (Exception e){
            Thread.currentThread().interrupt();
        }

        if(Thread.currentThread().isInterrupted()){
            System.out.println("-----------");
        }
    }
}
