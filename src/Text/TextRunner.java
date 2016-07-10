package Text;

import java.io.*;
import java.util.List;

/**
 * Created by Администратор on 10.07.2016.
 */
public class TextRunner {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input header: ");
        Text.printHeader(reader.readLine());

        System.out.print("Input 1-st expression: ");
        List<Word> list = Sentence.createSentence(new Word(reader.readLine()));
        System.out.print("Input 2-nd expression: ");
        Text.addText(list, new Word(reader.readLine()));
        System.out.print("Input 3-rd expression: ");
        Text.addText(list, new Word(reader.readLine()));

        System.out.print("Final text string is: ");
        Text.printText(list);
    }
}
