package org.example;

import java.util.Date;

public class City {
    String name;
    String region;
    String district;
    Integer population;
   String foudation;

    public City(String name, String region, String district, Integer population, String foudation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foudation = foudation;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getFoudation() {
        return foudation;
    }

    public void setFoudation(String foudation) {
        this.foudation = foudation;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foudation=" + foudation +
                '}';
    }
}
