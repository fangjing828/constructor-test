package pers.fangjing.java.test;

/**
 * Created by fang_j on 2019/03/05.
 */
public class Parent
{
    private static final String static_s = initStatic();

    static {
        System.out.println("Parent 静态代码初始块");
    }

    {
        System.out.println("Parent 代码初始快");
    }

    private static String initStatic() {
        String msg = "Parent 静态变量初始化";
        System.out.println(msg);
        return msg;
    }

    private String s = init();

    public Parent() {
        System.out.println("Parent 构造函数");
        display();
    }

    private String init() {
        String msg = "Parent 变量初始化";
        System.out.println(msg);
        return msg;
    }

    public void display()
    {
        System. out.println("Parent display()方法" );
    }
}
