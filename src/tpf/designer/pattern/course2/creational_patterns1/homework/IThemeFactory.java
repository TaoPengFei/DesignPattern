package tpf.designer.pattern.course2.creational_patterns1.homework;

/**
 * 抽象UI皮肤主题工厂接口
 */
public interface IThemeFactory {
    /**
     * 创建一套按钮
     * @return
     */
    public IButton createButton();

    /**
     * 创建一套滚动条
     * @return
     */
    public IScrollbar createScrollbar();

    /**
     * 创建一套窗口
     * @return
     */
    public IWindow createWindow();
}
