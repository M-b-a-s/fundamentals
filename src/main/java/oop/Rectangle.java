package oop;

public class Rectangle {
    double length;
    double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getters and setters
    double getLength() {
        return length;
    }
    // the 'this' keyword refers to the current object
    // it is used to distinguish between instance variables and parameters with the same name
    // in this case, it distinguishes between the instance variable 'length' and the parameter 'length'
    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);

    }

    double calculateArea() {
        return length * width;
    }

}
