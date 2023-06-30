package demo;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) {

        try {
            int x = 0;
            int y = 5 / x;
            return;
        }catch (ArithmeticException e){
            int x = 0;
            int y2 = 0 / x;
            System.out.println("B");
        }catch (Exception e1){
            System.out.println("C");
        }finally {
            System.out.println("D");
        }
        System.out.println("E");
    }


}
