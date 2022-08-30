package Library.operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:02
 * Description: 借阅书籍
 */
public class BorrowOperation implements IOperation {
    public void work(BookList bookList){
        System.out.println("借阅书籍");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要借阅的图书名称：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                if (!book.isBorowed()){
                    book.setBorowed(true);  //如果找到该书，且该书没有被借阅，那就借阅成功
                    System.out.println("图书借阅成功！");
                }else {
                    System.out.println("该图书已被借阅！");
                }
                return;
            }
        }
        System.out.println("该图书不存在！");  //走到这里说明这本书不存在
    }
}
