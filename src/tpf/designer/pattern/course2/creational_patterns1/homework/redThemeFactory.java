package tpf.designer.pattern.course2.creational_patterns1.homework;

/**
 * 红色主题的具体工厂类
 */
public class redThemeFactory implements IThemeFactory {

    /**
     * 创建红色主题的按钮
     * @return
     */
    @Override
    public IButton createButton() {
        return new redButton();
    }

    /**
     * 创建红色主题的滚动条
     * @return
     */
    @Override
    public IScrollbar createScrollbar() {
        return new redScrollbar();
    }

    /**
     * 创建红色主题的窗口
     * @return
     */
    @Override
    public IWindow createWindow() {
        return new redWindow();
    }
}
