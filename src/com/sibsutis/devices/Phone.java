public class Phone {
	private Device device;


	public Phone(int id, int price) {
		this.device = new Device(id, price);
	}


	public Phone(int id, int price, String ip) {
        	this.device = new Device(id, price, ip);
	}


	public String getDeviceType() {
		return "Phone";
	}
}
