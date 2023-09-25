public class Radio {

    private int getCurrentVolume;//Текущая громкость.

    private int getCurrentRadioStation;//Текущая радиостанция.


    public int getCurrentVolume() {//Запрос данных.
        return getCurrentVolume;
    }

    public int getCurrentRadioStation() {//Запрос данных.
        return getCurrentRadioStation;
    }

    public void getSwitchingVolumePlus() {//Переключение громкости на одну единицу выше.
        int target = getCurrentVolume + 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingVolumeMinus() {//Переключение громкости на одну единицу ниже.
        int target = getCurrentVolume - 1;
        setCurrentVolume(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingRadioStationsPlus() {//Переключение радиостанций на одну единицу выше.
        int target = getCurrentRadioStation + 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void getSwitchingRadioStationsMinus() {//Переключение радиостанций на одну единицу ниже.
        int target = getCurrentRadioStation - 1;
        setCurrentRadioStation(target);//Применение метода сравнения с установленными ограничителями.
    }

    public void setCurrentVolume(int newCurrentVolume) {//Изменение данных.
        if (newCurrentVolume < 0) {//Проверка, что громкость не меньше установленной, если меньше, то установка будет невозможной.
            return;
        }
        if (newCurrentVolume > 100) {//Проверка, что громкость не больше установленной, если больше, то установка будет невозможной.
            return;
        }
        getCurrentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {//Изменение данных.
        if (newCurrentRadioStation < 0) {//Проверка, что радиостанция не меньше установленной, если меньше, то установка будет невозможной.
            newCurrentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {//Проверка, что радиостанция не больше установленной, если больше, то установка будет невозможной.
            newCurrentRadioStation = 0;
        }
        getCurrentRadioStation = newCurrentRadioStation;
    }

    public void setToMaxRadioStation() {//Максимальный номер радиостанции.
        getCurrentRadioStation = 9;
    }

    public void setToMaxVolume() {//Максимальная громкость.
        getCurrentVolume = 100;
    }

}
