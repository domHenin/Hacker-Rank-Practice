package com.hackerrank.practices.Java_OneD_Array;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        scan.close();

        // Prints each sequential element in array a
        for (int i=0; i< a.length; i++) {
            System.out.println(a[i]);
        }
    }
}


//TODO:
// Task
// ..
// The code in your editor does the following:
// ..
// Reads an integer a(i) from stdin and saves it to a variable, n, denoting some number of integers.
// Reads n integers corresponding to a(0), a(1),.... from stdin and saves each integer a(i) to a variable, val.
// Attempts to print each element of an array of integers named a.
// Write the following code in the unlocked portion of your editor:
// ..
// Create an array, a, capable of holding n integers.
// Modify the code in the loop so that it saves each sequential value to its corresponding location in
// the array. For example, the first value must be stored in a(0), the second value must be stored in a(1), and so on.
// ..
//        Good luck!
// ..
//        Input Format
// ..
//        The first line contains a single integer, n, denoting the size of the array.
//        Each line i of the n subsequent lines contains a single integer denoting the value of element a(i).
// ..
//        Output Format
// ..
//        You are not responsible for printing any output to stdout. Locked code in the editor loops through array a
//        and prints each sequential element on a new line.
// ..
//        Sample Input
//        5
//        10
//        20
//        30
//        40
//        50
// ..
//        Sample Output
//        10
//        20
//        30
//        40
//        50
// ..
//        Explanation
//        When we save each integer to its corresponding index in a,
//        we get a = [10, 20, 30, 40, 50] . The locked code prints each array element on a new
//        line from left to right.