package bolum3;

public class breakAndContinue {
    public static void main(String[] args) {

        for (int i =0; i<10; i++){
            if (i==4){
                break;
            }
            System.out.println("i nin değeri = "+i);
        }
        dıstakiFor :
        for (int a = 0; a < 5; a++) {
            ictekiFor :
            for (int b = 0; b < 4; b++) {
                if(a==3 && b==2){
                    break dıstakiFor;
                }
                System.out.println("a nın değeri = "+a+ "****b nın değeri = "+b);
            }
        }
        for (int k = 0; k < 5; k++) {
            if(k==2){
                continue;
            }
            System.out.println("k nın değeri :"+k); // 2 ye geldiğinde pas geçiyor.

        }
    }
}
