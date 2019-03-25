package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static boolean hasVowels(String word) {

        char [] characters = word.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(isVowel(characters[i])){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {

        char [] characters = word.toCharArray();
        for(int i = 0; i < characters.length; i++){
            if(isVowel(characters[i])){
                return i; } }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {

        char [] characters = word.toCharArray();
        char firstChar = characters[0];
        return isVowel(firstChar);
    }

    public static Boolean isVowel(Character character) {

        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            char vowel = vowels[i];
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
