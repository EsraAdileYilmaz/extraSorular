package day01;

import java.util.Scanner;

public class C6_DoWhileLoop {
    public static void main(String[] args) {


        /*
        SORU:kullanicidan bir pozitif sayi isteyin,
             sayinin tam kare olup olmadigini bulunuz.
             Tamkare ise true, deilse false yazdirin.
             or:input 16, output true
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scanner.nextInt();
        boolean tamKare=false;
        int karekok=2;

        do{

            if(sayi == karekok*karekok){
                tamKare=true;
                break;
            }
            karekok++;
        }while(karekok*karekok<=sayi);

        System.out.println(tamKare);
    }
}
