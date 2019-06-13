package com.neuedu.work;

import java.util.ArrayList;

public class SuoYin {
    public static void main(String[] args) {
          ArrayList<Integer> arrayList = new ArrayList<>();
              arrayList.add(1);
              arrayList.add(2);
              arrayList.add(6);
              arrayList.add(4);
              arrayList.add(9);

            System.out.println("索引值为:"+listTest(arrayList,4));
          }
   public static int  listTest(ArrayList<Integer> al, Integer s){

             for (int i = 0; i < al.size(); i++) {
                 if (al.get(i)==s)
                          return i;
               }
               return -1;
   }
}
