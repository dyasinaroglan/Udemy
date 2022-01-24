package bolum3;

public class ifElse {
    public static void main(String[] args) {
        int benimYas = 30;
        int onunYas = 26;

        if(benimYas>onunYas){
            System.out.println("benim yaşım onun yaşından büyüktür");
        }else if (onunYas>benimYas){
            System.out.println("onun yaşı benim yaşımdan büyüktür");
        }
        else {
            System.out.println("benim yaşım onun yaşına eşittir");
        }

        //yapılan hatalardan biri şu
        int a = 4;
        if (a>5);{
            System.out.println("a 5 ten büyüktür");
            //a 5 ten büyük olsa da olmasa da 5 ten büyüktür ü yazdıracak.
            //çümkü sen orada ; koyarak programı sonlandırıyosun. bu hata. noktalı virgül kullanılmaz.
        }
        int sayı1 = 10, sayı2=6, sayı3=0;

        if(sayı1>sayı2){
            sayı3 = sayı1-sayı2;
        }else {
            sayı3 = sayı1+sayı2;
        }
        //bunu tek satırda da yapabiliriz.

        sayı3 = (sayı1>sayı2) ? (sayı1-sayı2):(sayı1+sayı2);
        //? kontrol et anlamında  : else amlamında
        System.out.println(sayı3); //ternary
    }
}
