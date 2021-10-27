package com.jasonchen.q1;

public class Fiction extends Book implements iBorrowable{
    public static int borrowDay;
    public static int returnDay;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return getTitle() + " all events are imaginary and not based on real facts.";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDay = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDay = day;
    }

    @Override
    public boolean isAvailable(int day) {
        return ( borrowDay <= day && day <= returnDay) ? false: true;
    }
}
