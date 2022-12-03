package day36_Inheritance.PhoneTask;

public class Samsung extends Phone{
    public Samsung(String model,  String color, double price, double size) {
        super(model, "Samsung", color, price, size);
    }
   public void freeze(){
       System.out.println(brand+" "+model+" is freezing");
   }

    @Override
    public String toString() {
        return "Samsung{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
