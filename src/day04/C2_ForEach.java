package day04;

import java.util.ArrayList;
import java.util.List;

public class C2_ForEach {
    public static void main(String[] args) {

        //Soru:verilen string bir array'deki her bir elementi kontrol edip,
        //-kelimenin uzunlugu cift sayi ise ilk yarisini,
        //-kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini alip,
        //-yeni bir listeye ekleyip yazdiran bir method olusturun.

        String [] arr={"araba","kelam","mehmet","hasan","kitaplik"};


        //method call yapalim.
        isimDegistirme(arr);


    }

    public static void isimDegistirme(String [] arr){

        List <String> isimList=new ArrayList<>();

        for (String each:arr
             ) {
            if(each.length() %2 ==0){
                isimList.add(each.substring(0,each.length()/2));
            }else{// tek sayi ise
                isimList.add(each.substring((each.length()-1)/2));
            }
        }

        System.out.println(isimList);
    }
}
