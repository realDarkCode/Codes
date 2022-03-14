package OOP;

abstract class Phone {

    abstract void ringTone();

    abstract void calculator();

    void turnOn() {
        System.out.println("Turning on the phone....");
    }

    void turnOff() {
        System.out.println("Turing off the phone....");
    }
}

class Nokia extends Phone {
    @Override
    void ringTone() {
        System.out.println("*'playing nokia ringtone'");
    }

    @Override
    void calculator() {

    }

    void breakFloor() {
        System.out.println("Breaking floor using nokia....");
    }

}

public class abstract_method {
    public static void main(String[] args) {
        Nokia nokia3310 = new Nokia();
        nokia3310.turnOn();
        nokia3310.calculator();
        nokia3310.ringTone();
    }
}
