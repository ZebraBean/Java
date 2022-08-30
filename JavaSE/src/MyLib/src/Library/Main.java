package Library;

import Library.book.BookList;
import Library.user.AdminUser;
import Library.user.NormalUser;
import Library.user.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:44
 * Description: No Description
 */
public class Main {
    public static User login(){
        System.out.println("请输入您的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入您的身份：1 -> 管理员 0 -> 普通用户");
        int n = scanner.nextInt();
        if (n == 1){
            return new AdminUser(name);
        }else {
            return new NormalUser(name);
        }
    }
    public static void main(String[] args) {
        BookList bookList = new BookList();  //准备了书籍
        User user = login();  //向上转型
        while(true){  //写成死循环，这样就会不断的调用菜单，直到选择退出系统
            int choice = user.menu();  //动态绑定调用menu方法,choice表示你的选择
            user.doOperations(choice,bookList);
        }
    }
}
