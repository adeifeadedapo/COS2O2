interface Mammal {
    void live();
}

interface Human {
    void breathe();
}

class Student implements Mammal, Human {
    public void live() {
        System.out.println("1st Interface");
    }

    public void breathe() {
        System.out.println("2nd Interface");
    }

    void study() {
        System.out.println("Studying");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Student dapo = new Student();
        dapo.live();
        dapo.breathe();
        dapo.study();
    }
}