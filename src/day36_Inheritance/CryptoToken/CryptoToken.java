package day36_Inheritance.CryptoToken;

public class CryptoToken {
    public double price,marketCap, volume, circulatingSupply;
    public int quantity;
    public char isMineable;

    public CryptoToken(double price, double marketCap, double volume, double circulatingSupply, int quantity, char isMineable) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.quantity = quantity;
        this.isMineable = isMineable;
    }
public double totalPrice(){
        return price*quantity;
}
    @Override
    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                ", totalPrice= $" + totalPrice() +
                '}';
    }
}
