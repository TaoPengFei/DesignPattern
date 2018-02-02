package tpf.designer.pattern.course2.creational_patterns1.homework;

public class blackThemeFactory implements IThemeFactory {
    @Override
    public IButton createButton() {
        return new blackButton();
    }

    @Override
    public IScrollbar createScrollbar() {
        return new blackScrollbar();
    }

    @Override
    public IWindow createWindow() {
        return new blackWindow();
    }
}
