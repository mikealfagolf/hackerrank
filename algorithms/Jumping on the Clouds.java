import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int cloudsJumped = 0;
        int totalClouds = c.length;
        while (cloudsJumped < totalClouds - 1) {
            // enough clouds for a double jump and target cloud is valid
            if (cloudsJumped + 2 < totalClouds && c[cloudsJumped + 2] == 0) {
                // jump over 2 clouds
                jumps++;
                cloudsJumped += 2; 
            } else {
                // jump over just one cloud
                jumps++;
                cloudsJumped++;
            }
        }
        return jumps;
    }

}
