package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
interface Ram {
    String getRamSize() ;
}

class _6gb implements Ram {

    @Override
    public String getRamSize() {
        return "Ram : 6GB";
    }
}

class _8gb implements Ram {

    @Override
    public String getRamSize() {
        return "Ram : 8Gb";
    }
}

class RamFactory{
    Ram getRam(String ram){
        if(ram.equals("8")){
            return new _8gb() ;
        }
        else if(ram.equals("6")){
            return new _6gb() ;
        }
        else{
            return null ;
        }
    }
}