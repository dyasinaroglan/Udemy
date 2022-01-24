package bolum3;

public class Maths {
    public static void main(String[] args) {

        System.out.println("pi sayısı = "+ Math.PI);
        System.out.println("pi sayısı = "+ Math.E);
        System.out.println("MUTLAK DEĞER = "+ Math.abs(-9));
        System.out.println("4.3 nın yuvarlanmış sonucu = "+ Math.ceil(4.3));
        //ceil virgüllü sayıyı yuvarlıyor. en yakınında olan bir üst tam sayıya yuvarlar.
        System.out.println("4.09 nın yuvarrlanmış hali = "+ Math.ceil(4.09));
        System.out.println("2 nin küpü :"+ Math.pow(2,3));
        System.out.println("3 ün karesi = "+ Math.pow(3,2));
        System.out.println("karakök = " + Math.sqrt(16));
        System.out.println("max bulma :"+ Math.max(2,3)); //hangisi en büyükse onu yazdırır.

        Math.random();   //0.0-0.99999999 a kadar sayı üretir.

        //0 dan 10 a kadar 10 dahil random sayı üreten program yazın
        int randomSayı = (int) (Math.random()*10+1);
        System.out.println("random sayı = " +randomSayı);





    }
}
