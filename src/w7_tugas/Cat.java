package w7_tugas;

/**
 *
 * @author Fachry
 */
public class Cat extends Animal {
    public void makeNoise () {
        System.out.println("bark");
        
    }
    public static void main(String[] args) {
        Animal animal = new Animal () ;
        animal.makeNoise();
        Cat cat = new Cat();
        cat.makeNoise () ;
        
        if (animal instanceof Animal)
        System.out.println("animal is Animal");
        if (cat instanceof Animal)
        System.out.println("Cat is Animal");
        if (animal instanceof Cat)
        System.out.println("animal is Cat");
    }
}
