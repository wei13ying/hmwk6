public class PersonalComputer {
	private Device device;

	public PersonalComputer(int id, int price) {
		this.device = new Device(id, price);
	}

	public PersonalComputer(int id, int price, String ip) {
		this.device = new Device(id, price, ip);
	}


	public String getDeviceType() {
		return "PersonalComputer";
	}
}
