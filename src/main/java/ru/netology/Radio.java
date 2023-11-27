package ru.netology;

public class Radio {
    private int numberOfRadioStations = 10;
    private int currentRadioStation = 0;  // 0, 1, 2, 3, ..., numberOfRadioStations-1

    private int volume = 0;

    public Radio() {
    }

    public Radio(int n) {
        if (n <= 0) {
            numberOfRadioStations = 10;
        } else {
            numberOfRadioStations = n;
        }
    }

    public void next() {
        currentRadioStation = (currentRadioStation + 1) % numberOfRadioStations;
    }

    public void prev() {
        currentRadioStation = (currentRadioStation - 1 + numberOfRadioStations)
                % numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setCurrentRadioStation(int n) {
        if (n >= numberOfRadioStations)
            currentRadioStation = numberOfRadioStations - 1;
        else if (n < 0)
            currentRadioStation = 0;
        else
            currentRadioStation = n;
    }

    public void increaseVolume() {
        if (volume < 100)
            ++volume;
    }

    public void decreaseVolume() {
        if (volume > 0)
            --volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int n) {
        if (n >= 100)
            volume = 100;
        else if (n < 0)
            volume = 0;
        else
            volume = n;
    }
}