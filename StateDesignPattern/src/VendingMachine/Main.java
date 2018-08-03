package VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
        VendingMachine vendingMachine = new VendingMachine(100) ;
        softDrink softDrink = new Pepsi() ;
        vendingMachine.addDrink(softDrink,1);
        softDrink = new sevenUp() ;
        vendingMachine.addDrink(softDrink,1);
        softDrink = new Miranda() ;
        vendingMachine.addDrink(softDrink,1);
        while (true){
            System.out.println("Choose your drink \n1.Pepsi\n2.7up\n3.Miranda\n");
            int ch = s.nextInt() ;
            if(ch==1){
                vendingMachine.setSelectedItem(new Pepsi());
            }
            if(ch==2){
                vendingMachine.setSelectedItem(new sevenUp());
            }
            if(ch==3){
                vendingMachine.setSelectedItem(new Miranda());
            }
            System.out.print("Insert Coin : ") ;
            float bal = s.nextFloat() ;
            vendingMachine.setDeposite(bal);
            vendingMachine.setState(new DepositeState());
            vendingMachine.getState().update(vendingMachine);
            vendingMachine.setState(new DeliveryState());
            vendingMachine.getState().update(vendingMachine);

            if(vendingMachine.getDeliver()==1){
                vendingMachine.reduceAmount(vendingMachine.getSelectedItem());
                System.out.println("Drink Delivered : "+vendingMachine.getSelectedItem().getName() + "\n");
            }
            if(vendingMachine.getReturn_cash()==1){
                System.out.println("Return Cash: "+vendingMachine.getDeposit() + "\n");
            }

            vendingMachine.setState(new initialState());
            vendingMachine.getState().update(vendingMachine);
        }
    }
}
