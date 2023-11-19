package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    void shouldCreateRadioWithDefaultStations() {
        Radio radio = new Radio();
        assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    void shouldCreateRadioWithSpecificOfStations() {
        Radio radio = new Radio(15);
        assertEquals(15, radio.getNumberOfRadioStations());
    }

    @Test
    void shouldNotAllowZeroStation() {
        Radio radio = new Radio(0);
        assertEquals(1, radio.getNumberOfRadioStations());
    }

    @Test
    void shouldWrapAroundToFirstStationFromLast() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldWrapAroundToLastStationFromFirst() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.previousRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotSetStationBeyondRange() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(15);

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotIncreaseVolumeBeyondMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBeyondMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    void shouldDecreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        assertEquals(49, radio.getCurrentVolume());
    }


}