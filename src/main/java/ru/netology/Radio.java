package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberStation = 10;

    public Radio() {
    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation < 0) {
            return;
        }
        this.numberStation = numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > numberStation - 1) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {
        if (currentStation < numberStation - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = numberStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}