public class Radio {
    public Radio(int minRadioStation, int maxRadioStation) {
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this. currentRadioStation= minRadioStation;
    }

    public Radio(int size) {
        maxRadioStation = minRadioStation + size;
    }

    private int id;
    private String name = "noname";
    private int maxRadioStation = 10;//Макс радиостанция.
    private int maxVolume = 100;//Макс громкость.
    private int minRadioStation = 0;//Мин радиостанция.
    private int minVolume = 0;//Макс громкость.
    private int currentRadioStation = minRadioStation;//Текущая радиостанция.
    private int currentVolume = minVolume;//Текущая громкость.
    // private int currentVolume;
    // private int currentRadioStation;

    public int getMaxRadioStations() {//Макс радиостанция.
        return maxRadioStation;
    }

    public int getMaxVolume() {//Макс громкость.
        return maxVolume;
    }

    public int getMinRadioStation() {//Мин радиостанция.
        return minRadioStation;
    }

    public int getMinVolume() {//Макс громкость.
        return minVolume;
    }

    public int getCurrentVolume() {//Запрос данных.
        return currentVolume;
    }

    public int getCurrentRadioStation() {//Запрос данных.
        return currentRadioStation;
    }

    private boolean on;

    public void getSwitchingVolumePlus() {//Переключение громкости на одну единицу выше.
        int target = currentVolume + 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingVolumeMinus() {//Переключение громкости на одну единицу ниже.
        int target = currentVolume - 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingRadioStationsPlus() {//Переключение радиостанций на одну единицу выше.
        int target = currentRadioStation + 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingRadioStationsMinus() {//Переключение радиостанций на одну единицу ниже.
        int target = currentRadioStation - 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void setCurrentVolume(int newCurrentVolume) {//Изменение данных.
        if (newCurrentVolume < minVolume) {//Проверка, что громкость не меньше установленной, если меньше, то установка будет невозможной.
            return;
        }
        if (newCurrentVolume > maxVolume) {//Проверка, что громкость не больше установленной, если больше, то установка будет невозможной.
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {//Изменение данных.
        if (newCurrentRadioStation < minRadioStation) {//Проверка, что радиостанция не меньше установленной, если меньше, то установка будет невозможной.
            newCurrentRadioStation = maxRadioStation;
        }
        if (newCurrentRadioStation > maxRadioStation) {//Проверка, что радиостанция не больше установленной, если больше, то установка будет невозможной.
            newCurrentRadioStation = minRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {//Максимальный номер радиостанции.
        currentRadioStation = maxRadioStation;
    }

    public void setToMaxVolume() {//Максимальная громкость.
        currentVolume = maxVolume;
    }

}