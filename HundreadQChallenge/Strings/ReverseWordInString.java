package Strings;
import java.util.*;
public class ReverseWordInString {
    public static void main(String[] args) {
        
        //MY TRIED ONE
        // String s="Yash Chutake Ahe Me";
        // String temp="";
        // for (int i =s.length()-1; i >=0 ; i--) {
        //     char c=s.charAt(i);
        //     temp=temp+c;
        // }
        // System.out.println(temp);
     
        // String temp2=" ";
        // //tring Word="";
        // String ans="";
        // StringBuilder Word=new StringBuilder();
        // StringBuilder Wordtill=new StringBuilder();
        // for (int i =0; i <temp2.length() ; i++) {
        //     //Wordtill=Wordtill.append(temp.charAt(i));
        //     Wordtill=Wordtill.append(temp2.charAt(i));
        //     char c=temp2.charAt(i);
        //     if (c==' ') {
        //      Word=Wordtill.reverse();
        //      ans=ans+Word;
        //     }
        // }
        // System.out.println(ans);



        String s="Yash Chutake Ahe Me ";
        char[] ans=reverseWorld(s.toCharArray());
        // reverse(carr, 0, s.length()-1);
        System.out.println(ans);
    }
    
    private static char[] reverseWorld(char[] s) {
        int start=0;
        for (int end = 0; end < s.length; end++) {
            if (s[end]==' ') {
                reverse(s, start, end);//indiv
                start=end+1;
            }
        }
        reverse(s, start, s.length-1); //last one
        reverse(s, 0, s.length-1); //ENTIRE ONE
        return s;
    }

    public static void reverse(char[] s,int start,int end){
        char temp;

        while(start <= end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    //   return Arrays.toString(s).;
    
    }
}
