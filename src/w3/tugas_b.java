package w3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oecophylla
 */
public class tugas_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Deret Array: ");
        int jmlArr = sc.nextInt();
        
        int arr[] = new int[jmlArr];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10 - 1 + 1) + 1;
            System.out.printf("%d, ", arr[i]);
        }
    }
}
