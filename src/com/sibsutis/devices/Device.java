package com.sibsutis.devices;

public abstract class Device {
    protected String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
