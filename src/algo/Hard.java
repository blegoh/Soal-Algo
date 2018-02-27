/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

import static algo.Algo.print;
import java.util.ArrayList;

/**
 *
 * @author blegoh
 */
public class Hard {
    
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
    
    static void powerSum(int X, int N) {
        recursifSum(X, N, new ArrayList<>());
    }

    static void recursifSum(int jumlah, int pangkat, ArrayList<Integer> data) {
        int i = (data.size() == 0) ? 1 : data.get(data.size() - 1) + 1;
        while (Math.pow(i, pangkat) + jum(data, pangkat) <= jumlah) {
            data.add(i);
            if (jum(data, pangkat) == jumlah) {
                Algo.printManeh(data);
            } else {
                recursifSum(jumlah, pangkat, data);
            }
            data.remove(data.size() - 1);
            i++;
        }
    }
    
    static int jum(ArrayList<Integer> data, int pangkat) {
        int j = 0;
        for (int i = 0; i < data.size(); i++) {
            j += Math.pow(data.get(i), pangkat);
        }
        return j;
    }
    
    static void spiral(int a[][]) {
        ArrayList<Integer> as = new ArrayList<>();
        int maxAtas = 1;
        int maxKanan = a[0].length - 1;
        int maxBawah = a.length - 1;
        int maxKiri = 0;
        int arah = 0; // 0>kanan;1=>bawah,2=>kiri,3=>atas
        int x = 0;
        int y = -1;

        for (int i = 0; i < a.length * a[0].length; i++) {
            if (arah == 0) {
                if (y < maxKanan) {
                    as.add(kanan(a, x, y));
                    y++;
                } else if (x < maxBawah) {
                    arah = 1;
                    as.add(bawah(a, x, y));
                    x++;
                }
            } else if (arah == 1) {
                if (x < maxBawah) {
                    as.add(bawah(a, x, y));
                    x++;
                } else if (y > maxKiri) {
                    arah = 2;
                    as.add(kiri(a, x, y));
                    y--;
                }
            } else if (arah == 2) {
                if (y > maxKiri) {
                    as.add(kiri(a, x, y));
                    y--;
                } else if (x > maxAtas) {
                    arah = 3;
                    as.add(atas(a, x, y));
                    x--;
                }
            } else if (arah == 3) {
                if (x > maxAtas) {
                    as.add(atas(a, x, y));
                    x--;
                } else if (y < maxKanan) {
                    arah = 0;
                    as.add(kanan(a, x, y));
                    y++;
                }
            }
        }
        print(as);
    }

    static int kanan(int a[][], int x, int y) {
        return a[x][y + 1];
    }

    static int kiri(int a[][], int x, int y) {
        return a[x][y - 1];
    }

    static int atas(int a[][], int x, int y) {
        return a[x - 1][y];
    }

    static int bawah(int a[][], int x, int y) {
        return a[x + 1][y];
    }
}
