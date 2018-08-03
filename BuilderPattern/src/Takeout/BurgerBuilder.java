package Takeout;

public class BurgerBuilder {
    private Burger burger;

    public BurgerBuilder(){
        burger = new Burger() ;
    }

    void setFlavor(Flavor flavor){
        burger.setFlavor(flavor);
    }

    void setPatty(Patty patty){
        burger.setPatty(patty);
    }

    void setSause(Sause sause){
        burger.setSause(sause);
    }

    void setCheese(Cheese cheese){
        burger.setCheese(cheese) ;
    }

    void flush(){
        burger = new Burger() ;
    }

    Burger getBurger(){
        return this.burger ;
    }
}
