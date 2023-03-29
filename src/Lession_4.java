import java.util.Scanner;

public class Lession_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá trị của a : ");
        double a = sc.nextDouble();

        System.out.print("Nhập giá trị của b : ");
        double b = sc.nextDouble();

        System.out.print("Nhập giá trị của c : ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;
        double x1;
        double x2;
        
        if (delta > 0 && a != 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0 && a != 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
