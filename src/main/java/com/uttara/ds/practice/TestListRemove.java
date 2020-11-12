package com.uttara.ds.practice;

import java.util.ArrayList;
import java.util.List;

public class TestListRemove {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(-3);
        list.add(90);
        list.add(-2);

        /*for(Integer num:list){
            if(num < 0){
                list.remove(num);
            }
        }*/
        System.out.println("Before remove list = "+list);
        list.removeIf(num -> num < 0);

        //list.remove(num);

        System.out.println("After remove list = "+list);

    }
}

