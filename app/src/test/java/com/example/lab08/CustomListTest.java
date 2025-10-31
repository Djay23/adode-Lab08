package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList cityList = new CustomList();
        City city = new City("Edmonton", "Alberta");
        cityList.addCity(city);
        assertTrue(cityList.hasCity(city));

        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }
    @Test
    public void testCountCities() {
        CityList cityList = new CityList();
        City city1 = new City("Edmonton", "Alberta");
        City city2 = new City("Calgary", "Alberta");
        cityList.add(city1);
        cityList.add(city2);

        assertEquals(2, cityList.countCities());
    }
}
