package com.uttara.ds.practice;

public class TestFinalKey {

    private final int testVariable;

    public TestFinalKey(int x){
        testVariable=x;
        System.out.println("Constructor testVariable ");
    }

    public static void main(String[] args) {
        TestFinalKey sr=new TestFinalKey(10);
    }
}
