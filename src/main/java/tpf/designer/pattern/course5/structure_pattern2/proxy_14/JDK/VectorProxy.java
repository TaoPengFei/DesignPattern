package tpf.designer.pattern.course5.structure_pattern2.proxy_14.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class VectorProxy implements InvocationHandler {

    private Object proxyobj;

    /**
     * 构造
     * @param proxyobj
     */
    public VectorProxy(Object proxyobj) {
        this.proxyobj = proxyobj;
    }

    /**
     * 静态工厂方法
     * @param obj
     * @return
     */
    public static Object factory(Object obj){
        Class cls = obj.getClass();
        return Proxy.newProxyInstance(
                cls.getClassLoader(),
                cls.getInterfaces(),
                new VectorProxy(obj)
        );
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling ： " + method);

        if (args != null){
            for (int i = 0; i < args.length; i++){
                System.out.println(args[i] + "");
            }
        }

        Object o = method.invoke(proxyobj,args);
        System.out.println("after calling ： " + method);

        return o;
    }
}
