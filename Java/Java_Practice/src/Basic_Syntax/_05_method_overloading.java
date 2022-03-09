package Basic_Syntax;

class _05_method_overloading {
    static void sayHello() {
        System.out.println("Hello there!");
    }

    static void sayHello(int n) {
        System.out.println("Hi there from int world " + n);
    }

    static void sayHello(float n) {
        System.out.println("Welcome to float world " + n);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello(50);
        sayHello(50.54f);
    }
}