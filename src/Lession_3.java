import java.util.Scanner;

public class Lession_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập giá trị của a : ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b : ");
        double b = sc.nextDouble();

        double x = -b / a;
        System.out.print("Giá trị của x = " + x);
    }
}
