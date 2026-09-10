/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Penyaluran {
    public int idPenyaluran;
    public int idDonasi;
    public int idPenerima;
    public int jumlahPorsi;
    public String petugas;
    
    public Penyaluran(int idPenyaluran, int idDonasi, int idPenerima, int jumlahPorsi, String petugas){
        this.idPenyaluran = idPenyaluran;
        this.idDonasi = idDonasi;
        this.idPenerima = idPenerima;
        this.jumlahPorsi = jumlahPorsi;
        this.petugas = petugas;
    }
    
    public static ArrayList<Penyaluran> dataPenyaluran = new ArrayList<>();
    
    public static void dataPenyaluran(){
        dataPenyaluran.add(new Penyaluran(1, 1, 1, 20, "Relawan"));
        dataPenyaluran.add(new Penyaluran(2, 1, 2, 10, "Petugas Komunitas"));
        dataPenyaluran.add(new Penyaluran(3, 2, 3, 20, "Relawan"));
    }
    
    public static void tableData(){
        System.out.println("--------------------------------------");
        System.out.println("============= PENYALURAN ==============");
        System.out.println("--------------------------------------");

        for (Penyaluran penyaluran : dataPenyaluran) {
            System.out.println("ID Penyaluran: " + penyaluran.idPenyaluran);
            System.out.println("ID Donasi: " + penyaluran.idDonasi);
            System.out.println("ID Penerim: " + penyaluran.idPenerima);
            System.out.println("Jumlah Posri: " + penyaluran.jumlahPorsi);
            System.out.println("Petugas: " + penyaluran.petugas);
            System.out.println("------------------------------------");
        }
    }
    
    public static void dataPenyaluran(Scanner scanner){
        boolean berjalanPenyaluran = true;

        while (berjalanPenyaluran) {
            
            tableData();

            System.out.println("[1] Tambah");
            System.out.println("[2] Update");
            System.out.println("[3] Hapus");
            System.out.println("[4] Keluar");
            System.out.print(">> ");

            int pilihanPenyaluran = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanPenyaluran) {
                case 1 -> {
                    System.out.print("ID Penyaluran: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean idAda = false;

                    for (int i = 0; i < dataPenyaluran.size(); i++) {
                        if (dataPenyaluran.get(i).idPenyaluran == id) {
                            idAda = true;
                        }
                    }

                    if (idAda) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penyaluran sudah dipakai -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        System.out.print("ID Donasi: ");
                        int idDonasi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("ID Penerima: ");
                        int idPenerima = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jumlah Porsi: ");
                        int jumlahPorsi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jenis Petugas: ");
                        String jenisPetugas = scanner.nextLine();

                        dataPenyaluran.add(new Penyaluran(
                                id,
                                idDonasi,
                                idPenerima,
                                jumlahPorsi,
                                jenisPetugas
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil ditambahkan ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 2 -> {
                    System.out.print("ID Penyaluran: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataPenyaluran.size(); i++) {
                        if (dataPenyaluran.get(i).idPenyaluran == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penyaluran tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        System.out.print("ID Donasi: ");
                        int idDonasi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("ID Penerima: ");
                        int idPenerima = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jumlah Porsi: ");
                        int jumlahPorsi = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jenis Petugas: ");
                        String jenisPetugas = scanner.nextLine();

                        dataPenyaluran.set(index, new Penyaluran(
                                idTarget,
                                idDonasi,
                                idPenerima,
                                jumlahPorsi,
                                jenisPetugas
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Update ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 3 -> {
                    System.out.print("ID Penyaluran: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataPenyaluran.size(); i++) {
                        if (dataPenyaluran.get(i).idPenyaluran == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penyaluran tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        dataPenyaluran.remove(index);
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Hapus ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }

                case 4 -> {
                    berjalanPenyaluran = false;
                }

                default -> System.out.println("Mohon maaf, pilihan tidak valid! T-T");
            }

        }
    }
    
}
