package com.neuedu.homework;
//平润年
import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        long year = input.nextLong();
        //闰年需要满足的条件：能被4整除但不能被100整除，或者能被400整除，满足其中一个即可
        if((year%4==0 && year%100!=0) || year%400==0 ){
            System.out.println(year+"年是闰年！");
       }else{
            System.out.println(year+"年是平年！");
        }
    }
}


