package oop;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        /***************
         * LIVING ROOM
         * **************/
         
        // Create an instance of the rectangle class
        Rectangle livingRoom = new Rectangle();

        livingRoom.setLength(25);
        livingRoom.setWidth(20);

        double areaOfLivingRoom = livingRoom.calculateArea();
        System.out.println("Area of Living Room: " + areaOfLivingRoom + " sq ft");

        /***************
         * BEDROOM
         * **************/
        Rectangle bedroom = new Rectangle(15, 15);
        double areaOfBedroom = bedroom.calculateArea();
        System.out.println("Area of Bedroom: " + areaOfBedroom + " sq ft");

    }
}
