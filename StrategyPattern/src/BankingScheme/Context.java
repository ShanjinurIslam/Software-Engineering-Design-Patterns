package BankingScheme;

public class Context {
    BankingOffers offers ;
    int balance ;

    Context(BankingOffers offers,int balance){
        this.offers = offers ;
        this.balance = balance ;
    }

    int getProfit(){
        return offers.getProfit(balance) ;
    }
}
