package tpf.designer.pattern.course2.creational_patterns1.simple_factory_1;

/**
 * 具体产品类，是简单工厂模式的创建目标。
 */
public class P1 extends IProduct {
    @Override
    public void productMethod() {
        System.out.println("生产P1");
    }
}
