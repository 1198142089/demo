package com.example.demo.test;


/**
 * 10. 抽象类(abstract class)和接口(interface)有什么异同？（2017-11-16-wl）
 * 不同：
 * 抽象类：
 * 1.抽象类中可以定义构造器
 * 2.可以有抽象方法和具体方法
 * 3.接口中的成员全都是 public 的
 * 4.抽象类中可以定义成员变量
 * 5.有抽象方法的类必须被声明为抽象类，而抽象类未必要有抽象方法
 * 6.抽象类中可以包含静态方法
 * 32
 * 7.一个类只能继承一个抽象类
 * 接口：
 * 1.接口中不能定义构造器
 * 2.方法全部都是抽象方法
 * 3.抽象类中的成员可以是 private、默认、 protected、 public
 * 4.接口中定义的成员变量实际上都是常量
 * 5.接口中不能有静态方法
 * 6.一个类可以实现多个接口
 * 相同：
 * 1.不能够实例化
 * 2.可以将抽象类和接口类型作为引用类型
 * 3.一个类如果继承了某个抽象类或者实现了某个接口都需要对其中的抽象方法全部进行实现，否则该类仍然需要
 * 被声明为抽象类
 */
public abstract class AbstractTest {
    private String name;
    public AbstractTest() {
    }
    abstract int getInfo();
}
