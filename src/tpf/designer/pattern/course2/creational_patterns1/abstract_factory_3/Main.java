package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class Main {
    public static void main(String[] args) {
        IFamilyFactory cnIFamilyFactory = new ChineseFamilyFactory();
//        IFamilyFactory usIFamilyFactory = new AmericanFamilyFactory();

        IFather cnFather = cnIFamilyFactory.createFather("Chinese Father");
        IMother cnMother = cnIFamilyFactory.createMother("Chinese Mother");

//        cnFather.printName();
//        cnMother.printName();
    }
}
