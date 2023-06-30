package excicire;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử mảng :");
        int n = getInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ: " + (i + 1));
            int x = getInt();
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("bạn nhập không đúng kiểu số nguyên, vui lòng nhập lại");
            return getInt();
        }
    }

}
