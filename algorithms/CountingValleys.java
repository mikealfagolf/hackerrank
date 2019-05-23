import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        int valleys = 0;
        int level = 0; // always starts and ends at sea level
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                level++; // step up
            } else if (s.charAt(i) == 'D') {
                level--; // step down
                if (level == -1) {
                    valleys++; // new valley
                }
            }
        }
        return valleys;
    }

}
