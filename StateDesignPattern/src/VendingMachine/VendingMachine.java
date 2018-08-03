package VendingMachine;

import java.util.ArrayList;
import java.util.List;

class DrinkDetails<softDrink,Integer>{
    softDrink s ;
    Integer amount ;
}

public class VendingMachine {
    List<DrinkDetails> drinkList ;
    private float balance ;
    private softDrink selected ;
    private float deposite ;
    private int deliver ;
    private int return_cash ;
    private VendingMachineState state ;

    public VendingMachine() {
        deliver = return_cash = 0 ;
        deposite = 0 ;
        drinkList = new ArrayList<DrinkDetails>() ;
        balance = 0 ;
    }

    public void addDrink(softDrink s,int amount){
        DrinkDetails drink = new DrinkDetails();
        drink.s = s ;
        drink.amount = amount ;
        drinkList.add(drink);
    }

    DrinkDetails getDrink(softDrink softDrink){
        for(DrinkDetails drinkDetails:drinkList){
            softDrink tem = (softDrink) drinkDetails.s ;
            if(tem.getName().equalsIgnoreCase(softDrink.getName())){
                return drinkDetails ;
            }
        }
        return null ;
    }

    public VendingMachine(float balance){
        drinkList = new ArrayList<DrinkDetails>() ;
        this.balance = balance ;
    }

    void setSelectedItem(softDrink drink){
        selected = drink ;
    }

    softDrink getSelectedItem(){
        return selected ;
    }

    void setDeposite(float f){
        deposite = f ;
    }

    float getDeposit(){
        return deposite ;
    }

    void setBalance(float balance){
        this.balance = balance ;
    }

    float getBalance(){
        return balance ;
    }

    void setDeliver(int a){
        deliver = a ;
    }

    int getDeliver(){
        return deliver ;
    }

    void setReturn_cash(int a){
        return_cash = a ;
    }

    int getReturn_cash(){
        return return_cash ;
    }

    VendingMachineState getState(){
        return state ;
    }

    void setState(VendingMachineState state){
        this.state = state ;
    }

    public void reduceAmount(softDrink softDrink) {
        for(int i = 0 ;i<drinkList.size();i++){
            softDrink tem = (softDrink) drinkList.get(i).s;
            if(tem.getName().equalsIgnoreCase(softDrink.getName())){
                DrinkDetails drinkDetails = new DrinkDetails() ;
                drinkDetails.s = softDrink ;
                drinkDetails.amount = (int)(drinkList.get(i).amount) - 1 ;
                drinkList.set(i,drinkDetails) ;
            }
        }
    }
}
