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
                    maxKanan--;
                    as.add(bawah(a, x, y));
                    x++;
                }
            } else if (arah == 1) {
                if (x < maxBawah) {
                    as.add(bawah(a, x, y));
                    x++;
                } else if (y > maxKiri) {
                    arah = 2;
                    maxBawah--;
                    as.add(kiri(a, x, y));
                    y--;
                }
            } else if (arah == 2) {
                if (y > maxKiri) {
                    as.add(kiri(a, x, y));
                    y--;
                } else if (x > maxAtas) {
                    arah = 3;
                    maxKiri++;
                    as.add(atas(a, x, y));
                    x--;
                }
            } else if (arah == 3) {
                if (x > maxAtas) {
                    as.add(atas(a, x, y));
                    x--;
                } else if (y < maxKanan) {
                    arah = 0;
                    maxAtas++;
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

    static int[][] generateMatrixSpiral(int n) {
        int i = 1;
        int a[][] = new int[n][n];
        int maxAtas = 1;
        int maxKanan = n - 1;
        int maxBawah = n - 1;
        int maxKiri = 0;
        int arah = 0; // 0>kanan;1=>bawah,2=>kiri,3=>atas
        int x = 0;
        int y = -1;
        for (int j = 0; j < n * n; j++) {
            if (arah == 0) {
                if (y < maxKanan) {
                    a[x][++y] = i;
                } else if (x < maxBawah) {
                    arah = 1;
                    maxKanan--;
                    a[++x][y] = i;
                }
            } else if (arah == 1) {
                if (x < maxBawah) {
                    a[++x][y] = i;
                } else if (y > maxKiri) {
                    arah = 2;
                    maxBawah--;
                    a[x][--y] = i;
                }
            } else if (arah == 2) {
                if (y > maxKiri) {
                    a[x][--y] = i;
                } else if (x > maxAtas) {
                    arah = 3;
                    maxKiri++;
                    a[--x][y] = i;
                }
            } else if (arah == 3) {
                if (x > maxAtas) {
                    a[--x][y] = i;
                } else if (y < maxKanan) {
                    arah = 0;
                    maxAtas++;
                    a[x][++y] = i;
                }
            }
            i++;
        }
        return a;
    }

    public static int maxAreaOfIsland(int[][] grid) {
        ArrayList<ArrayList<int[]>> asuu = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !udahDiPake(asuu, i, j)) {
                    ArrayList<int[]> as = anu(grid, new ArrayList<int[]>(), i, j);
                    asuu.add(as);
                }
            }
        }
        return asuu.size();
    }

    /**
     * fix
     *
     * @param grid
     * @param hasil
     * @param x
     * @param y
     * @return
     */
    public static ArrayList<int[]> anu(int[][] grid, ArrayList<int[]> hasil, int x, int y) {
        if (grid[x][y] == 0) {
            return null;
        }
        if (!udahDiPake2(hasil, x, y)) {
            int pos[] = {x, y};
            hasil.add(pos);
        }
        if (kiriAdaGak(grid, x, y)) {
            if (!udahDiPake2(hasil, x, y - 1)) {
                hasil = anu(grid, hasil, x, y - 1);
            }
        }
        if (atasAdaGak(grid, x, y)) {
            if (!udahDiPake2(hasil, x - 1, y)) {
                hasil = anu(grid, hasil, x - 1, y);
            }
        }
        if (kananAdaGak(grid, x, y)) {
            if (!udahDiPake2(hasil, x, y + 1)) {
                hasil = anu(grid, hasil, x, y + 1);
            }
        }
        if (bawahAdaGak(grid, x, y)) {
            if (!udahDiPake2(hasil, x + 1, y)) {
                hasil = anu(grid, hasil, x + 1, y);
            }
        }
        return hasil;
    }

    public static boolean udahDiPake(ArrayList<ArrayList<int[]>> total, int x, int y) {
        for (int i = 0; i < total.size(); i++) {
            for (int j = 0; j < total.get(i).size(); j++) {
                if (x == total.get(i).get(j)[0] && total.get(i).get(j)[1] == y) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * fix
     *
     * @param total
     * @param x
     * @param y
     * @return
     */
    public static boolean udahDiPake2(ArrayList<int[]> total, int x, int y) {
        for (int j = 0; j < total.size(); j++) {
            if (x == total.get(j)[0] && total.get(j)[1] == y) {
                return true;
            }
        }
        return false;
    }

    public static boolean kiriAdaGak(int[][] grid, int x, int y) {
        if (y > 0) {
            if (grid[x][y - 1] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean atasAdaGak(int[][] grid, int x, int y) {
        if (x > 0) {
            if (grid[x - 1][y] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean bawahAdaGak(int[][] grid, int x, int y) {
        if (x < grid.length - 1) {
            if (grid[x + 1][y] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean kananAdaGak(int[][] grid, int x, int y) {
        if (y < grid[0].length - 1) {
            if (grid[x][y + 1] == 1) {
                return true;
            }
        }
        return false;
    }
}
