package com.neuedu.work;

public class Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }


    public  Student(){}
    public Student(String   name, int    age, int score, String    classNum){
        this.name=name;
        this.age=age;
        this.classNum=classNum;
        this.score=score;
    }
}
