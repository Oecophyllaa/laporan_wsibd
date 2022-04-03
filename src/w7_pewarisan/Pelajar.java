package w7_pewarisan;

/**
 *
 * @author Fachry Rizky Prasetya
 */
public class Pelajar extends Orang {
    private String nim;
    private String asalPerguruan;
    private double nilai; 

    public Pelajar(String nama, double tinggi, double berat, String nim, String perguruan, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalPerguruan = perguruan;
        this.nilai = nilai;
    } 
    public String toString(){
        return (super.toString()+"\nNIM : " +nim+"\nPerguruan Tinggi : " + this.asalPerguruan +"\nNilai : " + this.nilai);
    }
}
