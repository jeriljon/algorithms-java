package algorithms.staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This is a staircase of size n = 4
 *       #
 *     # #
 *   # # #
 * # # # #
 *
 *  Its base and height are both equal to n. It is drawn using # symbol and spaces.
 *  The last line is not preceded by any spaces.
 *  Write a program that prints a staircase of size n. i.e. Complete the function staircase
 *  staircase function has a parameter: integer n
 *  Constraints: 0 < n <= 100
 */

class Result {

    // Pseudocode:
    // Print n lines
    // every line will have n -1 spaces, and n symbols

    public static void staircase(Integer n) {
        Boolean checkConstraint = (n > 0) && (n <= 100);
        if(checkConstraint) {
            StringBuilder output = new StringBuilder();
            for(int i = 0; i < n; i++) {
                output.append(" ".repeat(n - (i + 1)));
                output.append("#".repeat(i + 1));
                System.out.println(output);
                output.setLength(0);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Result.staircase(n);
        bufferedReader.close();
    }
}