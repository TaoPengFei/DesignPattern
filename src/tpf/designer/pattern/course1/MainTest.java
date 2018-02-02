package tpf.designer.pattern.course1;

public class MainTest {
    public static void main(String args[]){
        System.out.println("==================Main Test==================");
        Paperboy p = new Paperboy();
        p.getMyCustomer().pay(1);
    }
}
