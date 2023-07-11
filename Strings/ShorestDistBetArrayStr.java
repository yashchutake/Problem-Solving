package Strings;

import java.util.*;

public class ShorestDistBetArrayStr {
    public static void main(String[] args) {
        String[] strarr = { "the", "quick", "brown", "fox", "quick" };
        // int n = shortestDistance(strarr, "the", "quick");
        System.out.println(shortestDistance2(strarr, "the", "fox"));
    }

    static int shortestDistance2(String[] s, String word1, String word2) {
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        // Traverse the string
        for (int i = 0; i < s.length; i++) {
            if (s[i] == word1)
                d1 = i;
            if (s[i] == word2)
                d2 = i;
            if (d1 != -1 && d2 != -1)
                ans = Math.min(ans, Math.abs(d1 - d2));
        }

        // Return the answer
        return ans;
    }

    static int shortestDistance(String[] s, String w1, String w2) {
        int d1 = -1, d2 = -1;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == w1) {
                d1 = i;
            }
            if (s[i] == w2) {
                d2 = i;
            }
            if (d1 != -1 && d1 != -1) {
                ans = Math.min(ans, Math.abs(d1 - d2));
            }
        }
        return ans;
    }

}
