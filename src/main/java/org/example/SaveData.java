package org.example;

import java.util.ArrayList;
import java.util.List;

public class SaveData {

    static List<City> cityList = new ArrayList<>();

    public void saveData (City city) {
         cityList.add(city);

    }

    public List<City> getCityList() {
        return cityList;
    }
}
