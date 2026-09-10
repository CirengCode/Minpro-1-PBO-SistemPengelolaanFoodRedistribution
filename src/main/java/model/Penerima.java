/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Penerima {
    public int idPenerima;
    public String namaPengelola;
    public String namaLembaga;
    public String jenisLembaga;
    
    public Penerima( int idPenerima, String namaPengelola, String namaLembaga, String jenisLembaga){
        this.idPenerima = idPenerima;
        this.namaPengelola = namaPengelola;
        this.namaLembaga = namaLembaga;
        this.jenisLembaga = jenisLembaga;
    }
    
    public static ArrayList<Penerima> dataPenerima = new ArrayList<>();
    
    public static void dataPenerima(){
        dataPenerima.add(new Penerima(1, "Ibu Rina Sugianti", "Panti Asuhan Kasih Ibu", "Panti Asuhan"));
        dataPenerima.add(new Penerima(2, "Pak Rahman Budiono", "Yayasan Harapan Bersama", "Yayasan Sosial"));
        dataPenerima.add(new Penerima(3, "Ibu Sari Mujiyati", "Rumah Singgah Pelita", "Rumah Singgah"));
    }
    
    public static void tableData() {
        System.out.println("-------------------------------------");
        System.out.println("============= PENERIMA ==============");
        System.out.println("-------------------------------------");

        for (Penerima penerima : dataPenerima) {
            System.out.println("ID Penerima: " + penerima.idPenerima);
            System.out.println("Nama Pengelola: " + penerima.namaPengelola);
            System.out.println("Nama Lembaga: " + penerima.namaLembaga);
            System.out.println("Jenis Lembaga: " + penerima.jenisLembaga);
            System.out.println("------------------------------------");
        }
                
    }
    
    public static void dataPenerima(Scanner scanner){
        boolean berjalanPenerima = true;
        
        while (berjalanPenerima) {
            
            tableData();
            
            System.out.println("[1] Tambah");
            System.out.println("[2] Update");
            System.out.println("[3] Hapus");
            System.out.println("[4] Keluar");
            System.out.print(">> ");

            int pilihanPenerima = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihanPenerima) {
                case 1 -> {
                    System.out.print("ID Penerima: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    boolean idAda = false;

                    for (int i = 0; i < dataPenerima.size(); i++) {
                        if (dataPenerima.get(i).idPenerima == id) {
                            idAda  = true;
                        }
                    }

                    if (idAda) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penerima sudah dipakai -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        System.out.print("Nama Pengelola: ");
                        String namaPengelola = scanner.nextLine();

                        System.out.print("Nama Lembaga: ");
                        String namaLembaga = scanner.nextLine();

                        System.out.print("Jenis Lembaga: ");
                        String jenisLembaga = scanner.nextLine();

                        dataPenerima.add(new Penerima(
                                id,
                                namaPengelola,
                                namaLembaga,
                                jenisLembaga
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil ditambahkan ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }
                
                case 2 -> {
                    System.out.print("ID Penerima: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataPenerima.size(); i++) {
                        if (dataPenerima.get(i).idPenerima == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penerima tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        System.out.print("Nama Pengelola: ");
                        String namaPengelola = scanner.nextLine();

                        System.out.print("Nama Lembaga: ");
                        String namaLembaga = scanner.nextLine();

                        System.out.print("Jenis Lembaga: ");
                        String jenisLembaga = scanner.nextLine();

                        dataPenerima.set(index, new Penerima(
                                idTarget,
                                namaPengelola,
                                namaLembaga,
                                jenisLembaga
                        ));
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Update ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }
                
                case 3 -> {
                    System.out.print("ID Penerima: ");
                    int idTarget = scanner.nextInt();
                    scanner.nextLine();

                    int index = -1;

                    for (int i = 0; i < dataPenerima.size(); i++) {
                        if (dataPenerima.get(i).idPenerima == idTarget) {
                            index = i;
                        }
                    }

                    if (index == -1) {
                        System.out.println("------------------------------------");
                        System.out.println("[ID Penerima tidak ada -__-!]");
                        System.out.println("------------------------------------");
                    } else {

                        dataPenerima.remove(index);
                        
                        System.out.println("------------------------------------");
                        System.out.println("[Yay! Data berhasil di-Hapus ^^]");
                        System.out.println("------------------------------------");
                    }                    
                }
                
                case 4 -> {
                    berjalanPenerima = false;
                }
                
                default -> System.out.println("Mohon maaf, pilihan tidak valid! T-T");
            }
            
        }
            



    }
    
    
}
