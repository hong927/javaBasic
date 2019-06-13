package com.neuedu.work;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        /*set  特点  无序  放入顺序和存储的顺序不同*/
        /*不能存储重复元素
        * hashcode   进行配列*/
        Set<String> sets = new HashSet<>();
        sets.add("中文");
        sets.add("sdfs");
        sets.add("11111");

        /*有一个list集合   如何把list集合中的重复元素去掉？*/

        for (String str : sets){
            /*hashset   hash 算法*/
            System.out.println(str.hashCode());
            System.out.println(str);
        }
    }

}
