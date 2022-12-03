package day36_Inheritance.CryptoToken;

public class Doge extends CryptoToken{
    public Doge(double price, double marketCap, double volume, double circulatingSupply, int quantity, char isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }

    @Override
    public String toString() {
        return "Doge{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }
}
