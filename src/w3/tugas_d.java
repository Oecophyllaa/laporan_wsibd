package w3;

import java.util.Scanner;

/**
 *
 * @author Oecophylla
 */
public class tugas_d {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------");
        System.out.println("\t Kharisma Agung Plaza < KAP > \t\t");
        System.out.println("\t   Promo Belanja Berhadiah \t\t\t");
        System.out.println("      Khusus Pembelian 5 Barang Pertama \t\t");
        System.out.println("       Dengan harga minimum Rp 10000,00 \t\t");
        System.out.println("----------------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pembeli: ");
        String nama = sc.nextLine();
        
        System.out.print("\nMasukkan harga barang ke-1    : ");
        int brg1 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-2    : ");
        int brg2 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-3    : ");
        int brg3 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-4    : ");
        int brg4 = sc.nextInt();
        System.out.print("Masukkan harga barang ke-5    : ");
        int brg5 = sc.nextInt();
        
        int totalHrg = brg1 + brg2 + brg3 + brg4 + brg5;
        System.out.printf("Total harga pembelian atas nama %s adalah Rp %d \n\n", nama, totalHrg);
        System.out.println("Selamat....");
        System.out.println("Anda mendapat hadiah 1 buah mug cantik \n");
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t Terima Kasih \t\t");
        System.out.println("  Anda sudah belanja di Kharisma Agung Plaza  ");
    }
}
