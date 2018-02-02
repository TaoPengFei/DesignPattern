package tpf.designer.pattern.course2.creational_patterns1.factory_method_2;

public class FactoryB extends Factory {
    @Override
    public Product Manufacture() {
        return new ProductB();
    }
}
