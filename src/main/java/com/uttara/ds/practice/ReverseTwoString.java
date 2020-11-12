package com.uttara.ds.practice;

public class ReverseTwoString {

    public static void main(String[] args) {
        String s1="Sanketh";
        String s2="Cr";

        System.out.println("Before reverse S1 = "+s1+"  S2= "+s2);

        s1=s1.concat(s2);
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println("After reverse s1 "+s1+" s2 "+s2);
    }
}
