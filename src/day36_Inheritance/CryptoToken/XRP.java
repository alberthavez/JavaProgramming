package day36_Inheritance.CryptoToken;

public class XRP extends CryptoToken{
    public XRP(double price, double marketCap, double volume, double circulatingSupply, int quantity, char isMineable) {
        super(price, marketCap, volume, circulatingSupply, quantity, isMineable);
    }

    @Override
    public String toString() {
        return "XRP{" +
                "price=" + price +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", quantity=" + quantity +
                ", isMineable=" + isMineable +
                '}';
    }
}
