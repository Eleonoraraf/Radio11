package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldUseRadio() {
        radio.setCurrentChanel(4);
        assertEquals(4, radio.getNumberOfChanel());
    }

    @Test
    public void shouldUseRadio2() {
        radio.setCurrentChanel(10);
        assertEquals(0, radio.getNumberOfChanel());
    }

    @Test
    public void testVolume() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxVolume() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setToMinVolume() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        radio.setCurrentVolume(35);
        radio.increaseVolume();
        int expected = 36;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume() {
        radio.setCurrentVolume(2);
        radio.lowerVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void lowerVolume2() {
        radio.setCurrentVolume(0);
        radio.lowerVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel() {
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel2() {
        radio.setCurrentChanel(10);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel3() {
        radio.setCurrentChanel(8);
        int expected = 8;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void testChanel4() {
        radio.setCurrentChanel(-1);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }

    @Test
    public void setToMaxChanel() {
        radio.setCurrentChanel(9);
        int expected = 9;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }



    @Test
    public void setToMinChanel() {
        radio.setCurrentChanel(0);
        int expected = 0;
        int actual = radio.getCurrentChanel();
        assertEquals(expected, actual);
    }
}