package Library.operation;

import Library.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:03
 * Description: 显示书籍
 */
public class DisplayOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("显示书籍");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }

    }
}
