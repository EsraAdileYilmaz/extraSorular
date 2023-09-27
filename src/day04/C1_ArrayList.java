package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1_ArrayList {

    public static void main(String[] args) {

        //SORU:verilen bir int array'de ,
        //tekrar eden elementleri silin.
        //Array'i unique degerlerden olusan bir array yapin.


        int [] arr={2,3,5,8,9,0,1,2,6,3,8,9,3,2,4,1,7};

        List <Integer> sayilar= new ArrayList<>();// buna array'in her bir elementinden 1 tane atayalim.

        for (Integer each:arr
             ) {
            if( !sayilar.contains(each)){
                sayilar.add(each);
            }
        }
        System.out.println(sayilar);//[2, 3, 5, 8, 9, 0, 1, 6, 4, 7] unique hale geldi

        int [] yeniArr=new int[sayilar.size()];

        for (Integer each:sayilar
             ) {
            yeniArr[each]= sayilar.get(each);
        }
        System.out.println(Arrays.toString(yeniArr));//[2, 3, 5, 8, 9, 0, 1, 6, 4, 7]

        //ayrica istersek yeni array'i eski array'e atayabiliriz.

        arr=yeniArr;
        System.out.println(Arrays.toString(arr)); //[2, 3, 5, 8, 9, 0, 1, 6, 4, 7]
        //boylece eski array'imizi unique hale getirdik.



    }
}
