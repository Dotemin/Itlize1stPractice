
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String addToString= baseValue + valueToBeAdded;
        return addToString;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String reverse = new StringBuffer(valueToBeReversed).reverse().toString();
        return reverse;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        Integer stringLength = word.length() ;
        Integer middle = stringLength/2 ;
        Character c = word.charAt(middle);
        return c;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String space="";
        char[] length= value.toCharArray();
        StringBuilder str= new StringBuilder();
        for(char ch: length){
            if(ch!=charToRemove){
            str.append(ch);
        }
        }
        space= str.toString();
        return space;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int length=sentence.length();
        String str="";
        for(int i=length-1; i>0; i--){
            if(sentence.charAt(i) == ' '){
            str = sentence.substring(i+1);
            break;
        }
        }
        return str;
    }
}
