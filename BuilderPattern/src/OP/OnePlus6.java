package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
public class OnePlus6 {
    Ram ram ;
    Storage storage ;
    Color color ;

    OnePlus6(Ram r,Storage s,Color c){
        this.ram =r ;
        this.storage = s ;
        this.color = c ;
    }
    void getSpecification(){
        System.out.println(color.getColor() + " " + storage.getStorageSize() + " " + color.getColor());
    }
}
