package com.neuedu.work;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SuiJiShu {
    public static void main(String[] args) {
        double[] doubleArr = new double[10];
        List<Double> list = new ArrayList<Double>();
        stroeRandomNumber(doubleArr);
        storeInList(list, doubleArr);
        System.out.println(list);
        System.out.println("=================");
    }

    public static void storeInList(List<Double> list, double[] doubleArr) {
        for (double d : doubleArr) {
            if (d >= 10)
                list.add(d);
            System.out.println(d);
        }
    }
    public static void stroeRandomNumber(double[] doubleArr) {
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            doubleArr[i] = 1 + rand.nextDouble() * 100;// 生成[1.0-100.0]之间的随机数
        }
    }

}
