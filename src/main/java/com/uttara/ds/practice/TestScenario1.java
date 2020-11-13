package com.uttara.ds.practice;

public abstract class TestScenario1 {

    public final String s;
    //public final abstract int method1(); #We can't final and abstrct to method and even there is no use at all.
    /*
    * Because once you defined abstract to method you should implement in some or someother
    * class else there is no point in defining abstract without implementing in subclass
    *
    * final and abstract can't go together...
    * */

    public TestScenario1(){
        s="Rajkumar";
    }

 //   public static final String testVar; // We can't initilize static varible in Constructor

  /*  public TestScenario1(){
        testVar="";
    }*/


    public static void main(String[] args) {

    }


}
