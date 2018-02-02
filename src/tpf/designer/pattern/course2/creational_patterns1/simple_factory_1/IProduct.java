package tpf.designer.pattern.course2.creational_patterns1.simple_factory_1;

/**
 * 抽象产品类，简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
 */
public abstract class IProduct {
    /**
     * 产品的抽象方法，由具体的产品类去实现
     */
    public abstract void productMethod();
}
