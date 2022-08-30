package Library.operation;

import Library.book.BookList;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:04
 * Description: 退出系统
 */
public class ExitOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("退出系统");
        System.exit(0);  //退出系统
    }
}
