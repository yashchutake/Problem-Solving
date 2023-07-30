package HundreadQChallenge.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a = { 2, 5, 7, 8, 9, 1, 3, 56, 2, 3 };
        List<Integer> dub = findDub(a);
        System.out.println(dub);
    }

    public static List<Integer> findDub(int[] a) {
        List<Integer> dub = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && !dub.contains(a[i])) {
                    dub.add(a[i]);
                }
            }
        }
        return dub;
    }
}

