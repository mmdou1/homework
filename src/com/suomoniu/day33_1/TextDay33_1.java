package com.suomoniu.day33_1;

public class TextDay33_1 {
    public static void main(String[] args) {
        Ticket t = new Ticket(200);
        saleTicket a1 = new saleTicket(t);
        saleTicket a2 = new saleTicket(t);
        saleTicket a3 = new saleTicket(t);
        saleTicket a4 = new saleTicket(t);
        a1.setName("a1");
        a2.setName("a2");
        a3.setName("a3");
        a4.setName("a4");
        a1.start();
        a2.start();
        a3.start();
        a4.start();
    }
}
