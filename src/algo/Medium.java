/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;

/**
 *
 * @author blegoh
 */
public class Medium {

    public static int superDigit(int n) {
        String a = n + "";
        int jml = 0;
        for (int i = 0; i < a.length(); i++) {
            jml += Integer.parseInt(a.charAt(i) + "");
        }
        if (jml < 10) {
            return jml;
        } else {
            return superDigit(jml);
        }
    }

    public static int[][] rotate(int[][] matrix) {
        int[][] hasil = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return hasil;
    }

    public static ArrayList<String> listPalindrom(String kalimat) {
        ArrayList<String> hmm = new ArrayList<>();
        for (int i = 0; i < kalimat.length(); i++) {
            String as = kalimat.charAt(i) + "";
            if (!wisEnek(hmm, as)) {
                hmm.add(as);
            }
            if (i < kalimat.length() - 1) {
                for (int j = i + 1; j < kalimat.length(); j++) {
                    as += kalimat.charAt(j);
                    if (isPalindrom(as) && !wisEnek(hmm, as)) {
                        hmm.add(as);
                    }
                }
            }
        }
        return hmm;
    }

    public static boolean wisEnek(ArrayList<String> hmm, String sa) {
        for (int i = 0; i < hmm.size(); i++) {
            if (hmm.get(i).equals(sa)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrom(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
    
    public static ArrayList<Integer> pascal(int i){
        ArrayList<Integer> a = new ArrayList<>();
        int x = i-1;
        for (int j = 0; j < i; j++) {
            a.add(getPosisi(j, x--));
        }
        return a;
    }
    
    //pascal
    public static int getPosisi(int x, int y){
        if (x == 0 || y == 0) {
            return 1;
        }else{
            return getPosisi(x, y-1) + getPosisi(x-1, y);
        }
    }
}
