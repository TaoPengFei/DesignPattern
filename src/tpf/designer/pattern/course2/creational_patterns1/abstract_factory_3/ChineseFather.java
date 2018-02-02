package tpf.designer.pattern.course2.creational_patterns1.abstract_factory_3;

public class ChineseFather implements IFather {
    private String name;

    public ChineseFather(String name) {
        this.name = name;
        System.out.println("创建一个中国父亲！");
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
