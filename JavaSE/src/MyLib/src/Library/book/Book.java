package Library.book;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBorowed;  //默认是flase,默认没有被借，所以可以不用初始化
    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        //默认是flase,默认没有被借，所以可以不用初始化
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorowed() {
        return isBorowed;
    }

    public void setBorowed(boolean borowed) {
        isBorowed = borowed;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorowed=" + isBorowed +
                '}';
    }
}
