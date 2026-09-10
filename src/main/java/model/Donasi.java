/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Donasi {
    public int idDonasi;
    public int idDonatur;
    public String namaMakanan;
    public int jumlahPorsi;
    public String statusKelayakan;
    
    public Donasi(int idDonasi, int idDonatur, String namaMakanan, int jumlahPorsi, String statusKelayakan){
        this.idDonasi = idDonasi;
        this.idDonatur = idDonatur;
        this.namaMakanan = namaMakanan;
        this.jumlahPorsi = jumlahPorsi;
        this.statusKelayakan = statusKelayakan;
    }
    
    public static ArrayList<Donasi> dataDonasi = new ArrayList<>();
    
    public static void dataDonasi() {
        dataDonasi.add(new Donasi(1, 1, "Muffin", 30, "Layak"));
        dataDonasi.add(new Donasi(2, 2, "Sapi Lada Hitam", 20, "Layak"));
        dataDonasi.add(new Donasi(3, 3, "Ayam Bistik", 15, "Menunggu Pemeriksaan"));        
    }

    public static void tableData(){
        System.out.println("------------------------------------");
        System.out.println("============== DONASI ==============");
        System.out.println("------------------------------------");

        for (Donasi donasi : dataDonasi) {
            System.out.println("ID Donasi: " + donasi.idDonasi);
            System.out.println("ID Donatur: " + donasi.idDonatur);
            System.out.println("Nama Makanan: " + donasi.namaMakanan);
            System.out.println("Jumlah Porsi: " + donasi.jumlahPorsi);
            System.out.println("Status Kelayakan: " + donasi.statusKelayakan);
            System.out.println("------------------------------------");
        }
    }
    
    public static void dataDonasi(Scanner scanner){
        boolean berjalanDonasi = true;

        while (berjalanDonasi) {

            tableData();

            System.out.println("[1] Tambah");
            System.out.println("[2] Update");
            System.out.println("[3] Hapus");
            System.out.println("[4] Keluar");
            System.out.print(">> ");

            int pilihanDonasi = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanDonasi) {
                case 1 -> {
                    System.out.print("ID Donasi: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean idAda = false;

                    for (int i = 0; i < dataDonasi.size(); i++) {
                        if (dataDonasi.get(i).idDonasi == id) {
                            idAda = true;
                        }
                    }

                    if (idAda) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Donasi sudah dipakai -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        System.out.print("ID Donatur: ");
                        int idDonatur = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nama Makanan: ");
                        String namaMakanan = scanner.nextLine();

                        System.out.print("Jumlah Porsi: ");
                        int jumlahPorsi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Status Kelayakan: ");
                        String statusKelayakan = scanner.nextLine();

                        dataDonasi.add(new Donasi(
                                id,
                                idDonatur,
                                namaMakanan,
                                jumlahPorsi,
                                statusKelayakan
                        ));

                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil ditambahkan ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 2 -> {
                    System.out.print("ID Donasi: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataDonasi.size(); i++) {
                        if (dataDonasi.get(i).idDonasi == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("[ID Donasi tidak ada -__-!]");
                    } else {

                        System.out.print("ID Donatur: ");
                        int idDonatur = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Nama Makanan: ");
                        String namaMakanan = scanner.nextLine();

                        System.out.print("Jumlah Porsi: ");
                        int jumlahPorsi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Status Kelayakan: ");
                        String statusKelayakan = scanner.nextLine();

                        dataDonasi.set(index, new Donasi(
                                idTarget,
                                idDonatur,
                                namaMakanan,
                                jumlahPorsi,
                                statusKelayakan
                        ));

                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Update ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 3 -> {
                    System.out.print("ID Donasi: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataDonasi.size(); i++) {
                        if (dataDonasi.get(i).idDonasi == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("[ID Donasi tidak ada -__-!]");
                    } else {

                        dataDonasi.remove(index);

                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Hapus ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 4 -> {
                    berjalanDonasi = false;
                }

                default -> System.out.println("Mohon maaf, pilihan tidak valid! T-T");
            }

        }
    }
}
