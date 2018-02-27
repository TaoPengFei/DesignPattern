package tpf.designer.pattern.course5.structure_pattern2.proxy_14.demo1;

public class AccessValidator {

    /**
     * 用户权限的校验
     * @param userId
     * @return
     */
    public boolean vailateUser(String userId){
        System.out.println("用户权限的校验...");
        if (userId.equals("Admin")){
            return true;
        } else {
            return false;
        }
    }
}
