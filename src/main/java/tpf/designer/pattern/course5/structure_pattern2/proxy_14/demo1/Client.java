package tpf.designer.pattern.course5.structure_pattern2.proxy_14.demo1;

import org.junit.Test;

public class Client {

    @Test
    public void test1(){
        Searcher searcher = new Proxy();
        searcher.doSearch("Admin",null);
    }
}
