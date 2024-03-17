package jsoft;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java " + System.getProperty("java.version"));
        System.out.println(JTools.sum(10));
        System.out.println(JTools.countWhitespaces("Programming is fun!"));
    }
}
