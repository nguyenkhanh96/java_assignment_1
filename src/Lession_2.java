import java.util.Scanner;

public class Lession_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào điểm toán : ");
        double mathPoin = sc.nextDouble();

        System.out.print("Nhập vào điểm lý : ");
        double physicsPoin = sc.nextDouble();

        System.out.print("Nhập vào điểm hoá : ");
        double chemistryPoin = sc.nextDouble();
        
        double mediumScore = ((mathPoin + physicsPoin + chemistryPoin) / 3);
        
        if (mediumScore >= 8) {
            System.out.println("Rank A");
        } else if (mediumScore >= 6.5 && mediumScore < 8) {
            System.out.println("Rank B");
        } else if (mediumScore >= 5 && mediumScore < 6.5) {
            System.out.println("Rank C");
        }  else if (mediumScore < 5) {
            System.out.println("Rank D");
        }
    }
}
