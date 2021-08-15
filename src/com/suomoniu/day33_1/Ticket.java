package com.suomoniu.day33_1;

public class Ticket {
    private int ticketNumber;

    public Ticket() {
    }

    public Ticket(int ticket) {
        this.ticketNumber = ticket;
    }

    public int getTicket() {
        return ticketNumber;
    }

    public void setTicket(int ticket) {
        this.ticketNumber = ticket;
    }
    public synchronized void sale(int buy) throws saleException {
        if(this.getTicket()>0){
        int before = this.getTicket();
        int left = before-buy;
        this.setTicket(left);
        System.out.println(Thread.currentThread().getName()+"成功购买"+buy+"张票"+"目前还剩下"+this.getTicket()+"票");
        }
        else {
            saleException s = new saleException("票已经卖完");
            throw s;
        }
    }
}
