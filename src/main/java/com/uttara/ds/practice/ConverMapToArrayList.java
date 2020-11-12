package com.uttara.ds.practice;

import java.util.*;

public class ConverMapToArrayList {

    public static void main(String[] args) {
        Map<String,String> hashMap=new HashMap();
        hashMap.put("1","Sanketh");
        hashMap.put("2","Sanketh");
        hashMap.put("3","Sanketh");
        hashMap.put("4","Sanketh");
        hashMap.put("5","Sanketh");
        hashMap.put("6","Sanketh");
        hashMap.put("7","Sanketh");

        System.out.println("HashMap = "+hashMap);

        Set<Map.Entry<String,String>> set=hashMap.entrySet();
        List<String> list=new ArrayList(set);

        System.out.println("List = "+list);
    }
}
