package tpf.designer.pattern.course5.structure_pattern2.proxy_14.JDK;

import java.lang.reflect.Proxy;

public class ProxyClient {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        CustomInvocationHandler handler = new CustomInvocationHandler(new HelloWorldImpl());
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(ProxyClient.class.getClassLoader(), new Class[]{HelloWorld.class}, handler);
        proxy.sayHello("11111");
    }
}
