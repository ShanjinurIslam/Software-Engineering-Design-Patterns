package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
interface Color {
    String getColor() ;
}

class white implements Color {

    @Override
    public String getColor() {
        return "Color : White";
    }
}

class MattBlack implements Color {

    @Override
    public String getColor() {
        return "Color: Matt Black";
    }
}

class GlossyBlack implements Color {

    @Override
    public String getColor() {
        return "Color: Glossy Black";
    }
}

class colorFactory{
    Color getColor(String s){
        if(s.equalsIgnoreCase("White")){
            return new white() ;
        }
        else if(s.equalsIgnoreCase("MattBlack")){
            return new MattBlack() ;
        }
        else if(s.equalsIgnoreCase("GlossyBlack")){
            return new GlossyBlack() ;
        }
        else{
            return null ;
        }
    }
}


