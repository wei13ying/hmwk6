package com.sibsutis.devices;
public class PersonalComputer {
	private Device device;

	public PersonalComputer(int id, int price) {
		this.device = new ConcreteDevice(id, price);
	}

	public PersonalComputer(int id, int price, String ip) {
		this.device = new ConcreteDevice(id, price, ip);
	}


	public String getDeviceType() {
		return "PersonalComputer";
	}
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof PersonalComputer)) return false;
		PersonalComputer other = (PersonalComputer) obj;
		if (this.device == null) return other.device == null;
		if (other.device == null) return false;
		return this.device.equals(other.device);
	}


	public int hashCode() {
		return (device != null ? device.hashCode() : 0);
	}

}
