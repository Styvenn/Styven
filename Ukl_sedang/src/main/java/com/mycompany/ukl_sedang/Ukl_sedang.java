/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl_sedang;


public class Ukl_sedang {


        // method
    public static int hitungTotalTabungan(int tabunganAwal, int kenaikan, int bulan) {
        
        //var
        int totalTabungan = 0;
        int tabungan = tabunganAwal;

        
        // perulangan
        for (int i = 1; i <= bulan; i++) {
            System.out.println("bulan ke-" + i + ": Rp " + tabungan);  
            
        // aritmatika
            totalTabungan += tabungan;  
            tabungan += kenaikan; 
        }

        return totalTabungan;
    }

    public static void main(String[] args) {
        int tabunganAwal = 100000;  
        int kenaikan = 20000; 
        int bulan = 24; 

        // menghitung total tabungan
        int totalTabungan = hitungTotalTabungan(tabunganAwal, kenaikan, bulan);

        System.out.println("Total tabungan setelah " + bulan + " bulan: Rp " + totalTabungan);
    }
}
