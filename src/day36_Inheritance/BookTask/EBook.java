package day36_Inheritance.BookTask;

public class EBook extends Book{

   public String size;
   public int  pages;


    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size=size;
        this.pages=pages;
    }
    public void read(){
        System.out.println(title +" is available for reading");
    }

    @Override
    public String toString() {
        return "EBook{" +
                "size='" + size + '\'' +
                ", pages=" + pages +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
