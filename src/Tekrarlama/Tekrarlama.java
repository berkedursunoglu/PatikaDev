package Tekrarlama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Tekrarlama {
    public static void main(String[] args) {
        int[] d = {10,20,21,21,3,3,122,3123,44,123,44};
        int[] f = new int[d.length];

        for (int i = 0; i < d.length; i++)
            f[i] = 1;

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if ((i != j) && (d[i] == d[j])) {
                    f[i]++;
                }
            }
        }
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d.length; j++) {
                if ((i != j) && (d[i] == d[j])) {
                    d[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < d.length; i++) {
            if (f[i] > 1) {
                if (d[i] != 0)
                    System.out.println(d[i] + " sayısının frekansı "+ + f[i]);
            }
        }


    }
}
