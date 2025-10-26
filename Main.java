public class Main {
	public static void main(String[] args){
		Car[] cars = {
			new Car(1, "Hyundai", "Elantra", 2023, "White", 1559000, "123ABC"),
            		new Car(2, "Chery", "Arrizo", 2023, "Blue", 1990000, "456DEF"),
            		new Car(3, "Hyundai", "Solaris", 2022, "Brown",  1626000, "789GIJ")
		};
		Car[] hyundaiCars = getCarByBrand(cars, "Hyundai");
		System.out.println("Машины марки " + "Hyundai" + ":");
		for (Car car : hyundaiCars) {
			System.out.println(car);
		}
	}
	public static Car[] getCarByBrand(Car[] cars, String brand) {

		int count = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brand)) {
				count++;
			}
		}


		Car[] result = new Car[count];
		int index = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brand)) {
				result[index] = car;
				index++;
			}
		}
		return result;
	}
}
