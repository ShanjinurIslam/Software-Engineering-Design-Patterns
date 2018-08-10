package OP;

/**
 * Created by Spondon on 22/05/2018.
 */
interface Storage {
    String getStorageSize() ;
}

class _128gb implements Storage {

    @Override
    public String getStorageSize() {
        return "Storage 128Gb";
    }
}

class _256gb implements Storage {

    @Override
    public String getStorageSize() {
        return "Storage 256Gb";
    }
}

class storageFactory{
    Storage getStorage(String s){
        if(s.equals("128")){
            return  new _128gb() ;
        }
        else if(s.equals("256")){
            return  new _256gb() ;
        }
        else{
            return null ;
        }
    }
}

