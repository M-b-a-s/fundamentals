package oop;

public class Book implements Product{
    private String name;
    private double price;
    private String color;
    private String author;
    private String publisher;
    private int pages;
    private int year;
    private String isbn;
    private String genre;
    private String description;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


}
