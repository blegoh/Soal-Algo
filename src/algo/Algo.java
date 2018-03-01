/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author yusuf
 */
public class Algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int asas[] = {0, 1, 0, 3, 12};

        int as[][] = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
        {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
//        soal1(TestCase.soal1_1); //easy
//        soal1(TestCase.soal1_2); //easy
//        soal2(TestCase.soal2_1a,TestCase.soal2_1b); //easy
//        soal2(TestCase.soal2_2a,TestCase.soal2_2b); //easy
//        soal3(TestCase.soal3_1); //hard
//        soal3(TestCase.soal3_2); //hard
//        soal4(TestCase.soal4_1); //medium
//        soal4(TestCase.soal4_2); //medium
//        soal5(TestCase.soal5_1); //medium
//        soal5(TestCase.soal5_2); //medium
//        soal6("qqweqwqs"); //easy
//        soal7(1241, 3); //hard
//        soal8(a); //hard
//        soal9(5); // hard
//        soal10("aabasa"); // medium
//        soal11(asas);//easy
//        soal12(0); //medium
//        soal13(asas);//easy
//        soal14(as); // hard
//        soal15(49);
    }

    /**
     * zig zag level easy
     *
     * @param input
     */
    public static void soal1(int input) {
        Easy.zigzag(input);
    }

    /**
     *
     * list bil prima level easy
     *
     * @param keAwal
     * @param keAkhir
     */
    public static void soal2(int keAwal, int keAkhir) {
        Easy.listPrima(keAwal, keAkhir);
    }

    /**
     * dadu level hard
     *
     * @param dadu
     */
    public static void soal3(int dadu) {
        Hard.dadu(dadu, new ArrayList<Integer>(), 1);
    }

    /**
     * happy number level medium
     *
     * @param n
     */
    public static void soal4(int n) {
        System.out.println(n);
        System.out.println(Medium.superDigit(n));
    }

    /**
     * rotate level medium
     *
     * @param n
     */
    public static void soal5(int n[][]) {
        printArray(Medium.rotate(n));
    }

    /**
     * list jumlah karakter level easy
     *
     * @param kalimat
     */
    public static void soal6(String kalimat) {
        Easy.jumlahKarakter(kalimat);
    }

    public static void soal7(int x, int n) {
        Hard.powerSum(x, n);
    }

    public static void soal8(int x[][]) {
        Hard.spiral(x);
    }

    public static void soal9(int n) {
        printArray(Hard.generateMatrixSpiral(n));
    }

    public static void soal10(String kalimat) {
        printString(Medium.listPalindrom(kalimat));
    }

    public static void soal11(int[] nums) {
        int hasil[] = Easy.moveZeroes(nums);
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }

    public static void soal12(int ke) {
        print(Medium.pascal(ke));
    }

    public static void soal13(int nums[]) {
        ArrayList<Integer> a = Easy.countSmaller(nums);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static void soal14(int[][] a) {
        int total = Hard.maxAreaOfIsland(a);
        System.out.println(total);
    }

    public static void soal15(int num) {
        System.out.println(Medium.intToRoman(num));
    }

    public static void print(ArrayList<Integer> data) {
        System.out.print("[");
        for (int i = 0; i < data.size(); i++) {
            if (i == data.size() - 1) {
                System.out.print(data.get(i) + "");
            } else {
                System.out.print(data.get(i) + ",");
            }
        }
        System.out.print("]");
        System.out.println("");
    }

    public static void printArray(int[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printManeh(ArrayList<Integer> hasil) {
        for (int i = 0; i < hasil.size(); i++) {
            System.out.print(hasil.get(i) + " ");
        }
        System.out.println("");
    }

    static void printString(ArrayList<String> hasil) {
        for (int i = 0; i < hasil.size(); i++) {
            System.out.println(hasil.get(i));
        }
    }

}
