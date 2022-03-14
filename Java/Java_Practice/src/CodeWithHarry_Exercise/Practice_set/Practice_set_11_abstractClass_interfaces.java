package CodeWithHarry_Exercise.Practice_set;

// ? 1. Create an abstract class pen with methods write () and refill () as abstract methods 
// ? 2. Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()

abstract class StrandedPen {
    abstract void write(String text);

    abstract void refill();

}

class Pen extends StrandedPen {
    @Override
    void write(String text) {
        System.out.println("writing " + text);
    }

    void refill() {
        System.out.println("Refilling black ink to the pen...");
    }
}

class FountainPen extends Pen {
    void changeNib(String nib) {
        System.out.println("changing nib to " + nib);
    }
}

// ? 3. Create a class monkey with jump ( ) and bite ( ) methods
// Create a class human which inherits this monkey class and
// implements basic animal interface with eat ( ) and sleep methods
interface Animal {
    void eat(String food);

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("jumping like a monkey...");
    }

    void bite() {
        System.out.println("Biting with 32 teeth");
    }
}

class Human extends Monkey implements Animal {
    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    public void sleep() {
        System.out.println("Sleeping for 6 hour....");
    }
}

public class Practice_set_11_abstractClass_interfaces {
    public static void main(String[] args) {
        // // problem 1
        // Pen blackPen = new Pen();
        // blackPen.write("Programmers are lazy");
        // blackPen.refill();
        // // problem 2
        // FountainPen blackPen = new FountainPen();
        // blackPen.changeNib("italic");
        // // problem 3
        // Human theSavageBoy = new Human();
        // theSavageBoy.eat("burger");
        // theSavageBoy.bite();
        // theSavageBoy.jump();
        // theSavageBoy.sleep();
    }
}
