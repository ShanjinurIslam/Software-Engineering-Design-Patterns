package MacBook;

abstract class Model{
    String description ;

    String getDescription(){
        return description ;
    }

    abstract int getCost() ;
}

class MacBook extends Model{
    @Override
    String getDescription(){
        return "MacBook 12 inch " ;
    }

    @Override
    int getCost() {
        return 1299 ;
    }
}

class MacBookPro extends Model{
    @Override
    String getDescription(){
        return "MacBook 12 inch " ;
    }

    @Override
    int getCost() {
        return 1299 ;
    }
}

class MacBookAir extends Model{
    @Override
    String getDescription(){
        return "MacBook 12 inch " ;
    }

    @Override
    int getCost() {
        return 899 ;
    }
}




