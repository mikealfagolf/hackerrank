import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    static int[] rotLeft(int[] a, int d) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.rotate(list, d*-1); // negative int rotates the list to the left
        return list.stream().mapToInt(i->i).toArray();
    }

}
