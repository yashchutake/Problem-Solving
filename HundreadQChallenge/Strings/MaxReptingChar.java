package Strings;

// For a given string s find the character c (or C) with longest consecutive repetition and return:

// Object[]{c, l};
// where l (or L) is the length of the repetition. If there are two or more characters with the same l return the first in order of appearance.

// For empty string return:

// Object[]{"", 0}
// Happy coding! :)


import java.util.*;


public class MaxReptingChar {
     public static Object[] findLongestConsecutiveRepetition(String s) {
        if (s.isEmpty()) {
            return new Object[]{"", 0};
        }

        char longestChar = s.charAt(0);
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == s.charAt(i - 1)) {
                currentLength++;
                if (currentLength > maxLength) {
                    longestChar = currentChar;
                    maxLength = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }

        return new Object[]{Character.toString(longestChar), maxLength};
    }

    public static void main(String[] args) {
        String input = "aabbbccccc";
        Object[] result = findLongestConsecutiveRepetition(input);
        System.out.println("Character: " + result[0] + ", Length: " + result[1]);
    }
}
