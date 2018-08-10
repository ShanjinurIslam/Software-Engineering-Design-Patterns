package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
public class Director {
    PhoneBuilder builder = new PhoneBuilder();
    void parseSpec(String ram, String color,String storage){
        builder.setColor(new colorFactory().getColor(color));
        builder.setRam(new RamFactory().getRam(ram));
        builder.setStorage(new storageFactory().getStorage(storage));
    }

    OnePlus6 getPhone(){
        return builder.getOnePlus6() ;
    }
}
