package Library.user;

import Library.operation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: 13498
 * Date: 2021/11/22
 * Time: 14:19
 * Description: No Description
 */
public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.IOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }
    public int menu(){
        System.out.println("========================================");
        System.out.println("尊贵的用户-"+this.name+"，欢迎使用本图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("========================================");
        System.out.print("请输入数字以使用相应的功能：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }


}
