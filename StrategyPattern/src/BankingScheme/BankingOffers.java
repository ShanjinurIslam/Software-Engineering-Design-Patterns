package BankingScheme;

abstract class BankingOffers {
    public abstract int getProfit(int balance) ;
}

class StudentBanking extends BankingOffers{

    @Override
    public int getProfit(int balance) {
        return (int)(balance*0.10);
    }
}


class SavingBanking extends BankingOffers{

    @Override
    public int getProfit(int balance) {
        return (int)(balance*0.15);
    }
}

class RetirementPlan extends BankingOffers{

    @Override
    public int getProfit(int balance) {
        return (int)(balance*0.2);
    }
}