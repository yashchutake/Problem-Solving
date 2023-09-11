package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public  static void main(String[] args) {
        System.out.println(generate(5));
        
    }
    public static List<List<Integer>> generate(int numRows) {
        if(numRows==0){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 1; i <=numRows; i++) {
            List<Integer> row=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if(j==0 || j==i-1){ //first and last always 1
                    row.add(1);
                }
                else{// cal for middle ones
              row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
               
            }
             result.add(row); //1 ,2 ,3 ,4 ,5
        }
        return result;
    }
}
