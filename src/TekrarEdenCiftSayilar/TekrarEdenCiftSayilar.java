package TekrarEdenCiftSayilar;

import java.util.ArrayList;
import java.util.Arrays;

public class TekrarEdenCiftSayilar {


    public static void main(String[] args) {

        int[] dizi = new int[]{5,6,8,8,10,12,65,5,65,12};
        ArrayList<Integer> dup  = new ArrayList<Integer>();
        int sayac = 0;

        for (int i = 0 ; i < dizi.length; i++){
            for (int j = 0 ; j < dizi.length;j++){
                if (i != j && dizi[i] == dizi[j] && dizi[i]%2==0){
                    if (!dup.contains(dizi[i])){
                        dup.add(dizi[i]);
                    }
                    break;
                }
            }
        }

        System.out.println(dup);


    }


}
