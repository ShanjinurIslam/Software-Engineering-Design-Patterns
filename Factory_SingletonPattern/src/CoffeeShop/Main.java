package CoffeeShop;

class singleCFInstance{
    public static CoffeeFactory coffeeFactory = null ;

    public static CoffeeFactory getInstance(){
        if(coffeeFactory==null){
            coffeeFactory = new CoffeeFactory() ;
        }
        return coffeeFactory ;
    }
}
public class Main {

    public static void main(String[] args) {
	    Coffee a = singleCFInstance.getInstance().produceCoffee("B") ;
        System.out.println(a.getCoffeeDetails());
    }
}
