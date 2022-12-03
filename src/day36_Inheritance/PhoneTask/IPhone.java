package day36_Inheritance.PhoneTask;

public class IPhone extends Phone {
    public IPhone(String model,  String color, double price, double size) {
        super(model, "Apple", color, price, size);
    }
   public void faceTime(long phoneNumber){
       System.out.println(model+" is in a facetime meeting with"+ phoneNumber);
   }
   public void faceTime(String email){
       System.out.println(model+" is in a facetime meeting with"+ email);

   }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
