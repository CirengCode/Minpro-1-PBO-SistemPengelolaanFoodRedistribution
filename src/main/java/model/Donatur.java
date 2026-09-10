/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Donatur {
    public int idDonatur;
    public String namaPengelola;
    public String namaInstansi;
    public String jenisInstansi;
    
    
    public Donatur(int idDonatur, String namaPengelola, String namaInstansi, String jenisInstansi){
        this.idDonatur = idDonatur;
        this.namaPengelola = namaPengelola;
        this.namaInstansi = namaInstansi;
        this.jenisInstansi = jenisInstansi;
    }
    
    public static ArrayList<Donatur> dataDonatur = new ArrayList<>();
    
    public static void dataDonatur() {
        dataDonatur.add(new Donatur(1, "Budi Santoso", "Hotel Sejahtera", "Hotel"));
        dataDonatur.add(new Donatur(2, "Siti Rahma", "Restoran Makmur", "Restoran"));
        dataDonatur.add(new Donatur(3, "Andi Wijaya", "Dapur Berkah", "Usaha Kuliner"));
    }
    
    public static void tableData() {
        System.out.println("------------------------------------");
        System.out.println("============= DONATUR ==============");
        System.out.println("------------------------------------");

        for (Donatur d: dataDonatur) {
            System.out.println("ID Donatur: " + d.idDonatur);
            System.out.println("Nama Pengelola: " + d.namaPengelola);
            System.out.println("Nama Instansi: " + d.namaInstansi);
            System.out.println("Jenis Instansi: " + d.jenisInstansi);
            System.out.println("------------------------------------");
        }
                
    }
    
    public static void dataDonatur(Scanner scanner){
        boolean berjalanDonatur = true;
                    
        while (berjalanDonatur){
            
            tableData();
    
            System.out.println("[1] Tambah");
            System.out.println("[2] Update");
            System.out.println("[3] Hapus");
            System.out.println("[4] Keluar");
            System.out.println(">> ");
            
            int pilihanDonatur = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihanDonatur){
                case 1 -> {
                                                    // tambah
                    System.out.print("ID Donatur: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean idAda = false;

                    for (int i = 0; i < dataDonatur.size(); i++) {
                        if (dataDonatur.get(i).idDonatur == id) {
                            idAda = true;
                        }
                    }
                    
                    if (idAda) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Donatur sudah dipakai -__-!]");
                        System.out.println("------------------------------------");
                    }else {
                        System.out.print("Nama Pengelola: ");
                        String namaPengelola = scanner.nextLine();

                        System.out.print("Nama Instansi: ");
                        String namaInstansi = scanner.nextLine();

                        System.out.print("Jenis Instansi: ");
                        String jenisInstansi = scanner.nextLine();
                        
                        dataDonatur.add(new Donatur(
                                id,
                                namaPengelola,
                                namaInstansi,
                                jenisInstansi
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil ditambahkan ^^]");
                        System.out.println("------------------------------------");
                    }
          

                }
                
                case 2 -> {
                    System.out.print("ID Donatur: ");
                    int idDonatur = scanner.nextInt();
                    scanner.nextLine();
                    
                    int index = -1;
                    
                    for (int i = 0; i < dataDonatur.size(); i++) {
                        if (dataDonatur.get(i).idDonatur == idDonatur) {
                            index = i;
                        }
                    }
                    
                    if (index == -1){
                        System.out.println("------------------------------------");
                        System.out.println("[ID Donatur tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {
                        System.out.print("Nama Pengelola: ");
                        String namaPengelola = scanner.nextLine();

                        System.out.print("Nama Instansi: ");
                        String namaInstansi = scanner.nextLine();

                        System.out.print("Jenis Instansi: ");
                        String jenisInstansi = scanner.nextLine();
                        
                        dataDonatur.set(index, new Donatur(
                                idDonatur,
                                namaPengelola,
                                namaInstansi,
                                jenisInstansi
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Update ^^]");
                        System.out.println("------------------------------------");
                    }
                }
                
                case 3 -> {
                    System.out.print("ID Donatur: ");
                    int idDonatur = scanner.nextInt();
                    scanner.nextLine();
                    
                    int index = -1;
                    
                    for (int i = 0; i < dataDonatur.size(); i++) {
                        if (dataDonatur.get(i).idDonatur == idDonatur) {
                            index = i;
                        }
                    }
                    
                    if (index == -1){
                        System.out.println("------------------------------------");
                        System.out.println("[ID Donatur tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {
                        dataDonatur.remove(index);
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Hapus ^^]");
                        System.out.println("------------------------------------");
                    }
                }
                
                case 4 -> {
                    berjalanDonatur = false;
                }
                
                default -> System.out.println("Mohon maaf, pilihan tidak valid! T-T");
                
                }
            }
        }
    

}


