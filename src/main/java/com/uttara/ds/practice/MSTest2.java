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


 class MSTest2 {
        /*
         * Complete the 'numberOfConnections' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY gridOfNodes as parameter.
         */

        public static int numberOfConnections(List<List<Integer>> gridOfNodes) {
            // Write your code here
            int count = 0;
            int m =0;
            int i =0;
            List<Integer> val = new ArrayList<>();
            Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
            while(i < gridOfNodes.size()){
               int c = 0;
                List<Integer> li = gridOfNodes.get(i);
                for (int k=0;k<li.size();k++) {
                    if(li.get(k) == 1){
                        c++;
                    }
                }
                if(c>0){
                    hm.put(m, c);
                    m++;
                }

            i++;
            }

            List<Integer> Listofvalues= new ArrayList<>(hm.values());
            for(int h = 0;h< Listofvalues.size()-1;h++){
                count = count+(Listofvalues.get(h)*Listofvalues.get(h+1));
            }

            return count;
        }

    }

class SolutionMSTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int gridOfNodesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int gridOfNodesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> gridOfNodes = new ArrayList<>();

        IntStream.range(0, gridOfNodesRows).forEach(i -> {
            try {
                gridOfNodes.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = MSTest2.numberOfConnections(gridOfNodes);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}