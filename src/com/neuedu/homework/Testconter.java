package com.neuedu.homework;

import java.util.Scanner;

public class Testconter {
    /* 属性变量 */
    private double width;//长方形的宽度
    private double length;//长方形的高度

    /* 利用 width 和 length 创建构造方法 */
    public Testconter(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /* 不带参数的构造方法 */
    public Testconter() {
    }

    // get和set方法
    /* 成员变量对应的方法 */
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /* 输出长方形的长宽信息 */
    public void output() {
        System.out.println("长方形的长为：" + length);
        System.out.println("长方形的宽为：" + width);
        System.out.println("长方形的面积为：" + area());
        System.out.println("长方形的周长为：" + perimeter());
    }

    /* 计算长方形的周长 */
    public double perimeter() {
        return 2 * (width + length);
    }

    /* 计算长方形的面积 */
    public double area() {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        double length = scanner.nextDouble();
        System.out.println("请输入长方形的宽：");
        double width = scanner.nextDouble();
        // 利用构造方法创建一个 Rectangle 类型的对象
        Testconter rectangle = new Testconter(width, length);
        // 调用 output 方法
        rectangle.output();
    }
}