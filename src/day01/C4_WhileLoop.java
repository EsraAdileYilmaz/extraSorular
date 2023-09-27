package day01;

import java.util.Scanner;

public class C4_WhileLoop {
    public static void main(String[] args) {

        /*
        SORU:kullanicidan bir sayi alip 3 ile bolunup bolunemedigini yazdirin,
             kullanici 3 ile bolunebilen bir sayi girinceye kadar tekrar deger isteyin

         */

        Scanner scanner=new Scanner(System.in);

        int sayi=2; // 3'e bolunmeyen herhangi bir sayi yazmaliyiz

        while( sayi % 3 != 0){ //sayi 3'e bolunmedigi muddetce loop devam eder
            System.out.println("Lutfen pozitif bir tamsayi giriniz");
            sayi= scanner.nextInt();

            if( sayi %3 ==0){
                System.out.println("Sayi 3 ile tam bolunuyor");
            }else {
                System.out.println("Sayi 3 ile tam bolunmuyor");
            }
        }

    }
}
