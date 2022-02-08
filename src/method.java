import java.util.Scanner;

public class method {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        double r = sc.nextByte();
        convert(r);
    }

    // ex1
    public static void casting(byte b) {

        short s = b;
        System.out.println(b + " " + s);
        int i = s;
        System.out.println(i);
        long g = i;
        System.out.println(g);
        float m = g;
        System.out.println(m);
        double n = m;
        System.out.println(n);
    }

    //ex2
    public static void casting(double c) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextByte();

        System.out.println(a);
        float s = (float) a;
        System.out.println(s);
        long i = (long) s;
        System.out.println(i);
        long g = i;
        System.out.println(g);
        float m = g;
        System.out.println(m);
        double n = m;
        System.out.println(n);
    }

    //ex3
    public static void convert(double Fahrenheit) {


        double Celsius = (Fahrenheit - 32) * 5 / 9;

        System.out.println("result" + " " + Celsius);
        float s = (float) Celsius;
        System.out.println("result" + " " + s);
        int a = (int) s;
        System.out.println("result" + " " + a);
    }

    //ex4
    public static void area(double r) {
        double PI = Math.PI;
        double s = PI * r * r;
        double p = 2 * PI * r;
        System.out.println("area" + s);
        System.out.println("perimeter" + p);

    }

    //ex5
    public static void expression(String[] args) {
        System.out.println((double) 1 / 3);
        System.out.println((float) 1 / 3);

    }

    //ex6
    public static void bird(char a) {
        char char1 = 'A';
        char char2 = 'r';
        char char3 = 'a';
        int year = 1996;
        System.out.print(char1);
        System.out.print(char2);
        System.out.print(char3);
        System.out.println(year);
    }

    //ex7
    public static void charcast(String[] args) {
        char ch = 's';
        int a = (int) ch;
    }

    //ex8
    public static double average() {
        char char1 = 'A';
        char char2 = 'r';
        char char3 = 'a';

        double avg = (char1 + char2 + char3) / 3d;
        System.out.println(avg);
        return avg;
    }

    //ex10
    public static void Define(String[] args) {
        String st1 = "abc";
        String st2 = "def";
        String res = st1 + st2;
    }

    //ex11
    public static void concatente(String[] args) {

    }

    //ex12
    public static void print() {

        System.out.println("We are the so-called \"Vikings\" from the north.");
    }
}
