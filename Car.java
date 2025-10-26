public class Car {

    private int id;
    private String marka;
    private String model;
    private int year;
    private String color;
    private double price;
    private String regNumber;

    public Car(int id, String marka, String model, int year, String color, double price, String regNumber) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }


    public int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegNumber() {
        return regNumber;
    }


    public String toString() {
        return "Машина: " + marka + " " + model + ", " + year + " г., цвет: " + color + ", цена: " + price + " руб.";
    }
}
