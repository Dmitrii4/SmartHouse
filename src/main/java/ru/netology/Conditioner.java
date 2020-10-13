package ru.netology;

public class Conditioner {
    private long maxTemperature;
    private long minTemperature;
    private long currentTemperature;

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
        if (currentTemperature>maxTemperature)
            return;
        if (currentTemperature<minTemperature)
            return;
        this.currentTemperature=currentTemperature;
    }

    void decreaseCurrentTemperature() {
        if (currentTemperature<=minTemperature)
            return;
        if (currentTemperature>=maxTemperature)
            return;
        --currentTemperature;
    }

    void increaseCurrentTemperature() {
        if (currentTemperature<=minTemperature)
            return;
        if (currentTemperature>=maxTemperature)
            return;
        ++currentTemperature;
    }
}
