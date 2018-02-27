package tpf.designer.pattern.course5.structure_pattern2.proxy_14;

public class RealSubject extends Subject {

    public RealSubject() {
    }

    @Override
    public void request() {
        System.out.println("From real subject.");
    }

    public static class ProxySubject extends Subject {

        private RealSubject realSubject;

        public ProxySubject() {

        }

        @Override
        public void request() {
            preRequest();
            if (realSubject == null){
                realSubject = new RealSubject();
            }
            realSubject.request();
            postRequest();
        }

        /**
         * 请求前的操作
         */
        private void preRequest() {
            System.out.println("请求前的操作...");
        }

        /**
         * 请求后的操作
         */
        private void postRequest() {
            System.out.println("请求后的操作...");
        }
    }
}
