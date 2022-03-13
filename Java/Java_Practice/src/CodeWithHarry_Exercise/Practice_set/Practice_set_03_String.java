package CodeWithHarry_Exercise;

public class Practice_set_03_String {
    static void problem1() {
        // ? Write a Java program to convert a string to lowercase.
        String str = "HELLO WORLD";
        String strLowerCase = str.toLowerCase();
        System.out.println(strLowerCase);
    }

    static void problem2() {
        // ? Write a Java program to replace spaces with underscores.
        String str = "This is my string";
        String strResult = str.replace(" ", "_");
        System.out.println(strResult);
    }

    static void problem3() {
        // ? Write a Java program to fill in a letter template which looks like below:
        // * letter = “Dear <|name|>, Thanks a lot”
        // * Replace <|name|> with a string (some name)
        String ltr = "Dear <|name|>, Thanks a lot";
        String name = "DarkCode";
        String output = ltr.replace("<|name|>", name);
        System.out.println(output);
    }

    static void problem4() {
        // ? Write a Java program to detect double and triple spaces in a string.
        String str = "Hello there,   this String  contains multiple spaces   please help me out";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }

    static void problem5() {
        // ? Write a program to format the following letter using escape sequence
        // characters.
        // * Letter = “Dear Harry, This Java Course is nice. Thanks”
        String Letter = "Dear Harry,\n\tThis Java Course is nice.\nThanks";
        System.out.println(Letter);
    }

    public static void main(String[] args) {
        // problem1();
        // problem2();
        // problem3();
        // problem4();
        problem5();
    }
}
