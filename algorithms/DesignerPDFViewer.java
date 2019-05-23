import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int designerPdfViewer(int[] h, String word) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        SortedSet<Integer> heights = new TreeSet<>();
        int wordLength = word.length();
        for (int i = 0; i < wordLength; i ++) {
            char letter = word.charAt(i);
            int letterIndex = abc.indexOf(letter);
            int letterHeight = h[letterIndex];
            heights.add(letterHeight);
        }
        return heights.last() * wordLength;
    }

}
