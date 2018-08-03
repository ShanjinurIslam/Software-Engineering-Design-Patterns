package Takeout;

public class Burger {
    private Flavor flavor ;
    private Patty patty ;
    private Sause sause ;
    private Cheese cheese ;

    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }

    public void setPatty(Patty patty) {
        this.patty = patty;
    }


    public void setSause(Sause sause) {
        this.sause = sause;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString(){
        return flavor.getFlavor() +"\n\t\t  " + patty.getPatty() +"\n\t\t  " + sause.getSause() +"\n\t\t  " + cheese.getCheese() + "\n"  ;
    }
}
