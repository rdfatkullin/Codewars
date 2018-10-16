package nextSmaller;

import java.util.Arrays;
import java.util.TreeSet;

public class NextSmallerPermutation {



    public static long nextSmaller(long n) {
        TreeSet<Long> set = new TreeSet<>();

        String line = Long.toString(n);

        char[] lineChar = line.toCharArray();
        StringBuilder stB = new StringBuilder();

        //We are ignoring zeroes that located in between two equal digits. This is for quick solution find, info below
        for (int i = 0; i < lineChar.length; i++) {
            if (lineChar[i] == '0' && i != 0 && i != lineChar.length - 1) {
                if (lineChar [i - 1] == lineChar [i + 1]) {
                    continue;
                }
            }
            stB.append(lineChar[i]);
        }

        //We are ignoring zeroes that located in between two equal digits
        char[] sort = line.replaceAll("0", "").toCharArray();
        Arrays.sort(sort);

        //If all numbers will be in ascending order, there is no point to try to find the solution. Checking it
        if (new String(sort).equals(stB.toString())) {
            return -1;
        }

        //We are searching for solution. We will start at lower digits at first
        for (int i = line.length()-1; i >= 0; i--) {
            String scope = line.substring(i, line.length());
            String remain = line.substring(0, i);
            permutation(scope.toCharArray(), 0, set, Long.parseLong(scope), remain);

            //Checking if solution was found
            if (set.size() != 0) {
                return set.last();
            }
        }

        //If there is no solution - returning -1
        return -1;

    }

    //This is recursive method for creating all numbers from given digit array
    public static void permutation(char[] chAr, int index, TreeSet set, long n, String remain) {

        //last iteration
        if(index == chAr.length - 1) {
            Long result = Long.parseLong(new String(chAr));
            if (result < n) {
                result = Long.parseLong(remain + result.toString() );

                //Result found! Adding it for later checking.
                if (chAr[0] != '0') {
                    set.add(result);
                }
            }
            return;
        }

        //iteration cycle
        for (int i = index; i < chAr.length; i++) {
            char buf = chAr[index];
            chAr[index] = chAr[i];
            chAr[i] = buf;

            permutation(chAr, index+1, set, n, remain);

            buf = chAr[index];
            chAr[index] = chAr[i];
            chAr[i] = buf;
        }
    }
}
