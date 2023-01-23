//Write a C program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

import java.util.*;

class absolute {
    int n, diff;

    void set() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
    }

    void calc() {
        diff = 51 - n;

//condition
        if (n <= 51) {
            System.out.println("Absolute difference= "+diff);
        }

        if (n > 51) {
            diff = n - 51;
            System.out.println("Difference multiply by 3 = "+(diff * 3));
        }
    }
}

public class absolute_diff {
    public static void main(String[] args) {
        absolute ob = new absolute();
        ob.set();
        ob.calc();

    }
}