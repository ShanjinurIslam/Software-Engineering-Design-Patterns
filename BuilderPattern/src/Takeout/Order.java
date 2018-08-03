package Takeout;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
    ArrayList<Burger> orderList ;

    Order(){
        orderList = new ArrayList<>() ;
    }

    void addBurger(Burger burger){
        orderList.add(burger) ;
    }

    void printOrder(){
        Iterator<Burger> iterator = orderList.iterator() ;
        int i = 1 ;
        while (iterator.hasNext()){
            Burger b = iterator.next() ;
            System.out.print("Burger "+i+ ": " + b.toString());
            i++ ;
        }
    }
}
