package Takeout;

public class OrderParser {
    private BurgerBuilder burgerBuilder ;
    private Order order ;

    public OrderParser(Order order){
        burgerBuilder = new BurgerBuilder() ;
        this.order = order ;
    }

    void parseOrder(String order){
        String[] keywords = order.split(",") ;
        for(int i=0;i<keywords.length;i = i+2){
            String option = keywords[i] ;
            String value = keywords[i+1] ;

            if(option.equalsIgnoreCase("Flavor")){
                if(value.equals("Chicken")){
                    burgerBuilder.setFlavor(new Chicken());
                }
                if(value.equals("Beef")){
                    burgerBuilder.setFlavor(new Beef());
                }
            }

            else if(option.equalsIgnoreCase("Patty")){
                if(value.equals("Single")){
                    burgerBuilder.setPatty(new Single());
                }
                if(value.equals("Double")){
                    burgerBuilder.setPatty(new Double());
                }
            }

            else if(option.equalsIgnoreCase("Sause")){
                if(value.equals("HoneyMustard")){
                    burgerBuilder.setSause(new HoneyMustard());
                }
                if(value.equals("Double")){
                    burgerBuilder.setSause(new Naga());
                }
            }

            else if(option.equalsIgnoreCase("Cheese")){
                if(value.equals("Chedder")){
                    burgerBuilder.setCheese(new Chedder());
                }
                if(value.equals("Classic")){
                    burgerBuilder.setCheese(new Classic());
                }

                if(value.equals("NoCheese")){
                    burgerBuilder.setCheese(new NoCheese());
                }
            }

        }
        this.order.addBurger(burgerBuilder.getBurger());
        burgerBuilder.flush();
    }
}
