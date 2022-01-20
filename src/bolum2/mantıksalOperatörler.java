package bolum2;

public class mantıksalOperatörler {
    public static void main(String[] args) {
        int sayı1 =10;
        int sayı2 =11;

        System.out.println("sayı 1 eşit mi 2'ye--> " +(sayı1==sayı2));
        System.out.println("sayı 1 eşit mi 2'ye--> " +(sayı1>sayı2));
        System.out.println("sayı 1 eşit mi 2'ye--> " +(sayı1<=sayı2));
        System.out.println("sayı 1 eşit mi 2'ye--> " +(sayı1<sayı2));

        if(sayı1<sayı2){
            System.out.println("sayı 1, sayı 2 den küçüktür.");
        }else {
            System.out.println("sayı 1, sayı 2 den küçük değildir.");

            System.out.println("****************************************");

            /*
            && ve ---> true olması için iki değişkenin de true olması gerekiyor.
            || veya---> false olması için iki değişkenin de false olması gerekir.

             */

            boolean b1 = true;
            boolean b2 = false;

            System.out.println("değerler : "+ (b2 && b1));
            System.out.println("değerler : "+ (b2 || b1));
        }

    }
}
