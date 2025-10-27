package com.sibsutis.devices;

import com.sibsutis.Printable;

public abstract class Device implements Printable {
	private int id;
	private int price;
	private String ip;

	public Device(int id, int price, String ip) {
		this.id = id;
		this.price = price;
		this.ip = ip;
	}


	public int getId() {
		return id;
	}

	public int getPrice() {
		return price;
	}

	public String getIp() {
		return ip;
	}

	public String print() {
		String ipInfo = (ip != null) ? ip : "null";
		return "ID: " + id + ", Цена: " + price + ", IP: " + ipInfo + ", Тип: " + getDeviceType();
	}


	public abstract String getDeviceType();

	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Device other = (Device) obj;
		return id == other.id &&
			price == other.price &&
			(ip == null ? other.ip == null : ip.equals(other.ip));
	}

	public int hashCode() {
		int result = id;
		result = 31 * result + price;
		result = 31 * result + (ip != null ? ip.hashCode() : 0);
		return result;
	}
}

