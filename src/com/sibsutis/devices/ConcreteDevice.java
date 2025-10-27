package com.sibsutis.devices;

public class ConcreteDevice extends Device {
	public ConcreteDevice(int id, int price) {
		super(id, price, "");
	}

	public ConcreteDevice(int id, int price, String ip) {
		super(id, price, ip);
	}

	public String getDeviceInfo() {
		return "Device ID: " + getId() + ", Price: " + getPrice() + ", IP: " + getIp();
	}

	public String getDeviceType() {
		return "ConcreteDevice";
	}
}
