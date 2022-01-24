package bolum3;

public class SwitchCase {
    public static void main(String[] args) {
        int haftanınGunu =2;
        if (haftanınGunu ==1){
            System.out.println("pazartesi");
        }else if (haftanınGunu==2){
            System.out.println("salı");
        }else if (haftanınGunu==3){
            System.out.println("çarşamba");
        }else if (haftanınGunu==4){
            System.out.println("perşembe");
        }else if (haftanınGunu==5){
            System.out.println("cuma");
        }

        switch (haftanınGunu){
            case 1 :
                System.out.println("switch pazartesi");
                break;
            case 2 :
                System.out.println("switch salı");
                break;
            case 3 :
                System.out.println("switch çarşamba");
                break;
            case 4 :
                System.out.println("switch perşembe");
                break;
            case 5 :
                System.out.println("switch cuma");
                break;
            default:
                System.out.println("switch tanımlanmayan gün");
        }
        //break olmazsa hepsini tek tek yazdırır.
        //switch case de() float ve double ifadeler kullanılamaz.
        //istemediğimiz, tanımlamadığımız bir case numarası girilmişse bunu default ile yazabiliriz
    }
}
