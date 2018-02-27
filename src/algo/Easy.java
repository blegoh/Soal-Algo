/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author blegoh
 */
public class Easy {
    
    public static void zigzag(int input){
        for (int i = 0; i < input; i++) {
            int x = 0;
            for (int j = 0; j < (input + (input - 1)); j++) {
                if (j % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if (x % 2 == 0) {
                        if (i == input - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    } else {
                        if (i == 0) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    x++;
                }
            }
            System.out.println("");
        }
    }
    
    public static boolean isPrima(int input) {
        if (input < 2) {
            return false;
        } else if (input == 2) {
            return true;
        } else {
            for (int i = 2; i < input - 1; i++) {
                if (input % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void listPrima(int keAwal, int keAkhir) {
        int i = 2;
        int pos = 0;
        while (pos <= keAkhir) {
            if (Easy.isPrima(i)) {
                pos++;
                if (pos >= keAwal && pos <= keAkhir) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
    
    public static void jumlahKarakter(String kalimat) {
        for (int i = 0; i < kalimat.length(); i++) {
            if (!udahAdaKiri(kalimat.substring(0, i), kalimat.charAt(i))) {
                int jml = 0;
                for (int j = i; j < kalimat.length(); j++) {
                    if (kalimat.charAt(i) == kalimat.charAt(j)) {
                        jml++;
                    }
                }
                System.out.println(kalimat.charAt(i) + " : " + jml);
            }
        }
    }
    
    public static boolean udahAdaKiri(String a, char b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                return true;
            }
        }
        return false;
    }
}
