package Objects;

public class Book {
    private long id;
    private String bookName;
    private byte[] bookContent;
    private int pageCount;
    private String isbn;
    private String genre;
    private String author;
    private int publisherYear;
    private String publisher;
    private byte[] image;
    private String bookDescription;

    public Book(long id, String bookName, byte[] bookContent, int pageCount, String isbn, String genre,
                String author, int publisherYear, String publisher, byte[] image, String bookDescription) {
        this.id = id;
        this.bookName = bookName;
        this.bookContent = bookContent;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.genre = genre;
        this.author = author;
        this.publisherYear = publisherYear;
        this.publisher = publisher;
        this.image = image;
        this.bookDescription = bookDescription;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public byte[] getBookContent() {
        return bookContent;
    }

    public void setBookContent(byte[] bookContent) {
        this.bookContent = bookContent;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public byte[] getImage() {
        return image;
    }

    public void setCoverImage(byte[] image) {
        this.image = image;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
