package day01;

public class C1_ForLoop {
    public static void main(String[] args) {

        /*
        SORU:verilen bir metindeki buyuk harf,kucuk harf ve space sayilarini bulun,
             space sayisini gozonune alarak kac kelime oldugunu,
             kac tane kucuk harf,
             kac tane buyuk harf oldugunu yazdirin.

         */

        String str="Java ogrenen isi kapar";

        int buyukHarf=0;
        int kucukHarf=0;
        int spaceSayi=0;

        int basamakSayi=str.length();

        for (int index = 0; index < basamakSayi ; index++) {

         char karakter=str.charAt(index); // her bir indexi teker teker alir

         if('a'<= karakter && karakter<='z'){
             kucukHarf++;
         } else if ('A'<=karakter && karakter <= 'Z') {
             buyukHarf ++;
         } else if (karakter == ' '){
             spaceSayi ++;

         }

        }
        System.out.println("Metindeki kelime sayisi: " +(spaceSayi+1)
                +"\nKucuk harf sayisi: " + kucukHarf+
                "\nBuyuk harf sayisi : "+ buyukHarf);
    }
}
