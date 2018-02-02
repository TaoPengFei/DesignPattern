package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class AmericanFather implements IFather {
    private String name;

    public AmericanFather(String name) {
        this.name = name;
        System.out.println("创建一个美国父亲！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.getClass().getName() + ":" + this.name);
    }
}
