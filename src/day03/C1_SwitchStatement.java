package day03;

import java.util.Scanner;

public class C1_SwitchStatement {

    public static void main(String[] args) {

            /*
            ÖDEV SORUSU- 20230923- Kullanicidan gun ismini girmesini isteyin,
                         girilen gun hafta ici bir gun ise
                         "Simdi calisma zamani tatile .. gun var" seklinde ,
                         hafta sonu tatiline kac  gun kaldigini yazdirin,
                         girilen gun hafta sonu ise "Simdi dinlenme zamani" yazdirin.

           */

        //switch statements icinde || ve && kullanamiyoruz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz.");
        String gunIsmi= scanner.nextLine().toLowerCase();

        switch (gunIsmi){
            case "pazartesi":
                System.out.println("Simdi calisma zamani tatile 5 gun var.");
                break;
            case "sali":
                System.out.println("Simdi calisma zamani tatile 4 gun var.");
                break;
            case "carsamba":
                System.out.println("Simdi calisma zamani tatile 3 gun var.");
                break;
            case "persembe":
                System.out.println("Simdi calisma zamani tatile 2 gun var.");
                break;
            case "cuma":
                System.out.println("Simdi calisma zamani tatile 1 gun var.");
                break;
            case "cumartesi":
                System.out.println("Simdi dinlenme zamani.");
                break;
            case "pazar":
                System.out.println("Simdi dinlenme zamani.");
                break;
            default:
                System.out.println("Hatali giris yaptiniz.");


        }

    }
}
