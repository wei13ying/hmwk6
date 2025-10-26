public class Main {
	 public static void main(String[] args) {
		Car[] cars = {
			new Car(1, "Hyundai", "Elantra", 2023, "White", 1559000, "123ABC"),
			new Car(2, "Chery", "Arrizo", 2023, "Blue", 1990000, "456DEF"),
			new Car(3, "Hyundai", "Solaris", 2022, "Brown", 1626000, "789GIJ")
		};

		Car[] hyundaiCars = getCarByBrend(cars, "Hyundai");
		System.out.println("Машины марки Hyundai:");
		for (Car car : hyundaiCars) {
			System.out.println(car);
		}

		String brend = "Hyundai";
		int years = 2;
		Car[] oldhyundai = getCarByBrendAndYearOperational(cars, brend, years);

		System.out.println("Машины марки " + brend + " старше " + years + " лет:");
		for (Car car : oldhyundai) {
			System.out.println(car);
		}
	}

	public static Car[] getCarByBrend(Car[] cars, String brend) {
		int count = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brend)) {
				count++;
			}
		}

		Car[] result = new Car[count];
		int index = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brend)) {
				result[index] = car;
				index++;
			}
		}
		return result;
	}

	public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years) {
		int currentYear = 2025;
		int count = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
				count++;
			}
		}

		Car[] result = new Car[count];
		int index = 0;
		for (Car car : cars) {
			if (car.getMarka().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
				result[index] = car;
				index++;
			}
		}
		return result;
	}
}
