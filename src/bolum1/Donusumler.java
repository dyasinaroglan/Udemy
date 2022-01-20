package bolum1;

public class Donusumler {
    public static void main(String[] args) {

        int sayı1 = 5/3; //1
        float sayı2 = 5f/3f; // float virgülden sonra 7 basamak yazıyor.
        double sayı3 = 5D/3d;


        System.out.println(sayı1 +"\n"+ sayı2+"\n"+ sayı3);

        int num1 = 1;
        int num2 =2;
        double avarage = (num1+num2)/2;  //burası sürekli kendini int gördü 2 değerini
        System.out.println(avarage);

        double avarage2 = (num1+num2)/2.0; //burada double algılanıyor zaten
        System.out.println(avarage2);
    }
}
