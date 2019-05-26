package com.neuedu.homework;

public class o {
    public static void main(String[] args) throws Exception {


    char a = (char)System.in.read();
        if (a>='a'&&a<='z'){
             a-=32 ;
            System.out.println(a);
        }else {
            a+=32;
            System.out.println(a);
        }
    }
}
