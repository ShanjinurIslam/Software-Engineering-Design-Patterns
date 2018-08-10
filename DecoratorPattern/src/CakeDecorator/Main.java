package CakeDecorator;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Cake cake = new Chocolate();
        Scanner s = new Scanner(System.in) ;
        System.out.println("Welcome to our Cake Shop");
        System.out.println("Select Flavor\n1.Chocolate\n2.Vanilla\n3.Red Velvet");
        int c = s.nextInt() ;
        if(c==1){
            cake = new Chocolate() ;
        }
        if(c==2){
            cake = new Vanilla() ;
        }
        if(c==3){
            cake = new RedVelvet() ;
        }

        System.out.println("Select Toppings\n1.Sprinkls\n2.ExtraCream");

        c = s.nextInt() ;

        if(c==1){
            cake = new Toppings(cake,"Sprinkls") ;
        }
        else{
            cake = new Toppings(cake,"ExtraCream") ;
        }

        System.out.println("Select Extra Items\n1.Candles\n2.Foam");

        c = s.nextInt() ;

        if(c==1){
            cake = new ExtraItems(cake,"Candles") ;
        }
        else{
            cake = new ExtraItems(cake,"Foam") ;
        }

        System.out.println("Your order-------");
        System.out.println(cake.getDescription());
        System.out.println("Total price "+cake.getPrice());
    }
}
