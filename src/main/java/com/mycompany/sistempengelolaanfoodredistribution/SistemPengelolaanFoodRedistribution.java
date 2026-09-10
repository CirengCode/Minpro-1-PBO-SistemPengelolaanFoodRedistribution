/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistempengelolaanfoodredistribution;

import java.util.ArrayList;
import java.util.Scanner;

import model.Donatur;
import model.Donasi;
import model.Penerima;
import model.Penyaluran;

public class SistemPengelolaanFoodRedistribution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Donatur.dataDonatur();
        Donasi.dataDonasi();
        Penerima.dataPenerima();
        Penyaluran.dataPenyaluran();
        
        
        // Menu Utama
        boolean berjalan = true;
        while (berjalan) {
            System.out.println("\n========================================");
            System.out.println("       FOOD REDISTRIBUTION SYSTEM         ");
            System.out.println("========================================");
            System.out.println("[1] Donatur");
            System.out.println("[2] Donasi");
            System.out.println("[3] Penerima");
            System.out.println("[4] Penyaluran");
            System.out.println("[5] Keluar");
            System.out.println(">> ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan) {
                case 1 -> {
                    Donatur.dataDonatur(scanner);
                }
                
                case 2 -> {
                    Donasi.dataDonasi(scanner);
                }
                
                case 3 -> {
                    Penerima.dataPenerima(scanner);
                }
                
                case 4 -> {
                    Penyaluran.dataPenyaluran(scanner);
                }
                
                case 5 -> {
                    System.out.println("--------------------------------------");
                    System.out.println("[Berhasil keluar dari Program O.O]");
                    System.out.println("--------------------------------------");
                    System.exit(0);
                }
                
                default -> System.out.println("Mohon maaf, pilihan tidak valid! T-T");
            }
        }

    }
}
