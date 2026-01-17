package CoreProgramming.Strings.Level_3;
class FrequencyUsingUnique {

    static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (text.charAt(i) == text.charAt(j))
                    unique = false;

            if (unique) temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    static String[][] frequency(String text) {
        char[] unique = uniqueChars(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++)
                if (unique[i] == text.charAt(j))
                    count++;

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }
}
