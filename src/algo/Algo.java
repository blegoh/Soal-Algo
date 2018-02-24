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
        // TODO code application logic here
        soal3(3);
    }

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

    public static void soal3(int dadu) {
        dadu(dadu, new ArrayList<Integer>(), 1);
    }

    public static void dadu(int jumlahDadu, ArrayList<Integer> data, int posisi) {
        if (posisi == jumlahDadu) {
            for (int i = 1; i <= 6; i++) {
                data.add(i);
                print(data);
                data.remove(data.size()-1);
            }
        } else {
            for (int i = 1; i <= 6; i++) {
                data.add(i);
                dadu(jumlahDadu, data, posisi+1);
                data.remove(data.size()-1);
            }
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
}
