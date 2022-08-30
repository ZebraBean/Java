package Library.book;

public class BookList {
    private Book[] books = new Book[10];
    private int usedSize = 0;
    public BookList(){
        books[0] = new Book("游戏人生","榎宫祐",12,"轻小说");
        books[1] = new Book("见面5秒开始战斗","肠才藏",20,"漫画");
        books[2] = new Book("碧蓝之海","井上竖二",25,"漫画");
        this.usedSize = 3;
    }

    public Book getBook(int pos) {  //取pos位置的那本书
        return this.books[pos];
    }

    public void setBook(int pos, Book book) {  //将pos位置的书置为book
        this.books[pos] = book;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
}
