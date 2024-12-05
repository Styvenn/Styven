/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ukl_susah;
    

public class Ukl_susah {
    
    public static void main(String[] args) {
     // array
        int[] array = {3, 3, 3, 1, 7, 7, 5}; 

        // variabel 
        int palingSeringMuncul = 0;
        int nilaiTertinggi = 0;

        // perulangan 
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            
            // perulangan
        for (int j = 0; j < array.length; j++) {
            if (array[i] == array[j]) {
                count++;
                }
            }

            // percabangan
            if (count > palingSeringMuncul) {
                palingSeringMuncul = count;
                nilaiTertinggi = array[i];
            }
        }

        System.out.println("Nilai tertinggi yang paling sering muncul adalah " + nilaiTertinggi + " sebanyak " + palingSeringMuncul + " kali");
    }
}