package tpf.designer.pattern.course5.structure_pattern2.proxy_14.demo1;

public class RealSearcher implements Searcher{

    public RealSearcher() {
    }

    /**
     * 真实的查询工作在这里发生
     * @param userId
     * @param searchType
     * @return
     */
    @Override
    public String doSearch(String userId, String searchType) {
        System.out.println("真实的查询工作在这里发生...");
        //todo something
        return "result set";
    }
}
