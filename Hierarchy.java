class Mammal {
    void life() {
        System.out.println("Parent Class");
    }
}

class Human extends Mammal {
    void breathe() {
        System.out.println("Child CLass");
    }
}

class Animal extends Mammal {
    void move() {
        System.out.println("Child Class");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();

        animal.life(); // Inherited from Mammal
        human.life(); // Inherited from Mammal
    }
}