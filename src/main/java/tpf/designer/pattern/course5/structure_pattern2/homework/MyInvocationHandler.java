package tpf.designer.pattern.course5.structure_pattern2.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Waiter waiter;

    public MyInvocationHandler(Waiter waiter) {
        this.waiter = waiter;
    }

    /**
     * obj     :正在执行的方法中的参数
     * @param proxy 产生的代理对象
     * @param method 当前正在调用的目标类的方法
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //System.out.println("InvocationHandler  invocake执行了.....");
        //waiter.server();
        //System.out.println(method.getName());
        //利用反射使特定的方法执行
        Object obj = method.invoke(waiter, args);
        return obj;
    }
}
