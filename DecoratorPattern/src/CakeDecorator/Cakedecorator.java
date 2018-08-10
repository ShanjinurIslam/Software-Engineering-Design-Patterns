package CakeDecorator;

abstract class Cakedecorator implements Cake{
    @Override
    public abstract String getDescription() ;
}

class Toppings extends Cakedecorator{
    Cake cake ;
    String topping_type ;
    Toppings(Cake c,String topping_type){
        this.cake = c ;
        this.topping_type = topping_type ;
    }

    @Override
    public int getPrice() {
        if(topping_type.equalsIgnoreCase("Sprinkls")){
            return cake.getPrice()+5 ;
        }
        else {
            return cake.getPrice()+2 ;
        }
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + "with "+ topping_type ;
    }
}

class ExtraItems extends Cakedecorator{
    Cake cake ;
    String extra_item ;
    ExtraItems(Cake c,String topping_type){
        this.cake = c ;
        this.extra_item = topping_type ;
    }

    @Override
    public int getPrice() {
        if(extra_item.equalsIgnoreCase("Candles")){
            return cake.getPrice()+5 ;
        }
        else {
            return cake.getPrice()+2 ;
        }
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " and "+ extra_item ;
    }
}