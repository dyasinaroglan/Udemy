package bolum3;

public class WhileDoWhile {
    public static void main(String[] args) {
        int sayı =10;

        while (sayı<20){
            System.out.println("while merhaba sayı = "+ sayı);
            sayı++;
        }
        System.out.println("**************************");
        for (int i = 0; i<20; i++){
            System.out.println("for merhaba sayı : "+ i);
        }
        int s1 = 0;

        do {
            System.out.println("s1 = "+s1);
            s1++;

        }while (s1<5);
    }
}
