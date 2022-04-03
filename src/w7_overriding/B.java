package w7_overriding;

/**
 *
 * @author Fachry
 */
public class B extends A {
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar();
        System.out.println("Method Milik class B dipanggil");
    }
}
