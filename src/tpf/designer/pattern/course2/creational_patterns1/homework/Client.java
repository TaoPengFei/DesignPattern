package tpf.designer.pattern.course2.creational_patterns1.homework;

public class Client {
    public static void main(String[] args) {
        IThemeFactory themeFactory = new redThemeFactory();
//        IThemeFactory themeFactory = new blueThemeFactory();
//        IThemeFactory themeFactory = new blackThemeFactory();

        IButton button = themeFactory.createButton();
        IScrollbar scrollbar = themeFactory.createScrollbar();
        IWindow window = themeFactory.createWindow();

        button.displayColor();
        scrollbar.displayColor();
        window.displayColor();

    }
}
