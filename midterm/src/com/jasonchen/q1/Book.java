package com.jasonchen.q1;

public abstract class Book {
    private static String title;
    private static double price;
    private static String publishYear;

    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear= publishYear;
    }

    public abstract String description();

    public static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        Book.title = title;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        Book.price = price;
    }

    public static String getPublishYear() {
        return publishYear;
    }

    public static void setPublishYear(String publishYear) {
        Book.publishYear = publishYear;
    }
}
