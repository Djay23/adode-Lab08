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
        CityList cityList = new CityList();
        City city = new City("Edmonton", "Alberta");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));

        cityList.deleteCity(city);
        assertFalse(cityList.hasCity(city));
    }
}
