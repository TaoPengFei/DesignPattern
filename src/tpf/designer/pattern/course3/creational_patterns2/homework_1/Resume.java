package tpf.designer.pattern.course3.creational_patterns2.homework_1;

import java.util.ArrayList;
import java.util.List;

/**
 * http://damon-zhang.iteye.com/blog/1899932
 * https://www.ppkao.com/shiti/4713529/
 */
public class Resume {

    private String  name;
    private String  age;
    private String  introduction;
    private List<String> phonyNumber;


    public Resume(String name, String age, String introduction, List<String> phonyNumber) {
        this.name = name;
        this.age = age;
        this.introduction = introduction;
        this.phonyNumber = phonyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<String> getPhonyNumber() {
        return phonyNumber;
    }

    public void setPhonyNumber(List<String> phonyNumber) {
        this.phonyNumber = phonyNumber;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", introduction='" + introduction + '\'' +
                ", phonyNumber=" + phonyNumber +
                '}';
    }

    public Resume clone(){

        List<String> p = new ArrayList<>();
        p.addAll(this.phonyNumber);

        return new Resume(this.name,this.age,this.introduction,p);
    }
}
