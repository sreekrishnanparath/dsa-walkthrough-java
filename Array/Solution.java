package dsa.Array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    
    int size = candles.size();
    Collections.sort(candles);
    List<Integer> result = new ArrayList<>();
    List<Integer> miss = new ArrayList<>();
    int count = candles.get(size-1);
    System.out.println("top#"+count);
    System.out.println("size#"+size);
    if(size>0){
        for(int i=0;i<size;i++){
            if(count==candles.get(i)){
                result.add(candles.get(i));
            }else{
                miss.add(candles.get(i));
            }
        }
    }
    //
    
    System.out.println(result.size());
    //System.out.println(result);
    return result.size();

    }

}

public class Solution {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] candlesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> candles = new ArrayList<>();

        for (int i = 0; i < candlesCount; i++) {
            int candlesItem = Integer.parseInt(candlesTemp[i]);
            candles.add(candlesItem);
        }

        int result = Result.birthdayCakeCandles(candles);
        
        

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
