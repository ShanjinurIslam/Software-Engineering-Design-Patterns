package BankingScheme;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int age = sc.nextInt() ;
        sc.nextLine() ;
        int balance = sc.nextInt() ;

        if(age<18){
            BankingOffers offers = new StudentBanking() ;
            Context c = new Context(offers,balance);
            System.out.println(c.getProfit());

        }

        else if(age>18 & age<65){
            BankingOffers offers = new SavingBanking() ;
            Context c = new Context(offers,balance);
            System.out.println(c.getProfit());

        }

        else{
            BankingOffers offers = new RetirementPlan() ;
            Context c = new Context(offers,balance);
            System.out.println(c.getProfit());

        }
    }
}
