package tpf.designer.pattern.course5.structure_pattern2.proxy_14.demo1;

public class Proxy implements Searcher {

    private RealSearcher searcher;
    private UsageLogger usageLogger;
    private AccessValidator accessValidator;

    public Proxy() {
        searcher = new RealSearcher();
    }

    /**
     * 实现查询操作
     * @param userId
     * @param searchType
     * @return
     */
    @Override
    public String doSearch(String userId, String searchType) {
        if (checkAccess(userId)){
            String result = searcher.doSearch(null,searchType);
            logUsage(userId);
            return result;
        } else {
            return null;
        }
    }

    /**
     *  查询前的权限操作
     * @param userId
     * @return
     */
    private boolean checkAccess(String userId){
        accessValidator = new AccessValidator();
        return accessValidator.vailateUser(userId);
    }

    /**
     * 查询后的日志操作
     * @param userId
     */
    private void logUsage(String userId){
        UsageLogger logger = new UsageLogger();
        logger.setUserId(userId);
        logger.save();
    }
}
