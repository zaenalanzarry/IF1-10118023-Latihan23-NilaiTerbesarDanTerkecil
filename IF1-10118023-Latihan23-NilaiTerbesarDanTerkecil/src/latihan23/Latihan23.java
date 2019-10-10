/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan23;

import java.util.Scanner;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Nilai Terbesar dan Terkecil
 */

public class Latihan23 {

   
    public static void main(String[] args) {
         
        //kamus lokal
        String petugas;
        int i, mahasiswa;
        int terkecil = 100;
        int terbesar = 0;
        int [] nilai = new int [10];
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = input.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        mahasiswa = input.nextInt();
        
        for (i = 1; i <= mahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = input.nextInt();
        
            if(nilai[i] > terbesar ){
                terbesar = nilai[i];
            }
            if (nilai[i] < terkecil ){
                terkecil = nilai[i]; 
            }
        } 
    
 
        System.out.println("");
        System.out.println("==========Hasil Nilai Mahasiswa==========");
        for (i = 1; i <= mahasiswa; i++){
            System.out.println("Nilai Mahasiswa Ke-" + i + " = " + nilai[i]);
            
        }
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        System.out.println("");
        System.out.println("Petugas : " + petugas);
        System.out.println("");
        System.out.println("Developed by : Zaenal Anzarry");
    } 
}
