/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import java.util.ArrayList;

/**
 *
 * @author yusuf
 */
public class Algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursifSum(100, 2, new ArrayList<Integer>());
    }

    /**
     * zig zag
     *
     * @param input
     */
    public static void soal1(int input) {
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

    /**
     * is prima
     *
     * @param input
     * @return
     */
    public static boolean soal2(int input) {
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

    /**
     * dadu
     *
     * @param dadu
     */
    public static void soal3(int dadu) {
        dadu(dadu, new ArrayList<Integer>(), 1);
    }

    /**
     * happy number
     *
     * @param n
     */
    public static void soal4(int n) {
        isHappy(n);
    }

    /**
     * rotate
     *
     * @param n
     */
    public static void soal5(int n[][]) {
        printArray(rotate(n));
    }

    public static void dadu(int jumlahDadu, ArrayList<Integer> data, int posisi) {
        if (posisi == jumlahDadu) {
            for (int i = 1; i <= 6; i++) {
                data.add(i);
                print(data);
                data.remove(data.size() - 1);
            }
        } else {
            for (int i = 1; i <= 6; i++) {
                data.add(i);
                dadu(jumlahDadu, data, posisi + 1);
                data.remove(data.size() - 1);
            }
        }
    }

    public static boolean isHappy(int n) {
        return (getHasil(n) == 1) ? true : false;
    }

    public static int getHasil(int i) {
        try {
            int hasil = 0;
            while (i >= 1) {
                int x = (i % 10);
                hasil += x * x;
                i = i / 10;
            }
            if (hasil == 1) {
                return 1;
            } else {
                return getHasil(hasil);
            }
        } catch (StackOverflowError e) {
            return 0;
        }
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

    public static int[][] rotate(int[][] matrix) {
        int[][] hasil = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil[i].length; j++) {
                hasil[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        return hasil;
    }

    public static void printArray(int[][] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args[i].length; j++) {
                System.out.print(args[i][j] + " ");
            }
            System.out.println("");
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

    static int powerSum(int X, int N) {
        // Complete this function
        return 0;
    }

    static void recursifSum(int jumlah, int pangkat, ArrayList<Integer> data) {
        int i = (data.size() == 0) ? 1 : data.get(data.size() - 1) + 1;
        while (Math.pow(i, pangkat) + jum(data, pangkat) <= jumlah) {
            data.add(i);
            if (jum(data, pangkat) == jumlah) {
                printManeh(data);
            } else {
                recursifSum(jumlah, pangkat, data);
            }
            data.remove(data.size() - 1);
            i++;
        }
    }

    static boolean udahAda(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> b) {
        for (int i = 0; i < b.size(); i++) {
            if (a.size() == b.get(i).size()) {
                boolean as = true;
                for (int j = 0; j < a.size(); j++) {
                    if (a.get(j) != b.get(i).get(j)) {
                        as = false;
                    }
                }
                if (as) {
                    return true;
                }
            }
        }
        return false;
    }

    static int jum(ArrayList<Integer> data, int pangkat) {
        int j = 0;
        for (int i = 0; i < data.size(); i++) {
            j += Math.pow(data.get(i), pangkat);
        }
        return j;
    }

    static void printManeh(ArrayList<Integer> hasil) {
        for (int i = 0; i < hasil.size(); i++) {
            System.out.print(hasil.get(i) + " ");
        }
        System.out.println("");
    }
}
