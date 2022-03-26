package w3;

import java.util.Scanner;

/**
 *
 * @author Oecophylla
 */
public class tugas_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("      CAFE CERIA  ");
        System.out.println("    ANEKA MINUMAN    ");
        System.out.println("-----------------------");
        System.out.println("    SPECIAL MENU : ");
        System.out.println("   1. Soft drinks ");
        System.out.println("   2. Mix juice ");
        System.out.println("   3. Nescafe ");
        System.out.println("   4. Soda milk ");
        System.out.println("   5. Tea ");
        System.out.println("-----------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = sc.nextLine();
        
        System.out.print("\nSilahkan masukkan pilihan anda : ");
        int menu = sc.nextInt();
        
        switch(menu) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
                break;
                
            default:
                System.out.println("Menu tidak tersedia!");
                break;
        }
    }
}
