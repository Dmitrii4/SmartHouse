package ru.netology;

public class Conditioner {
    public long maxTemperature;
    public long minTemperature;
    public long currentTemperature;


    public void setMaxTemperature(long maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public void setMinTemperature(long minTemperature) {
        this.minTemperature = minTemperature;
    }

    public long getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(long currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        currentTemperature--;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature > maxTemperature) {
            return;
        }
        currentTemperature++;
    }
}
