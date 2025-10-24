package oop;

import java.util.Scanner;

/** Classes can be seen as blueprints for creating objects
 * They are used to create objects that have similar properties and behaviors.
 * OOP allows you to create objects that are similar to each other and can be used in different parts of your program.
 * Classes can contain fields (variables) and methods (functions) that define the properties and behaviors of the objects created from the class.
 * Classes can also have constructors, which are special methods used to initialize objects when they are created.
 * Classes can also support inheritance, allowing new classes to inherit properties and behaviors from existing classes.
 * This promotes code reusability and helps in creating a hierarchical relationship between classes.
 * Classes can also support polymorphism, allowing objects of different classes to be treated as objects of a common superclass.
 * This allows for flexibility and the ability to use different implementations of a method based on the object type at runtime.
 * Overall, classes are a fundamental concept in OOP that help in organizing and structuring code in a way that is modular, reusable, and easier to maintain.
 * 
 */
public class Classes {
    public static void main(String[] args) {

        Classes calculator = new Classes();
        // Create instances of the Rectangle class
        Rectangle bedroom = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
    }

    // Static is used when you want to access a method or variable without creating an instance of the class
    public Rectangle getRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width of your room: ");
        double width = scanner.nextDouble();
        scanner.close();

        return new Rectangle(length, width);
        
    }
}