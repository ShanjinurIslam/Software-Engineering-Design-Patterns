package StarBucks;

public class masterAccount {
    private static masterAccount master ;
    int balance ;
    masterAccount(){
        balance = 0 ;
    }

    int getBalance(){
        return balance ;
    }

    void addBalance(int a){
        balance += a ;
    }

    void subBalance(int a){
        balance -= a ;
    }

    public static masterAccount getInstance(){
        if(master==null){
            master = new masterAccount() ;
        }
        return master ;
    }
}
