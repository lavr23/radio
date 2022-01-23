package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();
        radio.setNumberStation(9);
        int expected = 9;
        int actual = radio.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStationUnderMin() {
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        int expected = 10;
        int actual = radio.getNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        assertEquals(9,radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-12);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-11);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation0() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.decreaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent0() {
        Radio radio = new Radio();
        radio.decreaseStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNumberStation15() {
        Radio radio = new Radio(15);
        radio.setNumberStation(9);

        assertEquals(9, radio.getNumberStation());
    }

    @Test
    public void shouldSetStation15() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(9);

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation15() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(4);

        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationOverMax15() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(15);

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation15() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(8);
        radio.increaseStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldIncreaseStation015() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStation15() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(1);
        radio.decreaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldDecreaseStationWhenCurrent015() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.decreaseStation();

        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    public void shouldNotSetVolumeUnderMinimum15() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(-11);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotSetVolumeOverMaximum15() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(101);

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume15() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotIncreaseVolume15() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume15() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldNotDecreaseVolume015() {
        Radio radio = new Radio(15);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }
}
