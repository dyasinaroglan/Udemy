package bolum1;

public class TypeDonusumleri {

    public static void main(String[] args) {
        String str = "150";
        //bunu int e nasıl dönüştürürüz.

        int dönüsüm1 = Integer.parseInt(str);
        // ya da
        int dönüsüm2 = Integer.valueOf(str);

        System.out.println(dönüsüm1);
        System.out.println(dönüsüm2);

        //str artık integer. şimdi bunu tekrar String e çevirelim

        str = String.valueOf(dönüsüm1);
        System.out.println(dönüsüm1); // tekrardan string e çevirdik.
        System.out.println("****************************");

        int sayı =12;
        String dönüstür = String.valueOf(sayı);
        System.out.println(dönüstür);

        String str1 = "32";
        Integer dönüstür1 = Integer.valueOf(str1);
        System.out.println(dönüstür1);
    }
}
