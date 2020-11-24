
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


public class MSTest2 {
    /*
     * Complete the 'numberOfConnections' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY gridOfNodes as parameter.
     */

    public static int numberOfConnections(List<List<Integer>> gridOfNodes) {
        // Write your code here
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<gridOfNodes.size();i++){
            int count=0;
            for(int j=0;j<gridOfNodes.get(i).size();j++){
                System.out.print(gridOfNodes.get(i).get(j));
                if(gridOfNodes.get(i).get(j) == 1) {
                    count++;
                }
            }
            //System.out.println(" i = "+i);
            if(count!=0) {
                map.put(i, count);
            }
            System.out.println(" Map = "+map);
        }
        int res=0;

        ArrayList<Integer> valueList = map.values().stream().collect(Collectors.toCollection(ArrayList::new));
        for(int i=0;i<=valueList.size();i++){
            res+=valueList.get(i);
        }
        System.out.println("Result = "+res);
return 0;
    }
}




    class SolutionMSTest2 {
        public static void main(String[] args) throws IOException {
           /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int gridOfNodesRows = Integer.parseInt(bufferedReader.readLine().trim());
            int gridOfNodesColumns = Integer.parseInt(bufferedReader.readLine().trim());*/

            List<List<Integer>> gridOfNodes = new ArrayList<>();
            List<Integer> node1=new ArrayList<>();
            node1.add(1);
            node1.add(0);
            node1.add(1);
            node1.add(0);
            gridOfNodes.add(node1);

            List<Integer> node2=new ArrayList<>();
            node2.add(0);
            node2.add(0);
            node2.add(1);
            node2.add(0);
            gridOfNodes.add(node2);

            List<Integer> node3=new ArrayList<>();
            node3.add(0);
            node3.add(0);
            node3.add(0);
            node3.add(0);
            gridOfNodes.add(node3);

            List<Integer> node4=new ArrayList<>();
            node4.add(0);
            node4.add(0);
            node4.add(1);
            node4.add(0);
            gridOfNodes.add(node4);

         /*   IntStream.range(0, gridOfNodesRows).forEach(i -> {
                try {
                    gridOfNodes.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });*/

            int result = MSTest2.numberOfConnections(gridOfNodes);

           /* bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();*/
        }
    }


