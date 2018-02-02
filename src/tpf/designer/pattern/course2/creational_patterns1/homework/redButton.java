package tpf.designer.pattern.course2.creational_patterns1.homework;

/**
 * 红色主题的按钮具体类
 */
public class redButton implements IButton {
    @Override
    public void displayColor() {
        System.out.println("创建一个红色主题的按钮！");
    }
}
