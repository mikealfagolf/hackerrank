import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        int pairs = 0;
        Set<Integer> match = new HashSet<>();
        for (int i : ar) {
            if (!match.contains(i)) {
                match.add(i);
            } else {
                match.remove(i);
                pairs++;
          }
        }
        return pairs;
    }
}
