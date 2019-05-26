package com.neuedu.homework;
//回文
import java.util.Scanner;

public class g {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int a = i / 10000;
        int b = i % 10000 / 1000;
        int c = i % 1000 / 100;
        int d = i % 100 / 10;
        int e = i % 10;
        if (i >= 10000 && i <= 99999) {
            if (a == e && b == d) {
                System.out.println("此数是回文数");
            } else {
                System.out.println("不是回文数");

            }
        }
    }
}