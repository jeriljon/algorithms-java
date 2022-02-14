package invidia.test.question5;

// Given code will print

// Choices:
// compilation error will occur. Selected this !!
// Exception was caught
// IndexOutOfBoundsException was caught

public class Main {

    public static void main(String[] args) {
        try {
//            new int[]{1, 2, 3}; // compile error of "not a statement"
            int sum = 0;

            for (int i = 1; i < 4; i++) {
//                sum += arr[i];
                System.out.println("Sum: " + sum);
            }


        } catch (Exception e) {

//        } catch(IndexOutOfBoundsException e) {
//
//        }
        }
    }
}
