package com.uttara.ds.practice;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,5,4,8,10};
        int number=8;
        int pos=search(arr,number);
        System.out.println("Found at position "+pos);
    }

    private static int search(int[] arr, int number) {
        int left=0;
        int right=arr.length-1;

        int result=-1;
        while(left<=right){

            if(arr[left] == number){
                result=left;
            }
            if(arr[right] == number) {
                result = right;
            }
            left++;
            right--;

        }
        return result;
    }
}
