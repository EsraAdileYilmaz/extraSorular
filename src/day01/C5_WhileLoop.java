package day01;

import java.util.Scanner;

public class C5_WhileLoop {
    public static void main(String[] args) {

        /*
        SORU:kullanicidan toplanmak uzere sayilar alin
             toplam 500 olur veya gecerse deger almayi durdurup,
             kac sayi girildigini ve
             toplamin kac oldugunu yazdirin
         */

        Scanner scanner=new Scanner(System.in);
        int sayi; // burda sayi variable olusturup loop icinde atamasini yapiyoruz.

        int count=0;
        int toplam=0;

        while (toplam <500){ // toplma 500'den kucuk oldugu muddetce loop calisir

            System.out.println("Lutfen toplamak icin pozitif tamsayi giriniz");
            sayi= scanner.nextInt();

            toplam +=sayi;
            count++;
        }

        System.out.println(count + " adet sayinin toplami: "+ toplam);
    }
}
