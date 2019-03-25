package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        str = str.toLowerCase();

        List<String> theList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                    String a = StringUtils.capitalizeNthCharacter(str, i);
                    theList.add(a); } }
            String[] newArr = new String[theList.size()];
            return theList.toArray(newArr);
    }
}
