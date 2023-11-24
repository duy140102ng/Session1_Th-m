import java.time.Year;
import java.util.Scanner;

public class Bai_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm sinh của bạn: ");
        int year  = sc.nextInt();
        int ageNow = Year.now().getValue();
        int age = ageNow - year;
        System.out.println("Tuổi của bạn là: " +age);
        String check = (age % 2 == 0) ? "Tuổi của bạn là chẵn!" : "Tuổi của bạn là lẻ!";
        System.out.println(check);
    }
}
