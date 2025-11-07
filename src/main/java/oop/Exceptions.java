package oop;

import java.io.File;

public class Exceptions {
    public static void main(String[] args) {
        createNewFile();
    }

    public static void createNewFile() {
        File file = new File("resources/file.txt");
        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("File does not exist");
            e.printStackTrace();
        }
    }
}
