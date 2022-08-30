package Library.user;

import Library.book.BookList;
import Library.operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:18
 * Description: No Description
 */
public abstract class User {
    protected String name;
    IOperation[] IOperations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();
    public  void doOperations(int choice, BookList bookList){
        IOperations[choice].work(bookList);
    }
}
