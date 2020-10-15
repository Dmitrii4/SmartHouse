package ru.netology;

public class Conditioner {
    public long maxTemperature;
    public long minTemperature;
    public long currentTemperature;

    public long getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(long maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public long getMinTemperature() {
        return minTemperature;
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
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature--;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }
        if (currentTemperature >= maxTemperature) {
            return;
        }
        currentTemperature++;
    }
}
