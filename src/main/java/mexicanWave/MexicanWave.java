package mexicanWave;

public class MexicanWave {

    public static String[] wave(String str) {

        //Returning empty array if string is empty
        if (str.isEmpty()) {
            return new String[] {};
        }

        //Creating resulting array with length according to the task
        String[] wave = new String[str.replaceAll(" ", "").length()];

        char[] chars = str.toCharArray();

        //Using double iterator, because two arrays may have different length
        int j = 0;
        for (int i = 0; i < chars.length; i++) {

            //Checking if that character is a whitespace
            if (Character.toString(chars[i]).equals(" ")) {
                continue;
            }

            chars[i] = Character.toUpperCase(chars[i]);
            wave [j] = new String(chars);
            chars[i] = Character.toLowerCase(chars[i]);
            j++;
        }
        return wave;
    }
}