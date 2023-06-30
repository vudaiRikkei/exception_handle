package excicire;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
      List<Integer> arr =  convet();
        System.out.println(arr);
    }
    public static List<Integer> convet(){
        List<Integer> arrs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi cả chữ lẫn số");
        String word = scanner.nextLine();
        String[] arr = word.split("");
        for (String arr1:arr
        ) {
        try{
            arrs.add(Integer.parseInt(arr1));
            }catch (NumberFormatException e){
            arrs.add(0);
            System.out.println("Nếu là chữ thì sẽ chuyên thành 0");
        }

        }





        return arrs;

    }
}
