package bolum2;

public class Ornek2 {
    public static void main(String[] args) {
        /*
        bir double değişken oluşturun ve bu değişkende fahrenheit cinsinden sıcaklığı saklayın
        sonrasında bu değerin kaç celcius olduğunu hesaplayın
        100 değeri için 37.777778 gibi bir değer elde etmelisiniz.
        hesaplama formülü : celcius = 5/9* ( fahrenheit-32)
         */

        double fahrenheit = 100.0d;
                                                   // double celcius = (5/9)*(fahrenheit-32);
                                                   //bu şekilde yaparsam (5/9) int kabul eder ve sonuç sıfır çıkar.
        double celcius = (5.0/9)*(fahrenheit-32);

        System.out.println("girilen "+ fahrenheit+ " fahrenheit = "+ celcius + " celcius");


    }
}
