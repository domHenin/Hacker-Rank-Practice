package com.hackerrank.practices.JavaLoopsOne;

import java.util.Scanner;

public class LoopsOneMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("to GOD all glory!");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

    }
}
//
//Task
//        Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
//
//        Input Format
//
//        A single integer, .
//
//        Constraints
//
//        Output Format
//
//        Print  lines of output; each line  (where ) contains the  of  in the form:
//        N x i = result.
//
//        Sample Input
//
//        2
//        Sample Output
//
//        2 x 1 = 2
//        2 x 2 = 4
//        2 x 3 = 6
//        2 x 4 = 8
//        2 x 5 = 10
//        2 x 6 = 12
//        2 x 7 = 14
//        2 x 8 = 16
//        2 x 9 = 18
//        2 x 10 = 20
