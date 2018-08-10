package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
public class PhoneBuilder {
    OnePlus6 onePlus6 ;
    Ram ram ;
    Storage storage ;
    Color color ;

    void setRam(Ram ram){
        this.ram = ram ;
    }

    void setStorage(Storage storage){
        this.storage = storage ;
    }

    void setColor(Color color){
        this.color = color ;
    }

    OnePlus6 getOnePlus6(){
        onePlus6 = new OnePlus6(ram,storage,color) ;
        return onePlus6 ;
    }
}
