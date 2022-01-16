package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void setCurrentChannel(){
        Radio radio = new Radio(9,1);
        //Radio.setCurrentChannel(1);
        //int expected = 1;
        //int actual = Radio.getCurrentChannel();
        assertEquals(1, radio.getCurrentChannel());
    }


    @Test
    public void setCurrentChannel0(){
        Radio radio = new Radio(9,0);
        //Radio.setCurrentChannel(0);
        //int expected = 0;
        //int actual = Radio.getCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetDesiredChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        assertEquals(5, radio.getCurrentChannel());
    }


    @Test
    public void setCurrentChannel9(){
        Radio radio = new Radio(9, 9);
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannelBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        //Radio.setCurrentChannel(-1);
        //int expected = 0;
        //int actual = Radio.getCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentChannelOverMax(){
        Radio radio = new Radio();
        radio.setCurrentChannel(70);
        //Radio.setCurrentChannel(70);
        //int expected = 9;
        //int actual = Radio.getCurrentChannel();
        assertEquals(9,radio.getCurrentChannel());
    }

    @Test
    public void setNextChannel(){
        Radio radio = new Radio(9, 5);
        radio.nextChannel();
        //Radio.setCurrentChannel(5);
        //Radio.nextChannel();
        //int expected = 6;
        //int actual = radio.getCurrentChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void setNextChannel0(){
        Radio radio = new Radio(9,9);
        radio.nextChannel();
        //Radio.setCurrentChannel(9);
        //Radio.nextChannel();
        //int expected = 0;
        //int actual = radio.getCurrentChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void setPrevChannel(){
        Radio radio = new Radio(9,5);
        //Radio.setCurrentChannel(5);
        radio.prevChannel();
        //int actual = radio.getCurrentChannel();
        //int expected = 4;
        assertEquals(4, radio.getCurrentChannel());
    }
    @Test
    public void setPrevChannel9(){
        Radio radio = new Radio(9,0);
        //radio.setCurrentChannel(0);
        radio.prevChannel();
        //int actual = radio.getCurrentChannel();
        //int expected = 9;
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void setCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        //int expected = 7;
        //int actual = Radio.getCurrentVolume();
        assertEquals(7, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-7);
        //int expected = 0;
        //int actual = Radio.getCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOverMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(170);
        //int expected = 10;
        //int actual = Radio.getCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        //int expected = 1;
        //int actual = Radio.getCurrentVolume();
        assertEquals(1,radio.getCurrentVolume());
    }
    @Test
    public void increaseCurrentVolumeOverMax(){
        Radio radio = new Radio();
        radio.setCurrentVolume(350);
        radio.increaseVolume();
        //int expected = 10;
        //int actual = Radio.getCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        //int expected = 9;
        //int actual = Radio.getCurrentVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
    @Test
    public void decreaseCurrentVolumeBelowMin(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        radio.decreaseVolume();
        //int expected = 0;
        //int actual = radio.getCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
