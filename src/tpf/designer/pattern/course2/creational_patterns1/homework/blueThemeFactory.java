package tpf.designer.pattern.course2.creational_patterns1.homework;

public class blueThemeFactory implements  IThemeFactory {
    @Override
    public IButton createButton() {
        return new blueButton();
    }

    @Override
    public IScrollbar createScrollbar() {
        return new blueScrollbar();
    }

    @Override
    public IWindow createWindow() {
        return new blueWindow();
    }
}
