package Takeaway;

import java.util.ArrayList;
import java.util.Random;

class food{
    String name ;
    int price ;

    food(String food,int price){
        this.name = food ;
        this.price = price ;
    }
}
public class takeaway_shop {
    ArrayList<food> ordered_items ;
    int total_cost ;
    int invoice_num ;
    int payment_status ;
    int deliver_status ;
    takeawaystates current_state ;

    takeaway_shop(){
        ordered_items = new ArrayList<>() ;
        total_cost = 0 ;
        invoice_num = new Random().nextInt(1000) ;
        current_state = new initial();
    }

    void process(){

        current_state = new menuchoice() ;
        current_state.update(this);

        current_state = new payment() ;
        current_state.update(this);


        current_state = new deliver() ;
        current_state.update(this);
    }

}
