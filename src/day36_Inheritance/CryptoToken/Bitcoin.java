package day36_Inheritance.CryptoToken;

public class Bitcoin extends CryptoToken{
    public Bitcoin(double price, double marketCap, double volume, double circulatingSupply, int quantity, char isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }
}
