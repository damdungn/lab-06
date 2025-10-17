package com.example.listycity;
import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * This returns the city name
     * @return
     *      Return the string of city name
     */
    public String getCityName() {
        return this.city;
    }
    /**
     * This returns the province name
     * @return
     *      Return the string of province name
     */
    public String getProvinceName() {
        return this.province;
    }
    /** This returns an integer value of comparing result between o and its city name
     * @param o
     * This is a candidate to be compared with
     * @return
     *  return a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the given city
    */
     @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /** This returns the boolean value if o equals to its city and province
     * @param o
     * This is a candidate to be compared with
     * @return
     *  return True if two objects are equal else False
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City ob = (City) o;
        return (city.equals(ob.city)) && (province.equals(ob.province));
    }
    /**
     * This returns a hash code for this object computed from its city and province.
     * @return
     * an int hash code based on {@code city} and {@code province}
     */
    @Override
    public int hashCode() {
        return Objects.hash(city,province);
    }
}