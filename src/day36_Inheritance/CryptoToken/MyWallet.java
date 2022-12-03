package day36_Inheritance.CryptoToken;

import java.util.ArrayList;
import java.util.Arrays;

public class MyWallet {
    public static void main(String[] args) {
        ArrayList<CryptoToken> mywallet= new ArrayList<>();
        Bitcoin bitcoin= new Bitcoin(100,100,100,100,100,'Y');
        Cardano cardano= new Cardano(20,20,20,20,20,'y');
        Doge doge= new Doge(30,30,30,30,30,'N');
        XRP xrp=new XRP(40,40,40,40,40,'Y');
        Etherium etherium=new Etherium(50,50,50,50,50,'Y');
        System.out.println(bitcoin);
        System.out.println(bitcoin.totalPrice());
        System.out.println(xrp);
        System.out.println(xrp.totalPrice());
        System.out.println(etherium);
        System.out.println(etherium.totalPrice());
        System.out.println(cardano);
        System.out.println(cardano.totalPrice());
        System.out.println(doge);
        System.out.println(doge.totalPrice());
        mywallet.addAll(Arrays.asList(bitcoin,doge,etherium,xrp,cardano));
        double totalprice=0;
        for (CryptoToken cryptoToken : mywallet) {
            totalprice+=cryptoToken.totalPrice();
        }
        System.out.println("The size of your wallet is: $"+totalprice);


    }
}
