package Library.operation;

import Library.book.Book;
import Library.book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/18
 * Time: 22:43
 * Description:新增图书
 */
public class AddOperation implements IOperation {
    public void work(BookList bookList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("新增图书");
        //只需要放到当前数组的usedSize位置
        System.out.println("请输入图书的名字：");
        String name = scanner.next();
        System.out.println("请输入图书的作者：");
        String author = scanner.next();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBook(curSize,book);
        bookList.setUsedSize(curSize+1);
        System.out.println("图书添加成功！");
    }

}
