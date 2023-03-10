package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cities = new ArrayList<>();

    @Test
    public void testAddCity(){
        CustomList list = new CustomList(null, cities);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(1, list.getCount());

    }

    @Test
    public void testHasCity(){
        CustomList list = new CustomList(null, cities);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void testdeletecity(){
        CustomList list = new CustomList(null, cities);
        City city = new City("Edmonton", "Alberta");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }



}
