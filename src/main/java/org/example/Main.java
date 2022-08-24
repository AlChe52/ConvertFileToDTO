package org.example;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {

   ReadData readData = new ReadData();
   SaveData saveData = new SaveData();

        try {
            readData.readFromFile(new File("src/main/resources/guide.csv"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(saveData.getCityList());
    }
}