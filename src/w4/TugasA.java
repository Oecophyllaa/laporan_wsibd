package w4;

import java.util.Scanner;

/**
 *
 * @author Cahaya Citra
 */
public class TugasA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal : ");
        int batasAwal = sc.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = sc.nextInt();
        
        System.out.printf("\nBilangan Genap dari %d hingga %d : \n", batasAwal, batasAkhir);
        for(int i = batasAwal; i <= batasAkhir; i++) {
            if(i % 2 == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("");
    }
}
