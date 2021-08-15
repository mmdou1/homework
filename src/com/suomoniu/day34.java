package com.suomoniu;

import java.util.LinkedList;
import java.util.List;

public class day34 {
    public static void main(String[] args) {
        Num  num = new Num(1);
        Thread t1 = new Thread(new jiShu(num));
        Thread t2 = new Thread(new oShu(num));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
class jiShu implements Runnable{
    private Num num;

    public jiShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if(num.i%2==0){
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000*5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"->"+num.i);
                num.i++;
                num.notifyAll();
            }
        }

    }
}
class oShu implements Runnable{
    Num  num;

    public oShu(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while(true){
            synchronized (num){
                if(num.i%2!=0){
                try {
                    num.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                try {
                    Thread.sleep(1000*5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"->"+num.i);
                num.i++;
                num.notifyAll();
            }
        }
    }
}
class Num {
    int i;

    public Num(int i) {
        this.i = i;
    }
}