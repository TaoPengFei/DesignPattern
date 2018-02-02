package tpf.designer.pattern.course2.creational_patterns1.simple_factory_1;

/**
 *  工厂类，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。
 *  工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。
 */
public class Factory {
    public static IProduct createProduct(String type){
        IProduct product = null;
        switch (type) {
            case "1":
                product = new P1();
                break;
            case "2":
                product = new P2();
                break;
            case "3":
                product = new P3();
                break;
        }
        return product;
    }
}
