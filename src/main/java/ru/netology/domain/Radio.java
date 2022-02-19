package ru.netology.domain;


public class Radio {
    private int countOfRadioStation = 10;
    private int maxRadioStation;
    private int minRadioStation;
    private int currentOfRadioStation;


    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
    }

    public Radio(int countOfRadioStation) {
        this.countOfRadioStation = countOfRadioStation;
    }

    public int getCurrentOfRadioStation() {
        return currentOfRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int nextRadioStation() {
        if (currentOfRadioStation < getMaxRadioStation()) {
            currentOfRadioStation = currentOfRadioStation + 1;
        } else {
            currentOfRadioStation = getMinRadioStation();
        }
        return currentOfRadioStation;
    }

    public int prevRadioStation() {
        if (currentOfRadioStation < 1) {
            currentOfRadioStation = getMaxRadioStation();
        } else {
            currentOfRadioStation = currentOfRadioStation - 1;
        }
        return currentOfRadioStation;
    }

    public void setNumberOfRadioStation(int currentOfRadioStations) {
        if (currentOfRadioStations > getMaxRadioStation()) {
            return;
        }
        if (currentOfRadioStations < minRadioStation) {
            return;
        }
        this.currentOfRadioStation = currentOfRadioStations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getMaxRadioStation() {
        return countOfRadioStation - 1;
    }
}