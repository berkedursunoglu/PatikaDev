package Transpoz;

import java.util.Arrays;

public class Transpoz {
    public static void main(String[] args) {
        int[][] matris = new int[3][2];
        int[][] transpoz = new int[2][3];
        matris[0][0] = 5;
        matris[0][1] = 2;
        matris[1][0] = 3;
        matris[1][1] = 5;
        matris[2][0] = 61;
        matris[2][1] = 2;


        for (int i = 0 ; i < matris.length; i++){
            for(int j = 0 ; j <matris[i].length; j++){
                transpoz[j][i] = matris[i][j];
            }
        }

        System.out.println("Matris: ");
        for (int[] i : matris){
            for (int d : i){
                System.out.print (d+"  ");
            }
            System.out.println();
        }

        System.out.println("Transpoz: ");
        for (int[] i : transpoz){
            for (int d : i){
                System.out.print (d+"  ");
            }
            System.out.println();
        }





    }
}
