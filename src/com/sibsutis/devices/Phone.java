package com.sibsutis.devices;
public class Phone {
	private Device device;


	public Phone(int id, int price) {
		this.device = new ConcreteDevice(id, price);
	}


	public Phone(int id, int price, String ip) {
        	this.device = new ConcreteDevice(id, price, ip);
	}


	public String getDeviceType() {
		return "Phone";
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Phone)) return false;
		Phone other = (Phone) obj;
		return this.device.equals(other.device);
	}


	public int hashCode() {
		return device.hashCode();
	}
}
