package Book;

import java.util.*;

/**
 * Created by y.bibik on 05.07.2016.
 */
public class BookAction {

    public static List<Book> createBookList()
    {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book()
                .setId(1)
                .setName("Book1")
                .setAuthor("Author1")
                .setPublishing("Publishing1")
                .setPublishyear(2015)
                .setPagecnt(200)
                .setPrice(1000)
                .setBindtype("Soft bing"));

        list.add(new Book()
                .setId(2)
                .setName("Book2")
                .setAuthor("Author2")
                .setPublishing("Publishing2")
                .setPublishyear(2016)
                .setPagecnt(300)
                .setPrice(2000)
                .setBindtype("Hard bing"));

        list.add(new Book()
                .setId(3)
                .setName("Book3")
                .setAuthor("Author2")
                .setPublishing("Publishing3")
                .setPublishyear(2016)
                .setPagecnt(150)
                .setPrice(2500)
                .setBindtype("Hard bing"));

        return list;
    }

    public static List<Book> getBooksByAuthor(List<Book> list, String author)
    {
        ArrayList<Book> booklist = new ArrayList<Book>();
        for (Book books : list)
        {
            if (books.getAuthor().equals(author))
            {
                booklist.add(books);
            }
        }
        return booklist;
    }

    public static List<Book> getBooksByBublishing(List<Book> list, String publish)
    {
        ArrayList<Book> booklist = new ArrayList<Book>();
        for (Book books : list)
        {
            if (books.getPublishing().equals(publish))
            {
                booklist.add(books);
            }
        }
        return booklist;
    }

    public static List<Book> getBooksAfterPublishYear(List<Book> list, long year)
    {
        ArrayList<Book> booklist = new ArrayList<Book>();
        for (Book books : list)
        {
            if (books.getPublishyear() > year)
            {
                booklist.add(books);
            }
        }
        return booklist;
    }
}
