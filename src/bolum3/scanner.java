package bolum3;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı =scanner.nextInt();
        System.out.println(sayı);


        char harf = scanner.next().charAt(0);
        System.out.println(harf);
    }
}
