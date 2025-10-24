package oop;

public class Rectangle {
    // Encapsulation: using private access modifier to restrict direct access to fields
    // and using getters and setters to provide controlled access to fields

    // Fields
    private double length;
    private double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // create constructor with no parameters
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    // getters and setters
    public double getLength() {
        return length;
    }
    // the 'this' keyword refers to the current object
    // it is used to distinguish between instance variables and parameters with the same name
    // in this case, it distinguishes between the instance variable 'length' and the parameter 'length'
    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);

    }

    public double calculateArea() {
        return length * width;
    }

}
