package bolum2;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        /*
        bir yıl değerinin artık yıl olup olmadığını hesaplayın. bir yılın artık olması için ya 400 ile modu sıfır olmalı
        yıl değerini kullanıcıdan giriniz.
        ya da 4 ile modu 0 olmalı
        100 ile modu sıfır olmamalı
        4100 false değer vermeli
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl = scanner.nextInt();
        boolean artıkYılMı =(yıl% 400 == 0) || ( yıl%4 == 0) && (yıl%100 != 0 );
                                         //veya              ve
        System.out.println(artıkYılMı);
    }
}
