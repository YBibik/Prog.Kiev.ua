package Book;

import java.util.*;

/**
 * Created by y.bibik on 05.07.2016.
 */
public class BookRunner {

    public static void main(String[] args) {

        List<Book> list = BookAction.createBookList();

        List<Book> listauthor = BookAction.getBooksByAuthor(list, "Author2");
        System.out.println(listauthor);
        List<Book> listpublish = BookAction.getBooksByBublishing(list, "Publishing3");
        System.out.println(listpublish);
        List<Book> listyear = BookAction.getBooksAfterPublishYear(list, 2015);
        System.out.println(listyear);
    }
}
