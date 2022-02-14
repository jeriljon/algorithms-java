package std.in.out;

import java.util.ArrayList;
import java.util.Scanner;


// q = 2, a = 4, b = 6,
public class Solution2 {
    public static void main(String[] args) {
        getQueryNumbers(5, 3, 5);

//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        if(t >= 0 && t <= 500){
//            for(int i = 0; i < t; i++){
//                int a = in.nextInt();
//                int b = in.nextInt();
//                int n = in.nextInt();
//
//                int first = a + (int)Math.pow(2, 0) * b;
//                System.out.println();
//            }
//        }
//        in.close();
    }

    // for integers a, b & n, create series >> (a + 2 power 0 x b), (a + 2 pow 0 x b, 2 pow 1 x b)
    // if a = 0, b = 2, n = 10, first = 0 + 1 x 2 = 2, second = 0 + 1 x 2 + 2 x 2 = 6, third = 0 + 1 x 2 + 2 x 2 + 4 x 2 = 14
    // 0, 2, 10 = [2, 6, 14, ......]
    // 5, 3, 5 = [8, 14, 26, 50, 98]
    public static ArrayList<Integer> getQueryNumbers(int a, int b, int n){
        ArrayList<Integer> numbers = new ArrayList<>();
        int queryNumber;
        for(int i = 0; i < n; i++){
            queryNumber = a + (int) Math.pow(2, n);
            System.out.println(queryNumber);
            numbers.add(queryNumber);
        }
        return numbers;
    }
}
