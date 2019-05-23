package com.neuedu;

public class test {


    public static void main(String[] args) {
        int i = 538;
        int m = 0;
        while (i != 0) {
            m = i % 10;
            System.out.print(m);
            i = i / 10;
        }
    }
}
