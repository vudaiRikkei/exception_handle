package excicire;

public class Bt2 {
    public static void main(String[] args) {
        int [] numbers = {};
        try{
            int max = findMaxNumber(numbers);
            System.out.println("số lớn nhất là: " + max);
        }catch (
               ArrayIndexOutOfBoundsException e
        ){
            System.out.println("Lỗi là:  " + e.getMessage());
            e.printStackTrace();
        }


    }
    public static int findMaxNumber(int [] arrays) throws ArrayIndexOutOfBoundsException {
        if (arrays.length == 0 ){
            throw new ArrayIndexOutOfBoundsException("Mảng rỗng");
        }
        int max = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (
                    max < arrays[i]
            )
                max = arrays[i];
        }
        return max;
    }
}
