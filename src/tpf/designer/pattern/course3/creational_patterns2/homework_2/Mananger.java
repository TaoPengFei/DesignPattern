package tpf.designer.pattern.course3.creational_patterns2.homework_2;

import java.util.HashMap;
import java.util.Map;

/**
 * http://f.dataguru.cn/java-887370-1-1.html
 */
public class Mananger {

    private Mananger() {
    }

    private static Map<Long,Mananger> mananger = new HashMap<>();

    public static synchronized Mananger getMananger(Long uid) {
        if (mananger.containsKey(uid) && mananger.get(uid) != null){
            return mananger.get(uid);
        } else {
            Mananger m = new Mananger();
            mananger.put(uid,m);
            return m;
        }
    }
}
