package Text;

import java.util.List;

/**
 * Created by Администратор on 10.07.2016.
 */
public class TextRunner {

    public static void main(String[] args) {

        List<Word> list = Sentence.createSentence(new Word("qqq"));
        Text.addText(list, new Word("www"));
        Text.addText(list, new Word("eee"));

        Text.printText(list);
    }
}
