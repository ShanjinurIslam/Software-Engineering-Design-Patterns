package Takeout;

public class Main {

    public static void main(String[] args) {
        Order order = new Order() ;
        OrderParser orderParser = new OrderParser(order) ;
        orderParser.parseOrder("Flavor,Chicken,Patty,Single,Sause,HoneyMustard,Cheese,Chedder");
        orderParser.parseOrder("Flavor,Beef,Patty,Single,Sause,HoneyMustard,Cheese,Chedder");
        order.printOrder();
    }
}
