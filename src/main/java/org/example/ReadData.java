package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public void readFromFile (File file) throws FileNotFoundException {
        SaveData saveData = new SaveData();

        Scanner scanFromFile = new Scanner(file);

        while (scanFromFile.hasNext()) {

            String s1 =scanFromFile.nextLine();

            String[] separatedString=s1.split(";");

            City city = new City();
            city.setName(separatedString[1]);
            city.setRegion(separatedString[2]);
            city.setDistrict(separatedString[3]);
            city.setPopulation(Integer.parseInt(separatedString[4]));

            if (separatedString.length == 6) {
                city.setFoudation(separatedString[5]);
            } else {
                city.setFoudation("");
            }
              saveData.saveData(city);
        }
    }



}
