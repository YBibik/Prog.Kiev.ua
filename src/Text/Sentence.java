package Text;

import java.util.*;

/**
 * Created by y.bibik on 10.07.2016.
 */
public class Sentence extends Word{

    private List<Word> sentence = new ArrayList<Word>();

    public Sentence(String word) {
        super(word);
    }


    public List<Word> getSentence() {
        return sentence;
    }

    public static List<Word> createSentence(Word word) {
        List<Word> list = new ArrayList<Word>();
        list.add(word);
        return list;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + sentence +
                '}';
    }
}
