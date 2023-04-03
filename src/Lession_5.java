import java.util.Scanner;

public class Lession_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a : ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b : ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị của c : ");
        double c = sc.nextDouble();

        if (a > b && a > c) {
            System.out.println("Giá trị lớn nhất là " + a);
        } else if (b > a && b > c) {
            System.out.println("Giá trị lớn nhất là " + b);
        } else {
            System.out.println("Giá trị lớn nhất là " + c);
        }
    }
}
