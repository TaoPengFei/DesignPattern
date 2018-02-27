package tpf.designer.pattern.course5.structure_pattern2.proxy_14.CGLIB;

public class TestCglib {
    public static void main(String[] args) {
        CustomCglib customCglib = new CustomCglib();
        HelloImpl hello = (HelloImpl) customCglib.getInstance(new HelloImpl());
        hello.sayHello("11111");
    }
}
