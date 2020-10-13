package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getMaxTemperature());
        assertEquals(0,conditioner.getMinTemperature());
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(0);
        long expected = 0;
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected,conditioner.getCurrentTemperature());
        System.out.println(expected);
    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        assertEquals(0,conditioner.getMaxTemperature());
        assertEquals(0,conditioner.getMinTemperature());
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(0);
        long expected = 0;
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
        System.out.println(expected);
    }
}