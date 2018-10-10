package helpBookseller;

public class HelpBook {

    public String bookCounter(String[] l, String[] m) {
        StringBuilder strB = new StringBuilder();
        int countZeroes = 0;
        for (String mChar : m) {
            int count = 0;
            for (String lChar : l) {
                if (lChar.startsWith(mChar)) {
                     count += Integer.parseInt(lChar.split(" ")[1]);
                }
            }

            /*Terrible solution for that test 5. They wanted us to return empty string
             *if no books detected instead of (A : 0) - (B : 0)... etc for no actual reason.
             */
            if (count == 0) {
                if (++countZeroes == m.length) {
                    return "";
                }
            }

            //Generating output with StringBuilder
            strB.append("(")
                .append(mChar)
                .append(" : ")
                .append(count);
            if (mChar.equals(m[m.length-1])){
                strB.append(")");
            }   else {
                strB.append(") - ");
            }
        }

        return strB.toString();
    }
}
