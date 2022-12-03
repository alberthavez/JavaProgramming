package day36_Inheritance.BookTask;

public class AudioBook extends Book{

    public String length, narrator;

    public AudioBook(String title, String type, String author, double price, String length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println(title +" is available for listening");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "length='" + length + '\'' +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
