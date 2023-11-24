import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int number1 = sc.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int number2 = sc.nextInt();
        System.out.println("Nhập số thứ ba: ");
        int number3 = sc.nextInt();
        int numberMax = Math.max(Math.max(number1, number2), number3);
        int numberMin = Math.min(Math.min(number1, number2), number3);
        System.out.println("Số lớn nất trong ba số là: " +numberMax);
        System.out.println("Số nhỏ nhất trong ba số là: " + numberMin);
    }
}
