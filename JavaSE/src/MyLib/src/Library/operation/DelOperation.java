package Library.operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:03
 * Description: 删除图书
 */
public class DelOperation implements IOperation{
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("删除图书");
        System.out.println("请输入要删除的图书名称：");
        String name = scanner.next();
        int n = bookList.getUsedSize();
        for (int i = 0; i < n; i++) {
            Book book = bookList.getBook(i);
            if (book.getName().equals(name)){
                for (int j = i; j < n-1; j++) {
                    bookList.setBook(j,bookList.getBook(j+1));
                }
                bookList.setUsedSize(n-1);
                System.out.println("图书删除成功！");
                return;  //如果找到了并且删除成功，就return
            }
        }
        System.out.println("对不起，没有找到您需要删除的书！");  //如果没有for循环中没有return，那就是没有找到
    }
}
