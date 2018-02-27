package tpf.designer.pattern.course5.structure_pattern2.homework;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class TestProxy {

    @Test
    public void demo1(){
        Waiter waiter = new Waitress();
        //waiter.server();

        //使用动态地代理:Proxy, newProxyInstance
        /*
         * ClassLoader  :类加载器
         * class[]      :被增强的对象实现的所有接口
         * InvocationHandler  :处理类
         */
        //第一个参数
        ClassLoader classLoader = waiter.getClass().getClassLoader();
        //第二个参数
        Class[] interfaces =  waiter.getClass().getInterfaces();
        //第三个参数
        //相当于Waiter的实现类
        Waiter waiter2 = (Waiter) Proxy.newProxyInstance(
                classLoader,
                interfaces,
                new MyInvocationHandler(waiter)
        );
//        waiter2.server();
        //说明现在调用代理对象的任何方法的时候,InvocationHandler中的invoke方法执行
//        waiter2.sayHello("张三");
        String s = waiter2.sayHello("李四");
        System.out.println(s);
    }
}
