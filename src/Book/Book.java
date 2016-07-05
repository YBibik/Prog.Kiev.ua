package Book;

/**
 * Created by y.bibik on 05.07.2016.
 */
public class Book {

    private int    id;
    private String name;
    private String author;
    private String publishing;
    private long   publishyear;
    private int    pagecnt;
    private double price;
    private String bindtype;
// Constructor
    public Book() {
    }
// Getters && Setters
    public int getId() {
        return id;
    }

    public Book setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublishing() {
        return publishing;
    }

    public Book setPublishing(String publishing) {
        this.publishing = publishing;
        return this;
    }

    public long getPublishyear() {
        return publishyear;
    }

    public Book setPublishyear(long publishyear) {
        this.publishyear = publishyear;
        return this;
    }

    public int getPagecnt() {
        return pagecnt;
    }

    public Book setPagecnt(int pagecnt) {
        this.pagecnt = pagecnt;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Book setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getBindtype() {
        return bindtype;
    }

    public Book setBindtype(String bindtype) {
        this.bindtype = bindtype;
        return this;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishyear=" + publishyear +
                ", pagecnt=" + pagecnt +
                ", price=" + price +
                ", bindtype='" + bindtype + '\'' +
                '}';
    }
}
