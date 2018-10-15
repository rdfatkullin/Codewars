package dataReverse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DataReverseStream {

    public static int[] DataReversed(int[] data) {

        byte[] bytData = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            bytData[i] = (byte) data[i];
        }
        InputStream is = new ByteArrayInputStream(bytData);

        ArrayList<Integer> arrInt = new ArrayList<>();
        byte[] buffer = new byte[8];

        int datas = 0;
        try {
            datas = is.read(buffer, 0, 8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (datas != -1) {
            StringBuilder stB = new StringBuilder();
            for (byte b : buffer) {
                stB.append(b);
            }
            arrInt.add(Integer.parseInt(stB.toString(), 2));
            try {
                datas = is.read(buffer, 0, 8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Collections.reverse(arrInt);

        Iterator<Integer> it = arrInt.iterator();
        int i = 0;
        while (it.hasNext()) {
            String byt = Integer.toBinaryString(it.next());
            StringBuilder stB = new StringBuilder();
            stB.append(byt);
            while (stB.toString().length() != 8) {
                stB.insert(0, "0");
            }
            for (char ch : stB.toString().toCharArray()) {
                data[i] = Character.getNumericValue(ch);
                i++;
            }
        }
        return data;
    }



}
