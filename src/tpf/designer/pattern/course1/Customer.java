package tpf.designer.pattern.course1;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Wallet getWallet(){
        return myWallet;
    }
    public void pay(float payment){
        System.out.println("付款!");
        if (myWallet.getTotalMoney() > payment) {
            myWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }
}
