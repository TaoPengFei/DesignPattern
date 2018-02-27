package tpf.designer.pattern.course5.structure_pattern2.proxy_14.demo1;

public class UsageLogger {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     *
     */
    public void save(){
        System.out.println("保存记录到日志中...");
        //todo something
    }

    /**
     *
     * @param userId
     */
    public void save(String userId){
        this.userId = userId;
        save();
    }
}
