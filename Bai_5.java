import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán: ");
        float mathPoint = sc.nextFloat();
        System.out.println("Nhập điểm văn: ");
        float literaturePoint = sc.nextFloat();
        System.out.println("Nhập điểm anh: ");
        float englishPoint = sc.nextFloat();
        float totalPoint = mathPoint + literaturePoint + englishPoint;
        float mediumPoint = (float) (Math.round(totalPoint/3 * 100.00) / 100.00);
        System.out.println("Tổng điểm của bạn là: " +totalPoint);
        System.out.println("Điểm trung bình của bạn là: " +mediumPoint);
    }
}
