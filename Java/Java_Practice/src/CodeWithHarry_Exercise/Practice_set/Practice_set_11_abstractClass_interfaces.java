

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
// ? Create a class human which inherits this monkey class and
// ? implements basic animal interface with eat ( ) and sleep methods
// ? 5. Demonstrate polymorphism using using monkey class from Q3

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

// ? 4. Create a class telephone with ( ) , lift ( ) and disconnected ( )
// ? methods as abstract methods create another class smart telephone and
// ? demonstrate polymorphism
abstract class Telephone {
    abstract void lift();

    abstract void disconnected();
}

class SmartTelephone extends Telephone {
    @Override
    void lift() {
        System.out.println("lifting up telephone");
    }

    @Override
    void disconnected() {
        System.out.println("the call has ended...");
    }

    void takePicture() {
        System.out.println("flash flash, your ugly face is saved to gallery");
    }

    void playMusic() {
        System.out.println("playing 'Silence - Before you exit'");
    }
}

// ? 6. Create an interface TVremote and use it to inherit another interface
// ? smart TVremote
interface TVremote {

    void turnOnTV();

    void turnOffTV();

    void changeChannel();
}

interface SmartTVRemote extends TVremote {
    void sleep();

    void recordProgram();
}

// ? 7. Create a class TV which implements TVremote interface from Q6
class TV implements TVremote {
    @Override
    public void turnOnTV() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void turnOffTV() {
        System.out.println("Turning off the TV");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the channel to BTV");
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
        // // Problem 4
        // Telephone nokia = new SmartTelephone();
        // nokia.lift();
        // nokia.disconnected();
        // // problem 5
        // Animal mashrafi = new Human();
        // mashrafi.sleep();
        // mashrafi.eat("Banana");
        // // problem 6
        // // problem 7

    }
}
