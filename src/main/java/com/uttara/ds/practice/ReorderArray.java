package com.uttara.ds.practice;

public class ReorderArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=2;
        int tmpD=d;
        int[] temp=new int[d];
        for (int i:arr){
            System.out.print(i+" , ");
        }

        int j=0;
        while (tmpD!=0){
            temp[j]=arr[j];
            j++;
            tmpD--;
        }
        System.out.println();
        for (int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

        tmpD=d;
        for(int i=tmpD;i<arr.length;i++){
            arr[i-tmpD]=arr[i];
        }
        System.out.println("Final array");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
        int l=0;
       while(tmpD!=0){
            arr[arr.length-tmpD]=temp[l];
            l++;
            tmpD--;
        }
        System.out.println("\n"+arr.length);

        System.out.println("Final array");
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }
}
