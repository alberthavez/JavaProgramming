package day36_Inheritance.PhoneTask;

public class Phone {

    public String model, brand, color;
    public double price, size;

    public Phone(String model, String brand, String color, double price, double size) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }


    public void call(long phoneNumber){
        System.out.println(brand+" "+model+" is calling: "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+" is texting: "+ phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                " brand='" + brand + '\'' +
                " ,model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}/*
Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

*/
