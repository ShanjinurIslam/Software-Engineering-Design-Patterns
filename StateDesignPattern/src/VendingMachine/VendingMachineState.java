package VendingMachine;

interface VendingMachineState {
    void update(VendingMachine vendingMachine) ;
}

class initialState implements VendingMachineState{

    @Override
    public void update(VendingMachine vendingMachine) {
        vendingMachine.setDeposite(0);
        vendingMachine.setDeliver(0);
        vendingMachine.setDeposite(0);
        vendingMachine.setReturn_cash(0);
        vendingMachine.setSelectedItem(null);
    }
}

class DepositeState implements VendingMachineState{

    @Override
    public void update(VendingMachine vendingMachine) {
        if(vendingMachine.getSelectedItem().getPrice()>vendingMachine.getDeposit()){
            System.out.println("Insufficient Deposit\n");
            vendingMachine.setDeliver(0); //force delivery cancellation
            vendingMachine.setReturn_cash(1);
        }
        else if(vendingMachine.getSelectedItem().getPrice()==vendingMachine.getDeposit()){
                vendingMachine.setDeliver(1);
                vendingMachine.setBalance(vendingMachine.getBalance()+vendingMachine.getSelectedItem().getPrice());
                vendingMachine.setReturn_cash(0);
        }
        else{
            vendingMachine.setDeliver(1);
            vendingMachine.setBalance(vendingMachine.getBalance()+vendingMachine.getSelectedItem().getPrice());
            vendingMachine.setDeposite(vendingMachine.getDeposit()-vendingMachine.getSelectedItem().getPrice());
            vendingMachine.setReturn_cash(1);
        }
    }
}

class DeliveryState implements VendingMachineState{

    @Override
    public void update(VendingMachine vendingMachine) {
        if(vendingMachine.getDeliver()==0){
            return ;
        }
        else{
            int amount = (int) vendingMachine.getDrink(vendingMachine.getSelectedItem()).amount ;
            if(amount>0){
                vendingMachine.setDeliver(1);
            }
            else{
                System.out.println("Depleted Inventory");
                vendingMachine.setDeliver(0);
                vendingMachine.setReturn_cash(1);
                if(vendingMachine.getDeposit()>vendingMachine.getSelectedItem().getPrice()){
                    vendingMachine.setBalance(vendingMachine.getBalance()-vendingMachine.getSelectedItem().getPrice());
                    vendingMachine.setDeposite(vendingMachine.getDeposit()+vendingMachine.getSelectedItem().getPrice());
                }
                else{
                    return;
                }
            }
        }
    }
}
