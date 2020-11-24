package com.uttara.ds.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class MSTest1 {

    /*
     * Complete the 'gameWinner' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING colors as parameter.
     */

    public static String gameWinner(String colors) {
        // Write your code here

        int count = 0;

        String winner = "";
        int i =0;

        while(i<colors.length() - 2)
        {
            if(colors.charAt(i) == colors.charAt(i+1) &&  colors.charAt(i+1)== colors.charAt(i+2)){
                if(count % 2 == 0  && String.valueOf(colors.charAt(i+1)).equalsIgnoreCase("w")){
                    count++;
                    colors = colors.substring(0,i+1)+ colors.substring(i+2, colors.length());

                }else if(count % 2 != 0  && String.valueOf(colors.charAt(i+1)).equalsIgnoreCase("b")){
                    count++;
                    colors = colors.substring(0,i+1)+ colors.substring(i+2, colors.length());

                }

            }
            i++;
            if(i>colors.length() - 2 && (checkPattern(colors))){
                i =0;
            }
        }

        if(count %2 != 0){
            winner ="wendy";
        }else{
            winner ="bob";
        }


        return winner;

    }

    private static boolean checkPattern(String colors) {
        String regex = "\\b([a-zA-Z0-9])\\1\\1+\\b";
        Pattern p = Pattern.compile(regex);
        if (colors == null) {
            return false;
        }
        Matcher m = p.matcher(colors);
        return m.matches();
    }

}

class Solution345 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String colors = bufferedReader.readLine();

        String result = MSTest1.gameWinner(colors);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
