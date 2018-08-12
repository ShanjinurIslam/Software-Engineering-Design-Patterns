package StarBucks;

public class Branch {
    String location ;
    masterAccount masterAccount ;

    Branch(String location){
        this.location = location ;
        masterAccount = StarBucks.masterAccount.getInstance() ;
    }

    void sellCoffee(){
        masterAccount.addBalance(2);
    }

    void returnmoney(int amount){
        masterAccount.subBalance(amount);
    }
}
