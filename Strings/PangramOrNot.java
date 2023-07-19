package Strings;

public class PangramOrNot {
    public static void main(String[] args) {
        checkIfPangram("Yash Chutake ahe me");
    }
    // public static boolean checkIfPangram(String sentence) {
    //     int freq[]=new int[26];
    //     for (char c : sentence.toCharArray()) {
    //          freq[c-'a']+=1;
    //         //System.out.println( freq[c-'a']+=1);
    //     }
    //     return true;
    // }

    public static boolean checkIfPangram(String sentence) {
        int [] freq = new int [26];
        
        for (char c : sentence.toCharArray()) {
            freq[c - 'a'] += 1;
        }
        
        for (int i = 0; i < 26; i++) if (freq[i] == 0) return false;
        
        return true;
    }
}
