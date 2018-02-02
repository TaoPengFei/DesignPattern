package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class AmericanFamilyFactory implements IFamilyFactory {
    @Override
    public IFather createFather(String name) {
        return new AmericanFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new AmericanMother(name);
    }
}
