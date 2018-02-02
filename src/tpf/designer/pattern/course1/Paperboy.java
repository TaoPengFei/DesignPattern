package tpf.designer.pattern.course1;

//import tpf.designer.pattern.course1.Customer;

public class Paperboy {

    private Customer myCustomer;
    /*public void pay(float payment) {
        Wallet theWallet = myCustomer.getWallet();
        if (theWallet.getTotalMoney() > payment) {
            theWallet.subtractMoney(payment);
        } else {
            //money not enough
        }
    }*/

    public Customer getMyCustomer() {
        return myCustomer;
    }

    public void setMyCustomer(Customer myCustomer) {
        this.myCustomer = myCustomer;
    }

    public void salePaper(){
        /* todo */
    }


}
