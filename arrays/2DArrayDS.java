import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int hourglassSum(int[][] arr) {
        SortedSet<Integer> h = new TreeSet<>();
        for (int i = 0; i < 4; i++) { // horizontal loop
            for (int j = 0; j < 4; j++) { // vertical loop
                // hourglass cells
                int h1 = arr[i][j];
                int h2 = arr[i][j+1];
                int h3 = arr[i][j+2];
                int h4 = arr[i+1][j+1];
                int h5 = arr[i+2][j];
                int h6 = arr[i+2][j+1];
                int h7 = arr[i+2][j+2];
                // sum cells
                h.add(h1 + h2 + h3 + h4 + h5 + h6 + h7);
            }
        }
        return h.last();
    }

}
