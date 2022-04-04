package w4;

/**
 *
 * @author Cahaya Citra
 */
public class TugasB {
    public static void main(String[] args) {
        System.out.println("\t Do_While ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        int i = 1;
        do {    
            if(Math.pow(2, i) < 100) {
                System.out.printf("  %.0f", Math.pow(2, i));
            }
            i++;
        } while (i <= 100);
        System.out.println("");
    }
}
