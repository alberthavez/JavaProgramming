package day36_Inheritance.PhoneTask;

public class Nokia extends Phone{
    public Nokia(String model,  String color, double price, double size) {
        super(model, "Nokia", color, price, size);
    }
  public void selfDefense(){
      System.out.println(brand+" "+model+" can be used as a Self Defence Item.");
  }

    @Override
    public String toString() {
        return "Nokia{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
