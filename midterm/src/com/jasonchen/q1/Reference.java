package com.jasonchen.q1;

public class Reference extends Book{

    public static String category;

    public Reference(String title, double price, String publishYear,String category) {
        super(title, price, publishYear);
        this.category = category;
    }

    public static String getCategory() {
        return category;
    }

    public static void setCategory(String category) {
        Reference.category = category;
    }

    @Override
    public String description() {
        return getTitle() + " all information is real.";
    }
}
