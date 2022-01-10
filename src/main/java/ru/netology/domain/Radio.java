package ru.netology.domain;


public class Radio {
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentOfRadioStation = minRadioStation;

    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public int getCurrentOfRadioStation() {
        return currentOfRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int nextRadioStation() {
        if (currentOfRadioStation < maxRadioStation) {
            currentOfRadioStation = currentOfRadioStation + 1;
        } else {
            currentOfRadioStation = minRadioStation;
        }
        return currentOfRadioStation;
    }

    public int prevRadioStation() {
        if (currentOfRadioStation < 1) {
            currentOfRadioStation = maxRadioStation;
        } else {
            currentOfRadioStation = currentOfRadioStation - 1;
        }
        return currentOfRadioStation;
    }

    public void setNumberOfRadioStation(int currentOfRadioStations) {
        if (currentOfRadioStations > maxRadioStation) {
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
        return maxRadioStation;
    }
}