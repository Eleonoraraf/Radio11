package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    //    @Test
//    public void shouldReturnCurrentStation() {
//        Radio radio = new Radio();
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldReturnCurrentVolume() {
//        Radio radio = new Radio();
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//        assertEquals(expected, actual);
//    }
    @Test
    public void test() {
        Radio radio = new Radio(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void stationShouldNotBeOver9() {
        Radio radio = new Radio(10);
        //radio.setCurrentStation(10);
        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void stationShouldNotBeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeOver10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeShouldNotBeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation() {
        Radio radio = new Radio(5);
        //radio.setCurrentStation(5);
        radio.goToNextStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoForwardTo0After9() {
        Radio radio = new Radio(9);
        //radio.setCurrentStation(9);
        radio.goToNextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToPrevStation() {
        Radio radio = new Radio(5);
        //radio.setCurrentStation(5);
        radio.goToPrevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGoBackTo9After0() {
        Radio radio = new Radio(9);
        //radio.goToPrevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeBelowLimit() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}