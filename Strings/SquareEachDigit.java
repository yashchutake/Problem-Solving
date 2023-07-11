package Strings;

//1 // Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

// Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

// Note: The function accepts an integer and returns an integer.

// Happy Coding!


import java.util.*;

class SquareEachDigit{
public static void main(String[] args) {
    System.out.println(sqaredig(9119));
   
   // System.out.println(9119%10); //last 9
    //System.out.println(9119/10); //rem 911
}

public static int sqaredig(int num){
  
    //9119
    // METHOD 1
     int result=0;
     int multi=1;
     while(num>0){
       int digit=num%10; //last dig 9
       int sq=digit*digit; //81
       result=result+(sq*multi); //0+81=81
       if(digit<=9){ // 38
         multi=multi*10;//100
         continue;
       }
       multi=multi*100;//100
       // multi=multi*100;//100
       num=num/10;// remanig 119
     }

     return result;

    //  yash ashish chutake

    //  kay karu shalkto apan

    //  yash ashish chutake kas kay bhau applya le as jamnar nahi nale basun so that tayar ho jao

     





    // METHOD 2
    // String numStr=String.valueOf(num);
    // StringBuilder result =new StringBuilder();
    // for(char c:numStr.toCharArray()){
    //     int dig=Character.getNumericValue(c);
    //     int sq=dig*dig;
    //     result.append(sq);
    // }
    // return Integer.parseInt(result.toString());



}

}
