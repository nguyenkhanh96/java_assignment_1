/**
 * Lession_1
 */
public class Lession_1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = a;

        System.out.println("Trước khi hoán đổi");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = b;
        b = c;

        System.out.println("Sau khi hoán đổi");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}