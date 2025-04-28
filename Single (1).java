class Mammal {
    void life() {
        System.out.println("Parent Class");
    }
}

class Huamn extends Mammal {
    void breathe() {
        System.out.println("Child Class");
    }
}

public class Single {
    public static void main(String[] args) {
        Human dapo = new Human();
        dapo.life();
        dapo.breathe();
    }
}