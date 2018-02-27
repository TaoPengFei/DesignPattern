package tpf.designer.pattern.course5.structure_pattern2.proxy_14;

public class ProxyTest {
    public static void main(String[] args) {
        Subject subject = new RealSubject.ProxySubject();
        subject.request();
    }
}
