package ru.netology;

public class Radio {

    private static final int MAX_VOLUME = 100;
    private static final int MIN_VOLUME = 0;
    private static final int MIN_RADIO_STATION = 0;
    private int currentVolume;
    private int currentRadioStation;

    private final int numberOfRadioStations;

    public Radio() {
        this.numberOfRadioStations = 10;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = Math.max(numberOfRadioStations, 1);
    }

    // Getters
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    // Setters

    public void setCurrentVolume(int newVolume) {
        int current = Math.max(newVolume, MIN_VOLUME); // проверка, что число не меньше MIN_VOLUME
        currentVolume = Math.min(current, MAX_VOLUME); // проверка, что число не больше MAX_VOLUME
    }

    public void setCurrentRadioStation(int newStation) {
        if (newStation >= MIN_RADIO_STATION && newStation < numberOfRadioStations) { // сохраняем станции только если они от 0 до numberOfRadioStations (не включительно)
            currentRadioStation = newStation;
        }
    }

    // Methods
    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        setCurrentVolume(currentVolume - 1);
    }

    public void nextRadioStation() {
        // остаток от деления. Если достигли максимального значения, то остаток 0
        setCurrentRadioStation((currentRadioStation + 1) % numberOfRadioStations);
    }

    public void previousRadioStation() {
        setCurrentRadioStation((currentRadioStation - 1 + numberOfRadioStations) % numberOfRadioStations);
    }

}