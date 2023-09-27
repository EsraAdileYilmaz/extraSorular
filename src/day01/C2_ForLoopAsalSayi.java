package day01;

public class C2_ForLoopAsalSayi {
    public static void main(String[] args) {

        /*
        SORU:verilen bir sayinin asal olup olmadigini yazdirin.
         */

        int verilenSayi=5697;

        // flag yontemi ile yapalim
        boolean asalMi= true;
       // bolunebilme kurallari 2 'den baslayarak kontrol edilir.buyuzden int i=2 yapariz
        for (int i = 2; i < verilenSayi ; i++) {

            if (verilenSayi %i ==0){
                 asalMi= false;
                 break;
            }

        }
        if(asalMi){ // atanan true idi. burada asalmi true ise
            System.out.println("Sayi asal sayidir");

        }else{ // false ise
            System.out.println("Sayi asal sayi degildir");
        }
    }
}
