package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class AmericanMother implements IMother {
    private String name;

    public AmericanMother(String name) {
        this.name = name;
        System.out.println("创建一个美国母亲！");
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
