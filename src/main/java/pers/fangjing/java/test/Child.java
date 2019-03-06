package pers.fangjing.java.test;

/**
 * Created by fang_j on 2019/03/05.
 */
public class Child extends Parent {
    static {
        System.out.println("Child 静态代码初始块");
    }

    private static final String static_s = initStatic();

    private String s = init();

    {
        System.out.println("Child 代码初始快");
    }

    private static String initStatic() {
        String msg = "Child 静态变量初始化";
        System.out.println(msg);
        return msg;
    }

    public Child() {
        System.out.println("Child 构造函数");
        display();
    }

    private String init() {
        String msg = "Child 变量初始化";
        System.out.println(msg);
        return msg;
    }

    @Override
    public void display() {
        System.out.println("Child display()方法");
    }

    public static void main(String[] args) {
        new Child();
    }
}
