package Library.operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:04
 * Description: 查找图书
 */
public class FindOperation implements IOperation{
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("查找图书");
        System.out.println("请输入图书的名称：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                System.out.println("找到该图书！");
                System.out.println(book);
                return;  //如果找到了，就直接return出去
            }
        }
        System.out.println("对不起，没有找到此书！");  //如果走到这一步，那么说明没有在for循环return出去，那就显示没找到
    }
}
