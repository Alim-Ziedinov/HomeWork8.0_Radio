package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldTestMaxNextRadioStation() {
        radio.setNumberOfRadioStation(9);
        int expected = radio.getMinRadioStation();
        radio.nextRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestMinNextRadioStation() {
        radio.setNumberOfRadioStation(2);
        int expected = radio.getCurrentOfRadioStation() + 1;
        radio.nextRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestPrevMinRadioStation() {
        radio.setNumberOfRadioStation(0);
        int expected = radio.getMaxRadioStation();
        radio.prevRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldTestPrevMaxRadioStation() {
        radio.setNumberOfRadioStation(9);
        int expected = radio.getCurrentOfRadioStation() - 1;
        radio.prevRadioStation();
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldAddValidMinimumNumberOfStation() {
        int stationNumber = 0;
        radio.setNumberOfRadioStation(stationNumber);
        int expected = stationNumber;
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldAddUnderMinNumberOfStation() {
        int stationNumber = -1;
        radio.setNumberOfRadioStation(stationNumber);
        int expected = 0;
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldAddUpperMaxNumberOfStation() {
        int stationNumber = 10;
        radio.setNumberOfRadioStation(stationNumber);
        int expected = 0;
        int actual = radio.getCurrentOfRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUpperMaxVolume() {
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetUnderMinVolume() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldMaxReduceVolume() {
        radio.setCurrentVolume(10);
        int expected = radio.getCurrentVolume() - 1;
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinReduceVolume() {
        radio.setCurrentVolume(0);
        int expected = radio.getMinVolume();
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseMinVolume() {
        radio.setCurrentVolume(0);
        int expected = radio.getCurrentVolume() + 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseMaxVolume() {
        int volumeLevel = 10;
        radio.setCurrentVolume(volumeLevel);
        int expected = radio.getMaxVolume();
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}