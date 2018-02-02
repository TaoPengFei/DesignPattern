package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public interface IFamilyFactory {
    public IFather createFather(String name);
    public IMother createMother(String name);
}
