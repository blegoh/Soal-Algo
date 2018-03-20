/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author yusuf
 */
public class Aritmatika {
    
    private int bil1;
    private int bil2;

    public void setBil1(int bil1) {
        this.bil1 = bil1;
    }

    public void setBil2(int bil2) {
        this.bil2 = bil2;
    }
    
    public int getPenjumlahan(){
        return bil1 * bil2;
    }
}
