package StarBucks;

public class Main {

    public static void main(String args[]){
        Branch a,b ;

        a = new Branch("Dhaka") ;
        b = new Branch("Mymensingh") ;

        a.sellCoffee();
        b.sellCoffee();

        a.returnmoney(1);
        System.out.println(masterAccount.getInstance().getBalance());
    }
}
