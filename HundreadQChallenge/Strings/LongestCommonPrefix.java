package Strings;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        // {"yash","ashish","chutaske"} {"apple", "ape", "april"};
        String [] a= {"apple", "ape", "april"};
        String Lpre=LogestPre(a);
        // Arrays.sort(a);
        System.out.println(Arrays.toString(a));
         System.out.println(Lpre);
    }

    private static String LogestPre(String[] a) {
        int size=a.length;
        if (size==0) {
            return " ";
        }
        if (size==1) {
            return a[0];
        }
        Arrays.sort(a);
        
        //FIND MIN LEN 1 AND LAST
        int end=Math.min(a[0].length(),a[size-1].length());
        //System.out.println("MINLen="+end);

        //FIND COMMON PRE
        int i=0;
        while (i<end && a[0].charAt(i)==a[size-1].charAt(i)) {
            i++;//pre length
        }

        String pre=a[0].substring(0, i); //ans
        return pre;
        //ok
    }
}
