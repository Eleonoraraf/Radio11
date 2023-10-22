package ru.netology;


public class Radio {
    private int maxChanel = 9;
    private int minChanel = 0;
    private int currentChanel;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int maxChanel, int minChanel, int currentChanel, int currentVolume, int maxVolume, int minVolume) {
        this.maxChanel = maxChanel;
        this.minChanel = minChanel;
        this.currentChanel = currentChanel;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }


    public Radio() {
    }

    public int getNumberOfChanel(){
        return currentChanel;
    }


    public int getMaxChanel() {
        return maxChanel;
    }

    public void setMaxChanel(int maxChanel) {
        currentChanel = maxChanel;
    }

    public int getMinChanel() {
        return minChanel;
    }

    public void setMinChanel(int minChanel) {
        currentChanel = minChanel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel > maxChanel) {
            return;
        }
        if (currentChanel < minChanel) {
            return;
        }
        this.currentChanel = currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
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

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
    }

    public void nextChanel() {
        if (currentChanel >= 9) {
            setCurrentChanel(minChanel);
        }
        else {
            setCurrentChanel(currentChanel + 1);
        }
    }



    public void prevChanel() {
        if (currentChanel <= minChanel) {
            setCurrentChanel(maxChanel);
        }
        else {
            setCurrentChanel(currentChanel - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }
}