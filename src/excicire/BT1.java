package excicire;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Đề bài:  Viết một chương trình Java để tính tổng của hai số nguyên nhập vào từ bàn phím. Nếu người dùng nhập vào một giá trị không phải số nguyên, chương trình sẽ hiển thị thông báo lỗi và yêu cầu người dùng nhập lại.
 * Hướng dẫn: biểu thức gọi scanner để trong try, catch bắt exeption in ra thông báo và đệ quy lại hàm
 */

// TODO: 29/06/2023 NGuyễn Phi Hùng

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("nhập số thứ nhất");
            int num1 = sc.nextInt();
            System.out.println("nhập số thứ hai");
            int num2 = sc.nextInt();
            sum = num1 + num2;
            System.out.println("kết quả là: " + sum);
            System.out.println("muốn thoát chưa :))) Y/N");
            sc.nextLine();
            String q = sc.nextLine();
            if (q.equals("y")) {
                System.out.println("bye :))");
            } else {
                main(args);
            }
        } catch (Exception e) {
            System.out.println("số bạn nhập không phải số nguyên");
            main(args);
        }

    }
}
