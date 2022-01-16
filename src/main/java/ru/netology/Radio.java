package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




public class Radio {


    private int minChannel = 0;
    private int maxChannel = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    private int currentChannel;

    public Radio() {
    }

    public Radio(int maxChannel, int currentChannel) {
        this.maxChannel = maxChannel;
        this.currentChannel = currentChannel;
    }

    //public Radio(int minChannel, int maxChannel, int minVolume, int maxVolume, int currentVolume, int currentChannel) {
    //this.minChannel = minChannel;
    //this.maxChannel = maxChannel;
    //this.minVolume = minVolume;
    //this.maxVolume = maxVolume;
    //this.currentVolume = currentVolume;
    //this.currentChannel = currentChannel;


    public int getCurrentChannel() {
        return currentChannel;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            this.currentChannel = maxChannel;
            return;
        }

        if (currentChannel < minChannel) {
            this.currentChannel = minChannel;
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel < 9) {
            this.currentChannel = currentChannel + 1;
            return;
        }

        this.currentChannel = minChannel;
        return;

    }

    public void prevChannel() {
        if (currentChannel > 0) {
            this.currentChannel = currentChannel - 1;
            return;
        }

        this.currentChannel = maxChannel;
        return;

    }


    //private int currentVolume;
    //private int minVolume = 0;
    //private int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        this.currentVolume = currentVolume;

        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
        return;
    }
}
