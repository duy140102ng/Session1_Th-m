import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int length = sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int width  = sc.nextInt();
        int perimeter  = (length + width) * 2;
        int acreage = length * width;;
        System.out.println("Chu vi của hình chữ nhật là: " +perimeter);
        System.out.println("Diện tích của hình chữ nhật là: " +acreage);
    }
}
