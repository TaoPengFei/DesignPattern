package tpf.designer.pattern.course5.structure_pattern2.homework;

public class Waitress implements Waiter {
    @Override
    public void server() {
        System.out.println("服务中......");
    }

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
