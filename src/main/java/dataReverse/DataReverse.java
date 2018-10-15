package dataReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DataReverse {

    public static int[] DataReversed(int[] data) {
        System.out.println("Input is:" + Arrays.toString(data));

        StringBuilder stB = new StringBuilder();

        int countBytes = 0;
        for (int i : data) {

            if (countBytes == 8) {
                countBytes = 0;
                stB.append("/");
            }

            stB.append(i);
            countBytes++;
        }

        List<String> list = Arrays.asList(stB.toString().split("/"));
        Collections.reverse(list);

        Iterator<String> it = list.iterator();
        int[] dataOutput = new int[data.length];
        int i = 0;
        while (it.hasNext()) {
            String byt = it.next();
            for (char ch : byt.toCharArray()) {
                dataOutput[i] = Character.getNumericValue(ch);
                i++;
            }
        }
        System.out.println("Output is:" + Arrays.toString(dataOutput));
        return dataOutput;
    }

}
