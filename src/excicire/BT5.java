package excicire;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** Đề bài: Viết một chương trình Java để tìm kiếm một phần tử trong một mảng số nguyên bằng thuật toán tìm kiếm nhị phân.
 * Nếu phần tử không được tìm thấy trong mảng, chương trình sẽ ném ngoại lệ.*/

public class BT5 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm kiếm: ");
        int number = scanner.nextInt();
        findSearch(arr, number);
    }
public  static void findSearch(int[] arr, int number){
    try {
        int low = 1, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == number) {
                System.out.println("Vi tri tim thay " + mid);
                return;
            }
            else if (arr[mid] < number)
                low = mid + 1;
            else
                high = mid - 1;
        }
        throw new Exception();
    } catch (Exception e){
        System.out.println("Khong co trong mang");
    }
}
}


