import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int number = sc.nextInt();
        double square = Math.pow(number, 2);
        System.out.println("Bình phương của " +number+ " là: " +square);
    }
}
