package OOP;

interface Gamer {

    void sleep();

    void playGame();
}

interface Programmer {
    void doCode();

    void sleep();
}

class Person implements Gamer, Programmer {
    public void sleep() {
        System.out.println("Sleeping for 6 hours");
    }

    public void playGame() {
        System.out.println("Playing Counter Strike Global Offence");
    }

    public void doCode() {
        System.out.println("Programmers Solve real life problems using machine");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Person coolHuman = new Person();
        coolHuman.doCode();
        coolHuman.playGame();
        coolHuman.doCode();
    }
}
