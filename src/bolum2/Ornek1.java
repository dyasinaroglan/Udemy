package bolum2;

public class Ornek1 {
    public static void main(String[] args) {
        /*
        bir int değer oluşturun ve bu değişkende saniye değerini tutun.
        sonra bu saniye değerinin kaç dakika ve saniyeye denk geldiğini yazdırın.

         */

        int saniye =1250;
        int dakika = saniye/60;
        int kalanSaniye = saniye%60;

        System.out.println(saniye+ " saniye "+ dakika+" dakika "+ kalanSaniye+" saniyedir.");
    }
}
