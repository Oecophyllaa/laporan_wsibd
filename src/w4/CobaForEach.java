package w4;

/**
 *
 * @author Cahaya Citra
 */
public class CobaForEach {
    public static void main(String[] args) {
        // membuat array 
        int angka[] = {3,1,42,24,12};
        
        // menggunakan perulangan For Each untuk menampilkan angka 
        for(int x : angka) {
            System.out.print(x + " ");
        }
    }
}
