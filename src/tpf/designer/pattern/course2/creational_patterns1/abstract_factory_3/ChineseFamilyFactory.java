package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class ChineseFamilyFactory implements IFamilyFactory  {


    @Override
    public IFather createFather(String name) {
        return new ChineseFather(name);
    }

    @Override
    public IMother createMother(String name) {
        return new ChineseMother(name);
    }
}
