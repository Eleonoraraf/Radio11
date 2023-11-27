package ru.netology;

import org.junit.jupiter.api.Assertions;
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
        assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    void shouldWrapAroundToFirstStationFromLast() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(9);
        radio.next();

        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    void shouldWrapAroundToLastStationFromFirst() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(0);
        radio.prev();

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotSetStationBeyondRange() {
        Radio radio = new Radio(10);
        radio.setCurrentRadioStation(15);

        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotIncreaseVolumeBeyondMax() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();

        assertEquals(51, radio.getVolume());
    }

    @Test
    void shouldNotDecreaseVolumeBeyondMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getVolume());
    }


    @Test
    void shouldDecreaseVolumeWithinRange() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.decreaseVolume();

        assertEquals(49, radio.getVolume());
    }
}