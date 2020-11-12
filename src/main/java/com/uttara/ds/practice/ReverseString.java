package com.uttara.ds.practice;

public class ReverseString {
    public static void main(String[] args) {
        String str="Abc";
        String temp="";
        for(int i=str.length();i>=0;i--){
            temp+=str.charAt(i);
        }
        System.out.print("Rev value = "+temp);
    }
}
