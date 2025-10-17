package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This returns Boolean value if the city is in the list
     * @param city
     * This is a candidate city to check its existence in the list
     * @return
     *      Boolean value if the city is in the list
     */
    public Boolean hasCity(City city) {

        return cities.contains(city);
    }
    /**
     * This method delete the given city in the list else throw an exception
     * @param city
     * This is a candidate city to be removed if it is in the list
     */
    public void delete(City city) {
        if (hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }
    /**
     * This returns the number of cities in the list
     * @return
     *      Return the integer of the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}

