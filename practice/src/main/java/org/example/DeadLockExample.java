package org.example;

class Pen{
    public synchronized  void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying for paper");
        paper.finishWrithing();
    }


    public synchronized  void finishWrithing(){
        System.out.println(Thread.currentThread().getName() + " finished using pen" + this);
    }
}

class Paper {
    public synchronized  void writeWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying for pen");
        pen.finishWrithing();
    }

    public synchronized void finishWrithing(){
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}


class Task1 implements  Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run(){
        synchronized (pen){
            paper.writeWithPaperAndPen(pen); // thread paper asking for pen
        }

    }
}
class Task2 implements  Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run(){
        synchronized (paper){
            pen.writeWithPenAndPaper(paper); // thread pen asking for paper
        }

    }
}


public class DeadLockExample {
    public static void main(String[] args){
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "t1");
        Thread t2 = new Thread(new Task2(pen, paper), "t2");

        t1.start();
        t2.start();
    }
}


// dead lock
