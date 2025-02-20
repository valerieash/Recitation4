public class Recitation4 {

    /**
     * Returns a string generated from word by duplicating
     * each letter in the string based on the character's position. Digits
     * are duplicated by the value of their digit. Any other character
     * considered non-alphanumeric will result in all characters being
     * appended to the result, up to but not including the non-alphanumeric
     * character.
     *
     * @param word a string that is to be exploded
     * @return a string generated from word by duplicating
     *        each letter in the string based on the character's position. Digits
     *        are duplicated by the value of their digit. Any other character
     *        considered non-alphanumeric will result in all characters being
     *        appended to the result, up to but not including the non-alphanumeric
     *        character
     */
    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);

            if (Character.isLetter(ch)) {
                for (int j = 0; j <= index; j++) {
                    sb.append(ch);
                }
            } else if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                for (int d = 0; d < num; d++)
                    sb.append(ch);
            } else {
                sb.append(word.substring(0, index));
            }
        }
        return sb.toString();
    }
}
