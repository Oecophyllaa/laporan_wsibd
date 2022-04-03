package w7_pewarisan;

/**
 *
 * @author Fachry Rizky Prasetya
 */
public class Orang {
    private String nama;
    private double tinggi;
    private double berat;
    
    public Orang(String nama, double tinggi, double berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String toString(){
        return ("Nama : " + this.nama + "\nTinggi : " + this.tinggi + "\nBerat : " + this.berat);
    }
}
