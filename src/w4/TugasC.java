package w4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cahaya Citra
 */
public class TugasC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan banyaknya data nilai = ");
        int data = sc.nextInt();
        int nilai[] = new int[data];
        
        for(int i = 1; i <= data; i++) {
            System.out.printf("Masukkan data nilai ke-%d = ", i);
            nilai[i-1] = sc.nextInt();
        }
        
        int length = nilai.length;
        int sum = 0;
        for(int i = 0; i < nilai.length; i++) {
            sum += nilai[i];
        }
        double avg = sum / length;
        
        Arrays.sort(nilai);
        System.out.println("\nNilai minimum = " + nilai[0]);
        System.out.println("Nilai maximum = " + nilai[nilai.length - 1]);
        System.out.printf("Nilai rata ratanya adalah = %.0f \n", avg);
    }
}
