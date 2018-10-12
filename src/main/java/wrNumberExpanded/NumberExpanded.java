package wrNumberExpanded;

public class NumberExpanded {

    public static String expandedForm(int num) {
        StringBuilder stB = new StringBuilder();
        String number = Integer.toString(num);

        for (int i = 0; i < number.length(); i++) {

            //Getting expanded for each digit
            int expand = Character.getNumericValue(number.charAt(i))*(int)Math.pow(10, (number.length()-1-i));

            //If expanded is zero, ignore it. Also, adding " + " if it is not first digit
            if (expand != 0) {
                if (i != 0) {
                    stB.append(" + ");
                }
                stB.append(expand);
            }
        }
        return stB.toString();
    }
}
