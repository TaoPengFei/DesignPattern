package tpf.designer.pattern.course5.structure_pattern2.proxy_14.JDK;

import java.util.List;
import java.util.Vector;

import static tpf.designer.pattern.course5.structure_pattern2.proxy_14.JDK.VectorProxy.factory;

public class TestJDK {
    public static void main(String[] args) {
        List v = null;
        v = (List) factory(new Vector<>(10));
        v.add("1");
        v.add("2");
    }
}
