package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(21);
        long expected = 20;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(19);
        long expected = 20;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void decreaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(25);
        long expected = 24;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
    @Test
    void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(25);
        long expected = 25;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
    @Test
    void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(16);
        long expected = 16;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
    @Test
    void increaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(16);
        long expected = 17;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
}