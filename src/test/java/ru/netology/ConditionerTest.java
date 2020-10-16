package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(18);
        long expected = 17;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(17);
        long expected = 18;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void decreaseCurrentTemperatureWithMax() {
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
    void increaseCurrentTemperatureWithMin() {
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