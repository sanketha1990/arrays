package com.uttara.ds.practice;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConvertMapToArrayListByLamda {

    public static void main(String[] args) {

        Map<String,String> hashMap=new HashMap();
        hashMap.put("1","Sanketh");
        hashMap.put("2","Sanketh");
        hashMap.put("3","Sanketh");
        hashMap.put("4","Sanketh");
        hashMap.put("5","Sanketh");
        hashMap.put("6","Sanketh");
        hashMap.put("7","Sanketh");

        Predicate
        ArrayList<String> keyList=hashMap.keySet().stream().collect(Collectors.toCollection(ArrayList::new));

        ArrayList<String> valueList=hashMap.values().stream().collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Key List = "+keyList);
        System.out.println("Value List = "+valueList);
    }
}
