package tpf.designer.pattern.course2.creational_patterns1.factory_method_2;

public class Main {
    public static void main(String[] args) {
        /*//客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.Manufacture().Show();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.Manufacture().Show();*/

        //客户要产品A
        Factory mFactory = new FactoryA();
        mFactory.Manufacture().Show();

        //客户要产品B
        mFactory = new FactoryB();
        mFactory.Manufacture().Show();
    }
}
