package com.neuedu.homework;

import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        int b = 0;
        if (a>=0){
            b+= a%10;
            a = a/10;
        }
        b+=a;
        if (b%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }

    }
}
