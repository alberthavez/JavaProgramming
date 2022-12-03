package day36_Inheritance.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("i7","blue",1500,7.6);
        Samsung samsung= new Samsung("i8","black",1200,6.70);
        Nokia nokia= new Nokia("i9","white",1000,5.3);

        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(nokia);

        iPhone.call(1);
        samsung.call(1);
        nokia.call(1);
        iPhone.text(2);
        iPhone.faceTime(3);
        iPhone.faceTime("@yahoo.com");
        samsung.freeze();
        nokia.selfDefense();

    }
}
