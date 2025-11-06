package oop;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter() {
        // length is a private field in Rectangle, use the public getter instead
        return 4 * getLength();
    }

}
