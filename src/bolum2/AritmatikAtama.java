package bolum2;

public class AritmatikAtama {
    public static void main(String[] args) {

        int sayı1 =10;
        int sayı2 =20;

        int sonuc =0;
        sonuc+= sayı1;
        System.out.println("sonuç = "+sonuc);

        sonuc-= sayı2;
        System.out.println("sonuç = "+ sonuc);

        sonuc*= sayı1;
        System.out.println(sonuc);


        double ondalıkSayı = 6.5;
        double sonuc1 =0;
        sonuc1++; //sonuc1 i 1 arttır.

        ondalıkSayı*= sonuc1;
        System.out.println(ondalıkSayı);


        int s1 = 10;
        int s2 =6;

        s1++;
        --s2;
        s1*= --s2;  // s1 = s1* önce s2 yi azalt sonra yaz 4 (11*4)s1

        System.out.println("s1 değeri = "+s1);
        System.out.println("s2 değeri = "+s2 );
    }
}
