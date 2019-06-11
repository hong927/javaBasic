package com.neuedu.work;


import java.util.LinkedList;
import java.util.List;

public class TestWorker {
    public static void main(String[] args) {
        List<Worker>    list=new LinkedList<>();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4  ",25  ,3500));
        list.add(new Worker("wang5 ",22 ,3200 ));
        list.add(1,new Worker("zhao6",24,3300));
        list.remove(3);
        for (Worker worker:list
        ) {
            System.out.println(worker);
        }
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).work();
        }
    }
}

