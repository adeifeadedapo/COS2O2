class Mammal {
    void life() {
        System.out.println("Parent Class");
    }
}

class Human extends Mammal {
    void breathe() {
        System.out.println("Child Class");
    }
}

class Ape extends Human {
    void move() {
        System.out.println("Multilevel Child Class");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        Gorilla.move(); // Inherited from Ape
        Gorilla.breathe();  // Inherited from Human
        Gorilla.life();    // Inherited from Mammal
    }
}