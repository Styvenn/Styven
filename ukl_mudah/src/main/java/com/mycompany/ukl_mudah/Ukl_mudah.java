/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl_mudah;

import java.util.Scanner;

public class Ukl_mudah {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: Rp ");
        
        //var
        double totalBelanja = scanner.nextDouble();
        double diskon = 0;

        System.out.println("Apakah anda mempunyai kartu? (ya/tidak)");
        String kartumember = scanner.next().toLowerCase();
       // percabangan   
      if (kartumember.equals("ya")) {
        if (totalBelanja < 100000) {
            diskon = 0;  
        } else if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = 0.10;  
        } else {
            diskon = 0.20;  
        }
        } else {    
                diskon = 0;
                }
        
        // aritmatika
        double totalSetelahDiskon = totalBelanja - (totalBelanja * diskon);

        // menampilkan hasil
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Total setelah diskon: Rp " + totalSetelahDiskon);

        scanner.close();
    }
}

        