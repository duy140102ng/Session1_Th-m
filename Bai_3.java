import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        float radius = sc.nextFloat();
        final double PI = 3.14;
        double perimeter = (PI * radius *2);
        double acreage = PI * Math.pow(radius, 2);
        System.out.println("Chu vi hình tròn là: " +perimeter);
        System.out.println("Diện tích hình tròn là: " + acreage);
    }
}
