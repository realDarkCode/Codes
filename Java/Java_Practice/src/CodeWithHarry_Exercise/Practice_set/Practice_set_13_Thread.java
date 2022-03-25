package CodeWithHarry_Exercise.Practice_set;

// Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.
class WishMe extends Thread {
    WishMe(String name) {
        super(name);

    }

    @Override
    public void run() {

        while (true) {
            System.out.println("Good morning");
        }
    }
}

class GreedUser extends Thread {
    GreedUser(String name) {
        super(name);

    }

    @Override
    public void run() {
        super.run();

        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}
// Question 2: Add a step method in the welcome thread of question 1 to delay
// its execution for 200ms.

// Question 3: Demonstrate gerPriority() and setPriority() methods in Java
// threads.
class PrintThreadName extends Thread {
    PrintThreadName(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            System.out.println("My name is " + this.getName() + " with id of " + this.getPriority());
        }
    }
}

/**
 * Question 4: How do you get the state of a given thread in Java?
 * 
 * Answer 4: getState() method is used to get the state of a given thread in
 * Java.
 * 
 * Question 5: How do you get the reference to the current thread in Java?
 * 
 * Answer 5: currentThread() method is used to reference the current thread in
 * Java.
 */
public class Practice_set_13_Thread {
    public static void main(String[] args) {
        // // problem 1
        // WishMe wm = new WishMe("wish me thread");
        // GreedUser gu = new GreedUser("Greed user");
        // wm.start();
        // gu.start();

        // // problem 3
        PrintThreadName ptn1 = new PrintThreadName("Thread 1");
        PrintThreadName ptn2 = new PrintThreadName("Thread 2");
        PrintThreadName ptn3 = new PrintThreadName("Thread 3");
        PrintThreadName ptn4 = new PrintThreadName("Thread 4");
        PrintThreadName ptn5 = new PrintThreadName("Thread 5");
        ptn3.setPriority(Thread.MAX_PRIORITY);
        ptn1.start();
        ptn2.start();
        ptn3.start();
        ptn4.start();
        ptn5.start();

    }
}