package day01;

public class C3_MethodOlusturma_MiniHesapMak {
    public static void main(String[] args) {


        /*
        SORU:Kullanicinin verdigi iki sayi ve sececegi isleme gore
             sonucu double olarak bize donduren bir method olusturun.
             ornek: sayilar 3 ve 5 islem * oldugunda method 15
             dondurmeli.
         */


        System.out.println(miniHesapMakinesi(365, 42, '*')); //15330.0

        System.out.println(miniHesapMakinesi(15, 400, '-'));//-385.0

        double islemSonucu=miniHesapMakinesi(12,43,'*');
        System.out.println(islemSonucu); //516.0

    }

    public static double miniHesapMakinesi(int sayi1,int sayi2,char islemSembolu){

        double sonuc=0;
        // islem sembolu olarak +,-,* ,/ kullanilabilsin diye char atadik
        switch(islemSembolu){
            case '+':
                sonuc =sayi1 +sayi2;
                break;
            case '-':
                sonuc =sayi1 -sayi2;
                break;
            case '*':
                sonuc =sayi1* sayi2;
                break;
            case '/':
                sonuc=(double) sayi1/sayi2;
                break;
            default:
                System.out.println("Islem sembolu yanlis girildi.\nBu yuzden sonuc=0 atandi");
        }
        return sonuc;
    }
}
