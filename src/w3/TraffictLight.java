package w3;

import java.util.Scanner;

/**
 *
 * @author Oecophylla
 */
public class TraffictLight {
    public static void main(String[] args) {
        
        // membuat variable dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        // mengambil input
        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch(lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah!");
        }
    }
}
