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
//        soal6(TestCase.soal6_1); //easy
//        soal6(TestCase.soal6_2); //easy
//        soal7(TestCase.soal7_1a, TestCase.soal7_1b); //hard
//        soal7(TestCase.soal7_2a, TestCase.soal7_2b); //hard
//        soal8(TestCase.soal8_1); //hard
//        soal8(TestCase.soal8_2); //hard
//        soal9(TestCase.soal9_1); // hard
//        soal9(TestCase.soal9_2); // hard
//        soal10(TestCase.soal10_1); // medium
//        soal10(TestCase.soal10_2); // medium
//        soal11(TestCase.soal11_1);//easy
//        soal11(TestCase.soal11_2);//easy
//        soal12(TestCase.soal12_1); //medium
//        soal12(TestCase.soal12_2); //medium
//        soal13(TestCase.soal13_1);//easy
//        soal13(TestCase.soal13_2);//easy
//        soal14(TestCase.soal14_1); // hard
//        soal14(TestCase.soal14_2); // hard
//        soal15(TestCase.soal15_1); //medium
//        soal15(TestCase.soal15_2); //medium
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
     * super digit level medium
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

    /**
     * level hard
     * @param x
     * @param n 
     */
    public static void soal7(int x, int n) {
        Hard.powerSum(x, n);
    }

    /**
     * spiral level hard
     * @param x 
     */
    public static void soal8(int x[][]) {
        Hard.spiral(x);
    }

    /**
     * level hard
     * @param n 
     */
    public static void soal9(int n) {
        printArray(Hard.generateMatrixSpiral(n));
    }

    /**
     * level medium
     * @param kalimat 
     */
    public static void soal10(String kalimat) {
        printString(Medium.listPalindrom(kalimat));
    }

    /**
     * easy
     * @param nums 
     */
    public static void soal11(int[] nums) {
        int hasil[] = Easy.moveZeroes(nums);
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i] + " ");
        }
    }

    /**
     * level medium
     * @param ke 
     */
    public static void soal12(int ke) {
        print(Medium.pascal(ke));
    }

    /**
     * level easy
     * @param nums 
     */
    public static void soal13(int nums[]) {
        ArrayList<Integer> a = Easy.countSmaller(nums);
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    /**
     * level hard
     * @param a 
     */
    public static void soal14(int[][] a) {
        int total = Hard.maxAreaOfIsland(a);
        System.out.println(total);
    }

    /**
     * level medium
     * @param num 
     */
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
