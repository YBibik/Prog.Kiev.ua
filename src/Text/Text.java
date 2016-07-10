package Text;

import java.util.*;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class Text {

    public static void addText(List<Word> list, Word word) {
        list.add(word);
    }

    public static void printText(List<Word> list) {
        String text = "";
        for (Word word : list) {
            text += word.getWord() + " ";
        }
        System.out.println(text);
    }
}
